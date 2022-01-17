package com.dnd.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanhao
 * @date 2022/1/17 11:22
 * @description 基础模块
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class CoreApplication {

    public static void main(String[] args) {
        log.info("{} , start app!",CoreApplication.class);
        SpringApplication.run(CoreApplication.class, args);
    }
}
