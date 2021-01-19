// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OfficeGraphInsights;
import com.microsoft.graph.requests.SharedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.SharedInsightRequestBuilder;
import com.microsoft.graph.requests.TrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.TrendingRequestBuilder;
import com.microsoft.graph.requests.UsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.UsedInsightRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Graph Insights Request.
 */
public class OfficeGraphInsightsRequest extends BaseRequest<OfficeGraphInsights> {
	
    /**
     * The request for the OfficeGraphInsights
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfficeGraphInsightsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OfficeGraphInsights.class);
    }

    /**
     * Gets the OfficeGraphInsights from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfficeGraphInsights> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OfficeGraphInsights from the service
     *
     * @return the OfficeGraphInsights from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfficeGraphInsights get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfficeGraphInsights> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OfficeGraphInsights delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OfficeGraphInsights with a source
     *
     * @param sourceOfficeGraphInsights the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfficeGraphInsights> patchAsync(@Nonnull final OfficeGraphInsights sourceOfficeGraphInsights) {
        return sendAsync(HttpMethod.PATCH, sourceOfficeGraphInsights);
    }

    /**
     * Patches this OfficeGraphInsights with a source
     *
     * @param sourceOfficeGraphInsights the source object with updates
     * @return the updated OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfficeGraphInsights patch(@Nonnull final OfficeGraphInsights sourceOfficeGraphInsights) throws ClientException {
        return send(HttpMethod.PATCH, sourceOfficeGraphInsights);
    }

    /**
     * Creates a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfficeGraphInsights> postAsync(@Nonnull final OfficeGraphInsights newOfficeGraphInsights) {
        return sendAsync(HttpMethod.POST, newOfficeGraphInsights);
    }

    /**
     * Creates a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the new object to create
     * @return the created OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfficeGraphInsights post(@Nonnull final OfficeGraphInsights newOfficeGraphInsights) throws ClientException {
        return send(HttpMethod.POST, newOfficeGraphInsights);
    }

    /**
     * Creates a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfficeGraphInsights> putAsync(@Nonnull final OfficeGraphInsights newOfficeGraphInsights) {
        return sendAsync(HttpMethod.PUT, newOfficeGraphInsights);
    }

    /**
     * Creates a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the object to create/update
     * @return the created OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfficeGraphInsights put(@Nonnull final OfficeGraphInsights newOfficeGraphInsights) throws ClientException {
        return send(HttpMethod.PUT, newOfficeGraphInsights);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OfficeGraphInsightsRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public OfficeGraphInsightsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

