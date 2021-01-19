// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AdministrativeUnit;
import com.microsoft.graph.requests.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit Request.
 */
public class AdministrativeUnitRequest extends BaseRequest<AdministrativeUnit> {
	
    /**
     * The request for the AdministrativeUnit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdministrativeUnitRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AdministrativeUnit.class);
    }

    /**
     * Gets the AdministrativeUnit from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnit> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AdministrativeUnit from the service
     *
     * @return the AdministrativeUnit from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AdministrativeUnit get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnit> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AdministrativeUnit delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AdministrativeUnit with a source
     *
     * @param sourceAdministrativeUnit the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnit> patchAsync(@Nonnull final AdministrativeUnit sourceAdministrativeUnit) {
        return sendAsync(HttpMethod.PATCH, sourceAdministrativeUnit);
    }

    /**
     * Patches this AdministrativeUnit with a source
     *
     * @param sourceAdministrativeUnit the source object with updates
     * @return the updated AdministrativeUnit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AdministrativeUnit patch(@Nonnull final AdministrativeUnit sourceAdministrativeUnit) throws ClientException {
        return send(HttpMethod.PATCH, sourceAdministrativeUnit);
    }

    /**
     * Creates a AdministrativeUnit with a new object
     *
     * @param newAdministrativeUnit the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnit> postAsync(@Nonnull final AdministrativeUnit newAdministrativeUnit) {
        return sendAsync(HttpMethod.POST, newAdministrativeUnit);
    }

    /**
     * Creates a AdministrativeUnit with a new object
     *
     * @param newAdministrativeUnit the new object to create
     * @return the created AdministrativeUnit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AdministrativeUnit post(@Nonnull final AdministrativeUnit newAdministrativeUnit) throws ClientException {
        return send(HttpMethod.POST, newAdministrativeUnit);
    }

    /**
     * Creates a AdministrativeUnit with a new object
     *
     * @param newAdministrativeUnit the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdministrativeUnit> putAsync(@Nonnull final AdministrativeUnit newAdministrativeUnit) {
        return sendAsync(HttpMethod.PUT, newAdministrativeUnit);
    }

    /**
     * Creates a AdministrativeUnit with a new object
     *
     * @param newAdministrativeUnit the object to create/update
     * @return the created AdministrativeUnit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AdministrativeUnit put(@Nonnull final AdministrativeUnit newAdministrativeUnit) throws ClientException {
        return send(HttpMethod.PUT, newAdministrativeUnit);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AdministrativeUnitRequest select(@Nonnull final String value) {
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
     public AdministrativeUnitRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

