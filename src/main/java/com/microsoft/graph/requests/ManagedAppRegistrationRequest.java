// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedAppRegistration;
import com.microsoft.graph.requests.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.ManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Request.
 */
public class ManagedAppRegistrationRequest extends BaseRequest<ManagedAppRegistration> {
	
    /**
     * The request for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedAppRegistrationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedAppRegistration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistration.class);
    }

    /**
     * Gets the ManagedAppRegistration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppRegistration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedAppRegistration from the service
     *
     * @return the ManagedAppRegistration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppRegistration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppRegistration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedAppRegistration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedAppRegistration with a source
     *
     * @param sourceManagedAppRegistration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppRegistration> patchAsync(@Nonnull final ManagedAppRegistration sourceManagedAppRegistration) {
        return sendAsync(HttpMethod.PATCH, sourceManagedAppRegistration);
    }

    /**
     * Patches this ManagedAppRegistration with a source
     *
     * @param sourceManagedAppRegistration the source object with updates
     * @return the updated ManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppRegistration patch(@Nonnull final ManagedAppRegistration sourceManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppRegistration);
    }

    /**
     * Creates a ManagedAppRegistration with a new object
     *
     * @param newManagedAppRegistration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppRegistration> postAsync(@Nonnull final ManagedAppRegistration newManagedAppRegistration) {
        return sendAsync(HttpMethod.POST, newManagedAppRegistration);
    }

    /**
     * Creates a ManagedAppRegistration with a new object
     *
     * @param newManagedAppRegistration the new object to create
     * @return the created ManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppRegistration post(@Nonnull final ManagedAppRegistration newManagedAppRegistration) throws ClientException {
        return send(HttpMethod.POST, newManagedAppRegistration);
    }

    /**
     * Creates a ManagedAppRegistration with a new object
     *
     * @param newManagedAppRegistration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppRegistration> putAsync(@Nonnull final ManagedAppRegistration newManagedAppRegistration) {
        return sendAsync(HttpMethod.PUT, newManagedAppRegistration);
    }

    /**
     * Creates a ManagedAppRegistration with a new object
     *
     * @param newManagedAppRegistration the object to create/update
     * @return the created ManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppRegistration put(@Nonnull final ManagedAppRegistration newManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppRegistration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedAppRegistrationRequest select(@Nonnull final String value) {
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
     public ManagedAppRegistrationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

