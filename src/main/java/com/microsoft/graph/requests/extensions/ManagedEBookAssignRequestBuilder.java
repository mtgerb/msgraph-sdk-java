// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedEBookAssignRequest;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignRequest;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Assign Request Builder.
 */
public class ManagedEBookAssignRequestBuilder extends BaseActionRequestBuilder implements IManagedEBookAssignRequestBuilder {

    /**
     * The request builder for this ManagedEBookAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param managedEBookAssignments the managedEBookAssignments
     */
    public ManagedEBookAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<ManagedEBookAssignment> managedEBookAssignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("managedEBookAssignments", managedEBookAssignments);
    }

    /**
     * Creates the IManagedEBookAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedEBookAssignRequest instance
     */
    public IManagedEBookAssignRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IManagedEBookAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedEBookAssignRequest instance
     */
    public IManagedEBookAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedEBookAssignRequest request = new ManagedEBookAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("managedEBookAssignments")) {
            request.body.managedEBookAssignments = getParameter("managedEBookAssignments");
        }

        return request;
    }
}
