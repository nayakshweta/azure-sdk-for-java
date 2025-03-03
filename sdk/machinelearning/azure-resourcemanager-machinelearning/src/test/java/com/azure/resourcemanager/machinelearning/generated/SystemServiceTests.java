// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.SystemService;
import org.junit.jupiter.api.Test;

public final class SystemServiceTests {
    @Test
    public void testDeserialize() {
        SystemService model =
            BinaryData
                .fromString(
                    "{\"systemServiceType\":\"gcgbjb\",\"publicIpAddress\":\"lfgtdysnaquflqbc\",\"version\":\"hamzjrwdkqze\"}")
                .toObject(SystemService.class);
    }

    @Test
    public void testSerialize() {
        SystemService model = new SystemService();
        model = BinaryData.fromObject(model).toObject(SystemService.class);
    }
}
