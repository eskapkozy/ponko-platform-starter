package com.ponko.starter.observability.tracing;


import io.micrometer.tracing.Tracer;

public class TraceContextProvider {

    private final Tracer tracer;

    public TraceContextProvider(Tracer tracer) {
        this.tracer = tracer;
    }

    public String traceId() {
        return tracer.currentSpan() != null
                ? tracer.currentSpan().context().traceId()
                : null;
    }

    public String spanId() {
        return tracer.currentSpan() != null
                ? tracer.currentSpan().context().spanId()
                : null;
    }
}
