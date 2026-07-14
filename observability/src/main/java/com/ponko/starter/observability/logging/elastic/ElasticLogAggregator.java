package com.ponko.starter.observability.logging.elastic;

import com.ponko.starter.observability.logging.contract.LogAggregator;
import com.ponko.starter.observability.logging.contract.LogEvent;

public class ElasticLogAggregator implements LogAggregator {

    private final ElasticProperties properties;

    public ElasticLogAggregator(ElasticProperties properties) {
        this.properties = properties;
    }

    @Override
    public void publish(LogEvent event) {

        // TODO
        // Construire le document JSON
        // Envoyer vers Elasticsearch

    }
}
