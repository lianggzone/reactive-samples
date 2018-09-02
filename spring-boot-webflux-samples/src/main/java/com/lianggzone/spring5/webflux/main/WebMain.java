package com.lianggzone.spring5.webflux.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>概要:</h3><p>WebMain</p>
 * <h3>功能:</h3><p>WebMain</p>
 * <h3>履历:</h3>
 * <li>2018年5月20日</li>
 * @author 粱桂钊
 * @since 0.1
 */
@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.lianggzone.spring5.webflux" })
public class WebMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebMain.class, args);
    }
}