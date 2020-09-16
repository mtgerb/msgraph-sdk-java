// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.models.extensions.PlannerTask;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task Collection Request Builder.
 */
public class PlannerTaskCollectionRequestBuilder extends BaseRequestBuilder implements IPlannerTaskCollectionRequestBuilder {

    /**
     * The request builder for this collection of PlannerPlan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerTaskCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPlannerTaskCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPlannerTaskCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PlannerTaskCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPlannerTaskRequestBuilder byId(final String id) {
        return new PlannerTaskRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
