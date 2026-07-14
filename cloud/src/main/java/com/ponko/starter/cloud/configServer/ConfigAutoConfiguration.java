package com.ponko.starter.cloud.configServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@AutoConfiguration
@ConditionalOnClass(ConfigServicePropertySourceLocator.class)
public class ConfigAutoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(ConfigAutoConfiguration.class);

    @Bean
    ApplicationListener<ApplicationReadyEvent> configSourceLogger(Environment env) {
        return event -> log.info("Config chargée depuis: {}",
                env.getProperty("spring.cloud.config.uri", "discovery:config-server"));
    }
}
