// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.CapabilitiesResponseInner;
import com.azure.resourcemanager.recoveryservices.models.CapabilitiesResponseProperties;
import com.azure.resourcemanager.recoveryservices.models.DnsZoneResponse;
import com.azure.resourcemanager.recoveryservices.models.VaultSubResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CapabilitiesResponseInnerTests {
    @Test
    public void testDeserialize() {
        CapabilitiesResponseInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"dnsZones\":[{\"requiredZoneNames\":[],\"subResource\":\"AzureBackup\"},{\"requiredZoneNames\":[],\"subResource\":\"AzureSiteRecovery\"}]},\"type\":\"jrwzox\"}")
                .toObject(CapabilitiesResponseInner.class);
        Assertions.assertEquals("jrwzox", model.type());
        Assertions.assertEquals(VaultSubResourceType.AZURE_BACKUP, model.properties().dnsZones().get(0).subResource());
    }

    @Test
    public void testSerialize() {
        CapabilitiesResponseInner model =
            new CapabilitiesResponseInner()
                .withType("jrwzox")
                .withProperties(
                    new CapabilitiesResponseProperties()
                        .withDnsZones(
                            Arrays
                                .asList(
                                    new DnsZoneResponse()
                                        .withSubResource(VaultSubResourceType.AZURE_BACKUP)
                                        .withRequiredZoneNames(Arrays.asList()),
                                    new DnsZoneResponse()
                                        .withSubResource(VaultSubResourceType.AZURE_SITE_RECOVERY)
                                        .withRequiredZoneNames(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(CapabilitiesResponseInner.class);
        Assertions.assertEquals("jrwzox", model.type());
        Assertions.assertEquals(VaultSubResourceType.AZURE_BACKUP, model.properties().dnsZones().get(0).subResource());
    }
}
