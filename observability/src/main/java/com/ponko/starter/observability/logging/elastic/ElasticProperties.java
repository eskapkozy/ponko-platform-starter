package com.ponko.starter.observability.logging.elastic;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ponko.logging.elastic")
public class ElasticProperties {

    private boolean enabled = true;
    private String host = "localhost";
    private int port = 9200;
    private String scheme = "http";
    private String index = "ponko-logs";

    // Getters & Setters
}
