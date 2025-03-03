// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesInfraVnetProfileKubevirt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VirtualNetworksPropertiesInfraVnetProfileKubevirtTests {
    @Test
    public void testDeserialize() {
        VirtualNetworksPropertiesInfraVnetProfileKubevirt model =
            BinaryData
                .fromString("{\"vnetName\":\"df\"}")
                .toObject(VirtualNetworksPropertiesInfraVnetProfileKubevirt.class);
        Assertions.assertEquals("df", model.vnetName());
    }

    @Test
    public void testSerialize() {
        VirtualNetworksPropertiesInfraVnetProfileKubevirt model =
            new VirtualNetworksPropertiesInfraVnetProfileKubevirt().withVnetName("df");
        model = BinaryData.fromObject(model).toObject(VirtualNetworksPropertiesInfraVnetProfileKubevirt.class);
        Assertions.assertEquals("df", model.vnetName());
    }
}
