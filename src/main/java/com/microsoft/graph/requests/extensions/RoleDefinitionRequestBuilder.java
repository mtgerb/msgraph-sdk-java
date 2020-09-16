// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.requests.extensions.IRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Definition Request Builder.
 */
public class RoleDefinitionRequestBuilder extends BaseRequestBuilder implements IRoleDefinitionRequestBuilder {

    /**
     * The request builder for the RoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleDefinitionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IRoleDefinitionRequest instance
     */
    public IRoleDefinitionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IRoleDefinitionRequest instance
     */
    public IRoleDefinitionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.RoleDefinitionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IRoleAssignmentCollectionRequestBuilder roleAssignments() {
        return new RoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments"), getClient(), null);
    }

    public IRoleAssignmentRequestBuilder roleAssignments(final String id) {
        return new RoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments") + "/" + id, getClient(), null);
    }
}
