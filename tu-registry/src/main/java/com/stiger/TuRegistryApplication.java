package com.stiger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YZ
 * @create 2019-03-30-13:37
 * @copy 本项目归本人私有, 未经许可, 不得擅用, 有违必究
 */
@SpringBootApplication
@EnableEurekaServer
public class TuRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(TuRegistryApplication.class, args);
    }
}
