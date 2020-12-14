package com.github.chain.core;

import lombok.SneakyThrows;
import org.springframework.lang.Nullable;
import org.springframework.util.FastByteArrayOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 石少东
 * @date 2020-10-14 12:32
 * @since 1.0
 */


public class ContentCachingResponseWrapper extends HttpServletResponseWrapper {

    private final byte[] responseBody = null;

    private final FastByteArrayOutputStream content = new FastByteArrayOutputStream(1024);

    private PrintWriter cachedWriter;
    private CharArrayWriter bufferedWriter;

    @Nullable
    private ServletOutputStream outputStream;

    @SneakyThrows
    public ContentCachingResponseWrapper(HttpServletResponse response) {
        super(response);
        bufferedWriter = new CharArrayWriter();
        cachedWriter = new PrintWriter(bufferedWriter);
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return cachedWriter;
    }

    public byte[] getResponseBody() {
        return bufferedWriter.toString().getBytes();
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        if (this.outputStream == null) {
            this.outputStream = new ResponseServletOutputStream(getResponse().getOutputStream());
        }
        return this.outputStream;
    }

    private class ResponseServletOutputStream extends ServletOutputStream {

        private final ServletOutputStream os;

        public ResponseServletOutputStream(ServletOutputStream os) {
            this.os = os;
        }

        @Override
        public void write(int b) throws IOException {
            content.write(b);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            content.write(b, off, len);
        }

        @Override
        public boolean isReady() {
            return this.os.isReady();
        }

        @Override
        public void setWriteListener(WriteListener writeListener) {
            this.os.setWriteListener(writeListener);
        }
    }

}
