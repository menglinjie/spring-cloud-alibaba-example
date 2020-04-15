package com.mlj.snapup.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * //使用@Service暴露服务
 * //使用@Reference引用服务
 * //
 * //使用@EnableDubbo开启注解Dubbo功能
 * //或者配置包扫描
 */
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
