// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DefaultManagedAppProtection;
import com.microsoft.graph.requests.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.ManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Default Managed App Protection Request.
 */
public class DefaultManagedAppProtectionRequest extends BaseRequest<DefaultManagedAppProtection> {
	
    /**
     * The request for the DefaultManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DefaultManagedAppProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DefaultManagedAppProtection.class);
    }

    /**
     * Gets the DefaultManagedAppProtection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DefaultManagedAppProtection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DefaultManagedAppProtection from the service
     *
     * @return the DefaultManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DefaultManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DefaultManagedAppProtection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DefaultManagedAppProtection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DefaultManagedAppProtection with a source
     *
     * @param sourceDefaultManagedAppProtection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DefaultManagedAppProtection> patchAsync(@Nonnull final DefaultManagedAppProtection sourceDefaultManagedAppProtection) {
        return sendAsync(HttpMethod.PATCH, sourceDefaultManagedAppProtection);
    }

    /**
     * Patches this DefaultManagedAppProtection with a source
     *
     * @param sourceDefaultManagedAppProtection the source object with updates
     * @return the updated DefaultManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DefaultManagedAppProtection patch(@Nonnull final DefaultManagedAppProtection sourceDefaultManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceDefaultManagedAppProtection);
    }

    /**
     * Creates a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DefaultManagedAppProtection> postAsync(@Nonnull final DefaultManagedAppProtection newDefaultManagedAppProtection) {
        return sendAsync(HttpMethod.POST, newDefaultManagedAppProtection);
    }

    /**
     * Creates a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the new object to create
     * @return the created DefaultManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DefaultManagedAppProtection post(@Nonnull final DefaultManagedAppProtection newDefaultManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newDefaultManagedAppProtection);
    }

    /**
     * Creates a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DefaultManagedAppProtection> putAsync(@Nonnull final DefaultManagedAppProtection newDefaultManagedAppProtection) {
        return sendAsync(HttpMethod.PUT, newDefaultManagedAppProtection);
    }

    /**
     * Creates a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the object to create/update
     * @return the created DefaultManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DefaultManagedAppProtection put(@Nonnull final DefaultManagedAppProtection newDefaultManagedAppProtection) throws ClientException {
        return send(HttpMethod.PUT, newDefaultManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DefaultManagedAppProtectionRequest select(@Nonnull final String value) {
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
     public DefaultManagedAppProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

