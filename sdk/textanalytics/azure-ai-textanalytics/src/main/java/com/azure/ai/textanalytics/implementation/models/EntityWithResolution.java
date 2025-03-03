// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The EntityWithResolution model. */
@Fluent
public final class EntityWithResolution extends Entity {
    /*
     * The collection of entity resolution objects.
     */
    @JsonProperty(value = "resolutions")
    private List<BaseResolution> resolutions;

    /**
     * Get the resolutions property: The collection of entity resolution objects.
     *
     * @return the resolutions value.
     */
    public List<BaseResolution> getResolutions() {
        return this.resolutions;
    }

    /**
     * Set the resolutions property: The collection of entity resolution objects.
     *
     * @param resolutions the resolutions value to set.
     * @return the EntityWithResolution object itself.
     */
    public EntityWithResolution setResolutions(List<BaseResolution> resolutions) {
        this.resolutions = resolutions;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityWithResolution setText(String text) {
        super.setText(text);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityWithResolution setCategory(String category) {
        super.setCategory(category);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityWithResolution setSubcategory(String subcategory) {
        super.setSubcategory(subcategory);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityWithResolution setOffset(int offset) {
        super.setOffset(offset);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityWithResolution setLength(int length) {
        super.setLength(length);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityWithResolution setConfidenceScore(double confidenceScore) {
        super.setConfidenceScore(confidenceScore);
        return this;
    }
}
