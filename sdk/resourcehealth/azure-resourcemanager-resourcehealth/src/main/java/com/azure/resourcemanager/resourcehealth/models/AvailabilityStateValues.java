// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Impacted resource status of the resource. */
public final class AvailabilityStateValues extends ExpandableStringEnum<AvailabilityStateValues> {
    /** Static value Available for AvailabilityStateValues. */
    public static final AvailabilityStateValues AVAILABLE = fromString("Available");

    /** Static value Unavailable for AvailabilityStateValues. */
    public static final AvailabilityStateValues UNAVAILABLE = fromString("Unavailable");

    /** Static value Degraded for AvailabilityStateValues. */
    public static final AvailabilityStateValues DEGRADED = fromString("Degraded");

    /** Static value Unknown for AvailabilityStateValues. */
    public static final AvailabilityStateValues UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a AvailabilityStateValues from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AvailabilityStateValues.
     */
    @JsonCreator
    public static AvailabilityStateValues fromString(String name) {
        return fromString(name, AvailabilityStateValues.class);
    }

    /**
     * Gets known AvailabilityStateValues values.
     *
     * @return known AvailabilityStateValues values.
     */
    public static Collection<AvailabilityStateValues> values() {
        return values(AvailabilityStateValues.class);
    }
}
