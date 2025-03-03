// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of GovernanceRules. */
public interface GovernanceRules {
    /**
     * Get a list of all relevant governanceRules over a subscription level scope.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant governanceRules over a subscription level scope as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<GovernanceRule> list();

    /**
     * Get a list of all relevant governanceRules over a subscription level scope.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant governanceRules over a subscription level scope as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<GovernanceRule> list(Context context);
}
