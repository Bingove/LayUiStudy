package com.bingove.layui.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/13 0013下午 16:50
 * @title: ReadConfig
 * @ToDo
 */
public class ReadConfig {
    public static String ORG_NAME;
    public static String APP_NAME;
    public static final Logger logger = LoggerFactory.getLogger(ReadConfig.class);

    static {
        //InputStream inputStream = ReadConfig.class.getClassLoader().getResourceAsStream("application-my1.yml");
        InputStream inputStream = ReadConfig.class.getClassLoader().getResourceAsStream("config.properties");
        Properties prop = new Properties();
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        ORG_NAME = prop.getProperty("userName");
        APP_NAME = prop.getProperty("pwd");
    }

    public static void main(String[] args) {
        System.out.println(ORG_NAME);
        System.out.println(APP_NAME);
    }
}
