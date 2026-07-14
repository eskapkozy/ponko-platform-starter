package com.ponko.starter.observability.logging.contract;

public interface LogAggregator {

    void publish(LogEvent event);

}
