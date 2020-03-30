package com.study.app.activitywork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude={org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class ActivityWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivityWorkApplication.class, args);
    }

}
