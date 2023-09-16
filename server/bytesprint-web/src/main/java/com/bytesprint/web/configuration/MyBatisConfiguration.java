package com.bytesprint.web.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatisConfiguration
 *
 * @author Eason Liu
 * Create at: 2023/9/10
 */
@Configuration
@MapperScan("com.bytesprint.infrastructure.mysql.mapper")
public class MyBatisConfiguration {
}
