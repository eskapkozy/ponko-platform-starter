package com.ponko.starter.observability.logging.elastic;

import com.ponko.starter.observability.logging.contract.LogAggregator;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(ElasticProperties.class)
public class ElasticAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(LogAggregator.class)
    public LogAggregator elasticLogAggregator(
            ElasticProperties properties) {

        return new ElasticLogAggregator(properties);
    }
}
