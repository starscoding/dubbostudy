package com.azxx.demon;

import com.alibaba.dubbo.config.spring.ServiceBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.azxx.demon.consumer")
public class ConsumerStarter {

    private static final Logger log = LoggerFactory.getLogger(ConsumerStarter.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumerStarter.class, args).getBeansOfType(ServiceBean.class);;
    }

    public void run(String... args) throws Exception {
        log.info("服务消费者启动完毕------>>启动完毕");
    }
}
