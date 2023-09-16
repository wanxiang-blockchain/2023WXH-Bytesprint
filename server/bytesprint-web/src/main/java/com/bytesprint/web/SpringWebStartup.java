package com.bytesprint.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.io.ClassPathResource;

import java.awt.*;
import java.net.URI;
import java.util.Objects;
import java.util.Properties;

/**
 * SpringWebStartup
 *
 * @author Eason Liu
 * Create at: 2023/9/9
 */
@Slf4j
@SuppressWarnings("all")
@SpringBootApplication(scanBasePackages = {"com.bytesprint.*"})
public class SpringWebStartup {
    public static void main(String[] args) {
        try {
            new SpringApplicationBuilder(SpringWebStartup.class).run(args);
            System.setProperty("java.awt.headless", "false");
            Desktop.getDesktop().browse(new URI("http://127.0.0.1:" + getPort()));
        } catch (Exception e) {
            log.error("Application started failed", e);
        }
    }

    private static String getPort() {
        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(new ClassPathResource("application.yml"));
        Properties properties = factoryBean.getObject();
        return Objects.toString(properties.get("server.port"));
    }
}
