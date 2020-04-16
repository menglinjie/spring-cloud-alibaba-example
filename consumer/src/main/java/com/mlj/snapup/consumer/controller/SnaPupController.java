package com.mlj.snapup.consumer.controller;

import com.mlj.snapup.commonapi.Dto.Result;
import com.mlj.snapup.commonapi.service.SnaPupService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author menglinjie
 * @date Created in 2020/4/15 14:27
 * @description:
 */
@RestController
@RequestMapping("/snaPup")
@RefreshScope
public class SnaPupController {

    @Reference
    private SnaPupService snaPupService;

    @Value("${user.name}")
    private String name;


    @GetMapping("/get")
    public Result get() {
        return snaPupService.get(name);
    }
}