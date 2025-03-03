// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.models.AclAction;
import com.azure.resourcemanager.signalr.models.ManagedIdentityType;
import com.azure.resourcemanager.signalr.models.ServiceKind;
import com.azure.resourcemanager.signalr.models.SignalRResource;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SignalRsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"wj\",\"tier\":\"Free\",\"size\":\"kacjvefkdlfo\",\"family\":\"ggkfpagaowpul\",\"capacity\":1177485669},\"properties\":{\"provisioningState\":\"Updating\",\"externalIP\":\"yxkqjnsjer\",\"hostName\":\"iagxsdszuempsbz\",\"publicPort\":71389459,\"serverPort\":1389741266,\"version\":\"v\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"tls\":{\"clientCertEnabled\":true},\"hostNamePrefix\":\"kjj\",\"features\":[],\"liveTraceConfiguration\":{\"enabled\":\"uukzclewyhmlw\",\"categories\":[]},\"resourceLogConfiguration\":{\"categories\":[]},\"cors\":{\"allowedOrigins\":[]},\"serverless\":{\"connectionTimeoutInSeconds\":1158924531},\"upstream\":{\"templates\":[]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"privateEndpoints\":[]},\"publicNetworkAccess\":\"whxxbuyqax\",\"disableLocalAuth\":false,\"disableAadAuth\":true},\"kind\":\"SignalR\",\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{},\"principalId\":\"or\",\"tenantId\":\"lt\"},\"location\":\"mncwsobqwcsdb\",\"tags\":{\"ucqdpfuvglsb\":\"cf\",\"cormr\":\"jcanvxbvtvudut\",\"f\":\"xqtvcofu\"},\"id\":\"vkg\",\"name\":\"u\",\"type\":\"gdknnqv\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        SignalRManager manager =
            SignalRManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SignalRResource response =
            manager.signalRs().getByResourceGroupWithResponse("emmsbvdkc", "odtji", Context.NONE).getValue();

        Assertions.assertEquals("mncwsobqwcsdb", response.location());
        Assertions.assertEquals("cf", response.tags().get("ucqdpfuvglsb"));
        Assertions.assertEquals("wj", response.sku().name());
        Assertions.assertEquals(SignalRSkuTier.FREE, response.sku().tier());
        Assertions.assertEquals(1177485669, response.sku().capacity());
        Assertions.assertEquals(ServiceKind.SIGNALR, response.kind());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(true, response.tls().clientCertEnabled());
        Assertions.assertEquals("uukzclewyhmlw", response.liveTraceConfiguration().enabled());
        Assertions.assertEquals(1158924531, response.serverless().connectionTimeoutInSeconds());
        Assertions.assertEquals(AclAction.DENY, response.networkACLs().defaultAction());
        Assertions.assertEquals("whxxbuyqax", response.publicNetworkAccess());
        Assertions.assertEquals(false, response.disableLocalAuth());
        Assertions.assertEquals(true, response.disableAadAuth());
    }
}
