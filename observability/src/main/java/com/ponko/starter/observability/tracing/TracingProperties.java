package com.ponko.starter.observability.tracing;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ponko.tracing")
public class TracingProperties {

    private boolean enabled = true;

    // getters/setters

}
