// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devcenter.fluent.CatalogsClient;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogInner;
import com.azure.resourcemanager.devcenter.models.Catalog;
import com.azure.resourcemanager.devcenter.models.Catalogs;

public final class CatalogsImpl implements Catalogs {
    private static final ClientLogger LOGGER = new ClientLogger(CatalogsImpl.class);

    private final CatalogsClient innerClient;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    public CatalogsImpl(
        CatalogsClient innerClient, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Catalog> listByDevCenter(String resourceGroupName, String devCenterName) {
        PagedIterable<CatalogInner> inner = this.serviceClient().listByDevCenter(resourceGroupName, devCenterName);
        return Utils.mapPage(inner, inner1 -> new CatalogImpl(inner1, this.manager()));
    }

    public PagedIterable<Catalog> listByDevCenter(
        String resourceGroupName, String devCenterName, Integer top, Context context) {
        PagedIterable<CatalogInner> inner =
            this.serviceClient().listByDevCenter(resourceGroupName, devCenterName, top, context);
        return Utils.mapPage(inner, inner1 -> new CatalogImpl(inner1, this.manager()));
    }

    public Response<Catalog> getWithResponse(
        String resourceGroupName, String devCenterName, String catalogName, Context context) {
        Response<CatalogInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, devCenterName, catalogName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CatalogImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Catalog get(String resourceGroupName, String devCenterName, String catalogName) {
        CatalogInner inner = this.serviceClient().get(resourceGroupName, devCenterName, catalogName);
        if (inner != null) {
            return new CatalogImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String devCenterName, String catalogName) {
        this.serviceClient().delete(resourceGroupName, devCenterName, catalogName);
    }

    public void delete(String resourceGroupName, String devCenterName, String catalogName, Context context) {
        this.serviceClient().delete(resourceGroupName, devCenterName, catalogName, context);
    }

    public void sync(String resourceGroupName, String devCenterName, String catalogName) {
        this.serviceClient().sync(resourceGroupName, devCenterName, catalogName);
    }

    public void sync(String resourceGroupName, String devCenterName, String catalogName, Context context) {
        this.serviceClient().sync(resourceGroupName, devCenterName, catalogName, context);
    }

    public Catalog getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String devCenterName = Utils.getValueFromIdByName(id, "devcenters");
        if (devCenterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'devcenters'.", id)));
        }
        String catalogName = Utils.getValueFromIdByName(id, "catalogs");
        if (catalogName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'catalogs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, devCenterName, catalogName, Context.NONE).getValue();
    }

    public Response<Catalog> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String devCenterName = Utils.getValueFromIdByName(id, "devcenters");
        if (devCenterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'devcenters'.", id)));
        }
        String catalogName = Utils.getValueFromIdByName(id, "catalogs");
        if (catalogName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'catalogs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, devCenterName, catalogName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String devCenterName = Utils.getValueFromIdByName(id, "devcenters");
        if (devCenterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'devcenters'.", id)));
        }
        String catalogName = Utils.getValueFromIdByName(id, "catalogs");
        if (catalogName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'catalogs'.", id)));
        }
        this.delete(resourceGroupName, devCenterName, catalogName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String devCenterName = Utils.getValueFromIdByName(id, "devcenters");
        if (devCenterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'devcenters'.", id)));
        }
        String catalogName = Utils.getValueFromIdByName(id, "catalogs");
        if (catalogName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'catalogs'.", id)));
        }
        this.delete(resourceGroupName, devCenterName, catalogName, context);
    }

    private CatalogsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    public CatalogImpl define(String name) {
        return new CatalogImpl(name, this.manager());
    }
}
