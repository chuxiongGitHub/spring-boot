package com.rainbow;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.rainbow.mapper")
public class ServerApplication {
    private static Logger logger = LoggerFactory.getLogger(ServerApplication.class);

    public static void main(String[] args) {

        logger.info("正在启动spring boot入口");
        SpringApplication.run(ServerApplication.class, args);
    }
}
