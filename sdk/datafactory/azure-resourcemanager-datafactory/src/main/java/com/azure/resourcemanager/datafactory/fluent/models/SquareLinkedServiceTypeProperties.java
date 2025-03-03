// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Square Service linked service properties. */
@Fluent
public final class SquareLinkedServiceTypeProperties {
    /*
     * Properties used to connect to Square. It is mutually exclusive with any other properties in the linked service.
     * Type: object.
     */
    @JsonProperty(value = "connectionProperties")
    private Object connectionProperties;

    /*
     * The URL of the Square instance. (i.e. mystore.mysquare.com)
     */
    @JsonProperty(value = "host")
    private Object host;

    /*
     * The client ID associated with your Square application.
     */
    @JsonProperty(value = "clientId")
    private Object clientId;

    /*
     * The client secret associated with your Square application.
     */
    @JsonProperty(value = "clientSecret")
    private SecretBase clientSecret;

    /*
     * The redirect URL assigned in the Square application dashboard. (i.e. http://localhost:2500)
     */
    @JsonProperty(value = "redirectUri")
    private Object redirectUri;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     */
    @JsonProperty(value = "useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true.
     */
    @JsonProperty(value = "useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     */
    @JsonProperty(value = "usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of SquareLinkedServiceTypeProperties class. */
    public SquareLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionProperties property: Properties used to connect to Square. It is mutually exclusive with any
     * other properties in the linked service. Type: object.
     *
     * @return the connectionProperties value.
     */
    public Object connectionProperties() {
        return this.connectionProperties;
    }

    /**
     * Set the connectionProperties property: Properties used to connect to Square. It is mutually exclusive with any
     * other properties in the linked service. Type: object.
     *
     * @param connectionProperties the connectionProperties value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withConnectionProperties(Object connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }

    /**
     * Get the host property: The URL of the Square instance. (i.e. mystore.mysquare.com).
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The URL of the Square instance. (i.e. mystore.mysquare.com).
     *
     * @param host the host value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the clientId property: The client ID associated with your Square application.
     *
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID associated with your Square application.
     *
     * @param clientId the clientId value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with your Square application.
     *
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret associated with your Square application.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the redirectUri property: The redirect URL assigned in the Square application dashboard. (i.e.
     * http://localhost:2500).
     *
     * @return the redirectUri value.
     */
    public Object redirectUri() {
        return this.redirectUri;
    }

    /**
     * Set the redirectUri property: The redirect URL assigned in the Square application dashboard. (i.e.
     * http://localhost:2500).
     *
     * @param redirectUri the redirectUri value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withRedirectUri(Object redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SquareLinkedServiceTypeProperties object itself.
     */
    public SquareLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientSecret() != null) {
            clientSecret().validate();
        }
    }
}
