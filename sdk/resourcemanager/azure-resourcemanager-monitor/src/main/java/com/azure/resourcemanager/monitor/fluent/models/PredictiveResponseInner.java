// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.models.PredictiveValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** The response to a metrics query. */
@Fluent
public final class PredictiveResponseInner {
    /*
     * The timespan for which the data was retrieved. Its value consists of two datetimes concatenated, separated by
     * '/'.  This may be adjusted in the future and returned back from what was originally requested.
     */
    @JsonProperty(value = "timespan")
    private String timespan;

    /*
     * The interval (window size) for which the metric data was returned in.  This may be adjusted in the future and
     * returned back from what was originally requested.  This is not present if a metadata request was made.
     */
    @JsonProperty(value = "interval")
    private Duration interval;

    /*
     * The metrics being queried
     */
    @JsonProperty(value = "metricName")
    private String metricName;

    /*
     * resource of the predictive metric.
     */
    @JsonProperty(value = "targetResourceId")
    private String targetResourceId;

    /*
     * the value of the collection.
     */
    @JsonProperty(value = "data")
    private List<PredictiveValue> data;

    /**
     * Get the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes
     * concatenated, separated by '/'. This may be adjusted in the future and returned back from what was originally
     * requested.
     *
     * @return the timespan value.
     */
    public String timespan() {
        return this.timespan;
    }

    /**
     * Set the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes
     * concatenated, separated by '/'. This may be adjusted in the future and returned back from what was originally
     * requested.
     *
     * @param timespan the timespan value to set.
     * @return the PredictiveResponseInner object itself.
     */
    public PredictiveResponseInner withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * Get the interval property: The interval (window size) for which the metric data was returned in. This may be
     * adjusted in the future and returned back from what was originally requested. This is not present if a metadata
     * request was made.
     *
     * @return the interval value.
     */
    public Duration interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval (window size) for which the metric data was returned in. This may be
     * adjusted in the future and returned back from what was originally requested. This is not present if a metadata
     * request was made.
     *
     * @param interval the interval value to set.
     * @return the PredictiveResponseInner object itself.
     */
    public PredictiveResponseInner withInterval(Duration interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the metricName property: The metrics being queried.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: The metrics being queried.
     *
     * @param metricName the metricName value to set.
     * @return the PredictiveResponseInner object itself.
     */
    public PredictiveResponseInner withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the targetResourceId property: resource of the predictive metric.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: resource of the predictive metric.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the PredictiveResponseInner object itself.
     */
    public PredictiveResponseInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the data property: the value of the collection.
     *
     * @return the data value.
     */
    public List<PredictiveValue> data() {
        return this.data;
    }

    /**
     * Set the data property: the value of the collection.
     *
     * @param data the data value to set.
     * @return the PredictiveResponseInner object itself.
     */
    public PredictiveResponseInner withData(List<PredictiveValue> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }
}
