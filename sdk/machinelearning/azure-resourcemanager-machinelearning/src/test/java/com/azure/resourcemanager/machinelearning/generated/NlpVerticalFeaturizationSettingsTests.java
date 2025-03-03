// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.NlpVerticalFeaturizationSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NlpVerticalFeaturizationSettingsTests {
    @Test
    public void testDeserialize() {
        NlpVerticalFeaturizationSettings model =
            BinaryData.fromString("{\"datasetLanguage\":\"ns\"}").toObject(NlpVerticalFeaturizationSettings.class);
        Assertions.assertEquals("ns", model.datasetLanguage());
    }

    @Test
    public void testSerialize() {
        NlpVerticalFeaturizationSettings model = new NlpVerticalFeaturizationSettings().withDatasetLanguage("ns");
        model = BinaryData.fromObject(model).toObject(NlpVerticalFeaturizationSettings.class);
        Assertions.assertEquals("ns", model.datasetLanguage());
    }
}
