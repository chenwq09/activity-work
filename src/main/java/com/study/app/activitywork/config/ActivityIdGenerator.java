package com.study.app.activitywork.config;

import com.study.app.activitywork.utils.UUIDUitl;
import org.activiti.engine.impl.cfg.IdGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenqi.chen, <wenqi.chen@leyantech.com>
 * @Description:
 * @date 2020-03-26
 */
public class ActivityIdGenerator implements IdGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActivityIdGenerator.class);

    @Override
    public String getNextId() {
        return UUIDUitl.uuid();
    }
}
