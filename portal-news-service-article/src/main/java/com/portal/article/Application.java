package com.portal.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.portal.article.mapper")
@ComponentScan(basePackages = {"com.portal", "org.n3r.idworker"})
//@EnableEurekaClient
//@RibbonClient(name = "SERVICE-USER", configuration = MyRule.class)
//@EnableFeignClients({"com.portal"})
//@EnableHystrix
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
