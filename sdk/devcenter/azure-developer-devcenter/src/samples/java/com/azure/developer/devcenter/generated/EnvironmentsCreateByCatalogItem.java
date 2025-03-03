// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import com.azure.developer.devcenter.EnvironmentsClient;
import com.azure.developer.devcenter.EnvironmentsClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EnvironmentsCreateByCatalogItem {
    public static void main(String[] args) {
        EnvironmentsClient environmentsClient =
                new EnvironmentsClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .devCenter("ContosoDevCenter")
                        .devCenterDnsSuffix("devcenter.azure.com")
                        .tenantId("84fq37b9-22t3-t887-l09p-93241ngq0s95")
                        .buildClient();
        // BEGIN:com.azure.developer.devcenter.generated.environmentscreateorupdateenvironment.environmentscreatebycatalogitem
        BinaryData body =
                BinaryData.fromString(
                        "{\"description\":\"Personal Dev Environment\",\"catalogItemName\":\"helloworld\",\"catalogName\":\"main\",\"environmentType\":\"DevTest\",\"parameters\":{\"functionAppRuntime\":\"node\",\"storageAccountType\":\"Standard_LRS\"}}");
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                environmentsClient.beginCreateOrUpdateEnvironment(
                        "myProject", "me", "{environmentName}", body, requestOptions);
        // END:com.azure.developer.devcenter.generated.environmentscreateorupdateenvironment.environmentscreatebycatalogitem
    }
}
