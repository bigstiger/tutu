package com.stiger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author YZ
 * @create 2019-03-30-13:49
 * @copy 本项目归本人私有, 未经许可, 不得擅用, 有违必究
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableZuulProxy
public class TuApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(TuApiGatewayApplication.class, args);
    }
}
