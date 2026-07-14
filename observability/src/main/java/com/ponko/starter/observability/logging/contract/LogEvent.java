package com.ponko.starter.observability.logging.contract;

public class LogEvent {

    private String timestamp;
    private String level;
    private String serviceName;
    private String domainName;
    private String instanceId;

    private String correlationId;
    private String traceId;
    private String spanId;

    private String logger;
    private String thread;
    private String message;

}
