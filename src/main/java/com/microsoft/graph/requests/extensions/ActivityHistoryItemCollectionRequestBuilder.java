// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.models.extensions.ActivityHistoryItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IActivityHistoryItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityHistoryItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityHistoryItemCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity History Item Collection Request Builder.
 */
public class ActivityHistoryItemCollectionRequestBuilder extends BaseRequestBuilder implements IActivityHistoryItemCollectionRequestBuilder {

    /**
     * The request builder for this collection of UserActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ActivityHistoryItemCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IActivityHistoryItemCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IActivityHistoryItemCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ActivityHistoryItemCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IActivityHistoryItemRequestBuilder byId(final String id) {
        return new ActivityHistoryItemRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
