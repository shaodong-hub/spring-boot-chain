//package com.github.chain.core;
//
//import lombok.SneakyThrows;
//import org.springframework.util.StreamUtils;
//import org.springframework.web.util.ContentCachingRequestWrapper;
//
//import javax.servlet.ServletInputStream;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequestWrapper;
//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.util.Objects;
//
///**
// * @author 石少东
// * @date 2020-10-14 10:57
// * @since 1.0
// */
//
//
//public class ChainHttpServletRequestWrapper extends HttpServletRequestWrapper {
//
//    private final byte[] requestBody;
//
//    private final HttpServletRequest request;
//
//    @SneakyThrows
//    public ChainHttpServletRequestWrapper(HttpServletRequest request) {
//        super(request);
//        this.request = request;
//        this.requestBody = StreamUtils.copyToByteArray(request.getInputStream());
//    }
//
//    public byte[] getRequestBody() {
//        return requestBody;
//    }
//
//    @Override
//    public ServletInputStream getInputStream() throws IOException {
//        ContentCachingRequestWrapper cachingRequestWrapper = new ContentCachingRequestWrapper(request);
//        cachingRequestWrapper.getContentAsByteArray()
//
//        return Objects.isNull(requestBody) ? new ByteArrayInputStream(new byte[0]) : getServletInputStream();
//    }
//
//    @Override
//    public BufferedReader getReader() throws IOException {
//        return super.getReader();
//    }
//
//    private ServletInputStream getServletInputStream() {
//
//    }
//
//
//}
