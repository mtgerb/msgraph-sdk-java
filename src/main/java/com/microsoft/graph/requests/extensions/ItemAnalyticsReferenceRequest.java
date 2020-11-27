// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.requests.extensions.IItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityStatRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityStatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Analytics Reference Request.
 */
public class ItemAnalyticsReferenceRequest extends BaseRequest implements IItemAnalyticsReferenceRequest {

    /**
     * The request for the ItemAnalytics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemAnalyticsReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemAnalytics.class);
    }

    public void delete(final ICallback<? super ItemAnalytics> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ItemAnalytics delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemAnalyticsReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ItemAnalyticsReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemAnalyticsReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ItemAnalyticsReferenceRequest)this;
    }
    /**
     * Puts the ItemAnalytics
     *
     * @param srcItemAnalytics the ItemAnalytics reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ItemAnalytics srcItemAnalytics, final ICallback<? super ItemAnalytics> callback) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/ItemAnalyticss/" + srcItemAnalytics.id));
        send(HttpMethod.PUT, callback, payload);
    }

    /**
     * Puts the ItemAnalytics
     *
     * @param srcItemAnalytics the ItemAnalytics reference to PUT
     * @return the ItemAnalytics
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ItemAnalytics put(ItemAnalytics srcItemAnalytics) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/ItemAnalyticss/" + srcItemAnalytics.id));
        return send(HttpMethod.PUT, payload);
    }
}
