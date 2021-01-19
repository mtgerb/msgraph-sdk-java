// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OnenoteResource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Resource Request.
 */
public class OnenoteResourceRequest extends BaseRequest<OnenoteResource> {
	
    /**
     * The request for the OnenoteResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteResourceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteResource.class);
    }

    /**
     * Gets the OnenoteResource from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteResource> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OnenoteResource from the service
     *
     * @return the OnenoteResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteResource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteResource> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OnenoteResource delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OnenoteResource with a source
     *
     * @param sourceOnenoteResource the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteResource> patchAsync(@Nonnull final OnenoteResource sourceOnenoteResource) {
        return sendAsync(HttpMethod.PATCH, sourceOnenoteResource);
    }

    /**
     * Patches this OnenoteResource with a source
     *
     * @param sourceOnenoteResource the source object with updates
     * @return the updated OnenoteResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteResource patch(@Nonnull final OnenoteResource sourceOnenoteResource) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteResource);
    }

    /**
     * Creates a OnenoteResource with a new object
     *
     * @param newOnenoteResource the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteResource> postAsync(@Nonnull final OnenoteResource newOnenoteResource) {
        return sendAsync(HttpMethod.POST, newOnenoteResource);
    }

    /**
     * Creates a OnenoteResource with a new object
     *
     * @param newOnenoteResource the new object to create
     * @return the created OnenoteResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteResource post(@Nonnull final OnenoteResource newOnenoteResource) throws ClientException {
        return send(HttpMethod.POST, newOnenoteResource);
    }

    /**
     * Creates a OnenoteResource with a new object
     *
     * @param newOnenoteResource the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteResource> putAsync(@Nonnull final OnenoteResource newOnenoteResource) {
        return sendAsync(HttpMethod.PUT, newOnenoteResource);
    }

    /**
     * Creates a OnenoteResource with a new object
     *
     * @param newOnenoteResource the object to create/update
     * @return the created OnenoteResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteResource put(@Nonnull final OnenoteResource newOnenoteResource) throws ClientException {
        return send(HttpMethod.PUT, newOnenoteResource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnenoteResourceRequest select(@Nonnull final String value) {
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
     public OnenoteResourceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

