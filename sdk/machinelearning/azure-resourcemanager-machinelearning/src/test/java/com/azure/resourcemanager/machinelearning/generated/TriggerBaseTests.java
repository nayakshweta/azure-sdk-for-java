// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.TriggerBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TriggerBaseTests {
    @Test
    public void testDeserialize() {
        TriggerBase model =
            BinaryData
                .fromString(
                    "{\"triggerType\":\"TriggerBase\",\"endTime\":\"plucfotangcfhnyk\",\"startTime\":\"ugswvx\",\"timeZone\":\"mzqwmvtxnjmxmcu\"}")
                .toObject(TriggerBase.class);
        Assertions.assertEquals("plucfotangcfhnyk", model.endTime());
        Assertions.assertEquals("ugswvx", model.startTime());
        Assertions.assertEquals("mzqwmvtxnjmxmcu", model.timeZone());
    }

    @Test
    public void testSerialize() {
        TriggerBase model =
            new TriggerBase().withEndTime("plucfotangcfhnyk").withStartTime("ugswvx").withTimeZone("mzqwmvtxnjmxmcu");
        model = BinaryData.fromObject(model).toObject(TriggerBase.class);
        Assertions.assertEquals("plucfotangcfhnyk", model.endTime());
        Assertions.assertEquals("ugswvx", model.startTime());
        Assertions.assertEquals("mzqwmvtxnjmxmcu", model.timeZone());
    }
}
