package com.ponko.starter.observability.tracing;

import io.micrometer.tracing.Tracer;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(TracingProperties.class)
@ConditionalOnClass(Tracer.class)
public class TracingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TraceContextProvider traceContextProvider(Tracer tracer) {
        return new TraceContextProvider(tracer);
    }

}