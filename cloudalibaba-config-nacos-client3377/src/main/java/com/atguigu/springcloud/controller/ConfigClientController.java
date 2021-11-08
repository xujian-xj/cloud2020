package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xj
 * @date 2021/11/6下午 10:39
 * @description:
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能。
@Slf4j
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        log.info(configInfo);
        return configInfo;
    }
}
