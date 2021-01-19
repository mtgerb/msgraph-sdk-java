// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityProvider;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Request.
 */
public class IdentityProviderRequest extends BaseRequest<IdentityProvider> {
	
    /**
     * The request for the IdentityProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityProviderRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityProvider.class);
    }

    /**
     * Gets the IdentityProvider from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityProvider> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IdentityProvider from the service
     *
     * @return the IdentityProvider from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityProvider get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityProvider> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IdentityProvider delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IdentityProvider with a source
     *
     * @param sourceIdentityProvider the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityProvider> patchAsync(@Nonnull final IdentityProvider sourceIdentityProvider) {
        return sendAsync(HttpMethod.PATCH, sourceIdentityProvider);
    }

    /**
     * Patches this IdentityProvider with a source
     *
     * @param sourceIdentityProvider the source object with updates
     * @return the updated IdentityProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityProvider patch(@Nonnull final IdentityProvider sourceIdentityProvider) throws ClientException {
        return send(HttpMethod.PATCH, sourceIdentityProvider);
    }

    /**
     * Creates a IdentityProvider with a new object
     *
     * @param newIdentityProvider the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityProvider> postAsync(@Nonnull final IdentityProvider newIdentityProvider) {
        return sendAsync(HttpMethod.POST, newIdentityProvider);
    }

    /**
     * Creates a IdentityProvider with a new object
     *
     * @param newIdentityProvider the new object to create
     * @return the created IdentityProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityProvider post(@Nonnull final IdentityProvider newIdentityProvider) throws ClientException {
        return send(HttpMethod.POST, newIdentityProvider);
    }

    /**
     * Creates a IdentityProvider with a new object
     *
     * @param newIdentityProvider the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityProvider> putAsync(@Nonnull final IdentityProvider newIdentityProvider) {
        return sendAsync(HttpMethod.PUT, newIdentityProvider);
    }

    /**
     * Creates a IdentityProvider with a new object
     *
     * @param newIdentityProvider the object to create/update
     * @return the created IdentityProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityProvider put(@Nonnull final IdentityProvider newIdentityProvider) throws ClientException {
        return send(HttpMethod.PUT, newIdentityProvider);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IdentityProviderRequest select(@Nonnull final String value) {
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
     public IdentityProviderRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

