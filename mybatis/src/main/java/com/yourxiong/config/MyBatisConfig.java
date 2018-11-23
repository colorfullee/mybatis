package com.yourxiong.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yourxiong.dao")
public class MyBatisConfig {

}
