package com.gs.rpc.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.setting.dialect.Props;

/**
 * 框架配置工具类，读取配置文件并返回配置对象
 * @program: rpc
 * @description:
 * @author: lydms
 * @create: 2024-04-02 17:15
 **/
public class ConfigUtils {

    /**
    * 加载配置对象
    * @Param: [tClass, prefix]
    * @return: T
    * @Date: 2024/4/2
    */
    public static <T> T loadConfig(Class<T> tClass,String prefix) {
        return loadConfig(tClass,prefix,"");
    }

    /**
    * 加载配置对象，支持区分环境 application-dev.properties
    * @Param: [tClass, environment]
    * @return: T
    * @Date: 2024/4/2
    */
    public static <T> T loadConfig(Class<T> tClass,String prefix,String environment) {
        StringBuilder configFileBuilder = new StringBuilder("application");
        if (StrUtil.isNotBlank(environment)) {
            configFileBuilder.append("-").append(environment);
        }
        configFileBuilder.append(".properties");
        Props props = new Props(configFileBuilder.toString());
        return props.toBean(tClass,prefix);
    }

}