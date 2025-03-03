// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.QueueScaleRule;
import com.azure.resourcemanager.appcontainers.models.ScaleRuleAuth;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class QueueScaleRuleTests {
    @Test
    public void testDeserialize() {
        QueueScaleRule model =
            BinaryData
                .fromString(
                    "{\"queueName\":\"bqwcsdbnwdcf\",\"queueLength\":1857074792,\"auth\":[{\"secretRef\":\"fuvglsbjjca\",\"triggerParameter\":\"xbvtvudu\"},{\"secretRef\":\"cormr\",\"triggerParameter\":\"qtvcofudflvkgj\"}]}")
                .toObject(QueueScaleRule.class);
        Assertions.assertEquals("bqwcsdbnwdcf", model.queueName());
        Assertions.assertEquals(1857074792, model.queueLength());
        Assertions.assertEquals("fuvglsbjjca", model.auth().get(0).secretRef());
        Assertions.assertEquals("xbvtvudu", model.auth().get(0).triggerParameter());
    }

    @Test
    public void testSerialize() {
        QueueScaleRule model =
            new QueueScaleRule()
                .withQueueName("bqwcsdbnwdcf")
                .withQueueLength(1857074792)
                .withAuth(
                    Arrays
                        .asList(
                            new ScaleRuleAuth().withSecretRef("fuvglsbjjca").withTriggerParameter("xbvtvudu"),
                            new ScaleRuleAuth().withSecretRef("cormr").withTriggerParameter("qtvcofudflvkgj")));
        model = BinaryData.fromObject(model).toObject(QueueScaleRule.class);
        Assertions.assertEquals("bqwcsdbnwdcf", model.queueName());
        Assertions.assertEquals(1857074792, model.queueLength());
        Assertions.assertEquals("fuvglsbjjca", model.auth().get(0).secretRef());
        Assertions.assertEquals("xbvtvudu", model.auth().get(0).triggerParameter());
    }
}
