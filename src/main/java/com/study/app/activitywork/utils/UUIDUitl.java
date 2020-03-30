package com.study.app.activitywork.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * @author wenqi.chen, <wenqi.chen@leyantech.com>
 * @Description: UUID工具类
 * @date 2020-03-26
 */
public class UUIDUitl {

    private static final Logger LOGGER = LoggerFactory.getLogger(UUIDUitl.class);

    /**
     * 获取UUID
     * @return
     */
    public static String uuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
