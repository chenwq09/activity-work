package com.study.app.activitywork.config;

import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

/**
 * @author wenqi.chen, <wenqi.chen@leyantech.com>
 * @Description:
 * @date 2020-03-26
 */
@Configuration
public class ActivityConfig implements ProcessEngineConfigurationConfigurer {

    @Override
    public void configure(SpringProcessEngineConfiguration springProcessEngineConfiguration) {
        springProcessEngineConfiguration.setIdGenerator(new ActivityIdGenerator());
    }
}
