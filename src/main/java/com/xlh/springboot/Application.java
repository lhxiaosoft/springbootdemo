package com.xlh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

// @EnableAutoConfiguration注解的作用   是让 SpringBoot来“猜测” 如何配置 Spring。猜测的依据很简单，就是根据依赖的 jar包。
// 因为在我们的依赖中，包含了 Tomcat和SpringMvc ，因此SpringBoot的自动配置机制就会认为这是一个 web应用
@EnableAutoConfiguration
// @ComponentScan注解的作用   类似于我们在spring的xml配置文件中的base-package的作用
// 扫描并使对应的注解生效
@ComponentScan
// ImportResource注解的作用   导入xml配置文件
@ImportResource (value={"applicationContext.xml" })


// SpringBootApplication注解相当于同时添加 @EnableAutoConfiguration @ComponentScan  @Configuration
//@SpringBootApplication
public class Application {
     public static void main(String[] args) {
       SpringApplication.run(Application. class, args );
    }
}


