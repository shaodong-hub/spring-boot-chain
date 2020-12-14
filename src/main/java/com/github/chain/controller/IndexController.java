package com.github.chain.controller;

import com.github.chain.exception.ChainException;
import com.github.chain.pojo.DataDTO;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 石少东
 * @date 2020-10-12 15:21
 * @since 1.0
 */

@Slf4j
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(HttpServletRequest request,DataDTO data) {
        return "index";
    }

    @PostMapping("/index")
    public String index(@NotNull @Validated @RequestBody DataDTO data) throws ChainException {
        log.info("IndexController - {}", data.toString());
//        throw new ChainException("12");
        return "index - " + data.getUsername();
    }

}
