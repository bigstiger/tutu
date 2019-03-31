package com.stiger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YZ
 * @create 2019-03-30-14:08
 * @copy 本项目归本人私有, 未经许可, 不得擅用, 有违必究
 */
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
@EnableDiscoveryClient
public class TuItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TuItemServiceApplication.class, args);
    }
}
