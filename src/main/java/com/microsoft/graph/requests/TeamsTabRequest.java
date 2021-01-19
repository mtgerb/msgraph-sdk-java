// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsTab;
import com.microsoft.graph.requests.TeamsAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Tab Request.
 */
public class TeamsTabRequest extends BaseRequest<TeamsTab> {
	
    /**
     * The request for the TeamsTab
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsTabRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsTab.class);
    }

    /**
     * Gets the TeamsTab from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsTab> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TeamsTab from the service
     *
     * @return the TeamsTab from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsTab get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsTab> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TeamsTab delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamsTab with a source
     *
     * @param sourceTeamsTab the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsTab> patchAsync(@Nonnull final TeamsTab sourceTeamsTab) {
        return sendAsync(HttpMethod.PATCH, sourceTeamsTab);
    }

    /**
     * Patches this TeamsTab with a source
     *
     * @param sourceTeamsTab the source object with updates
     * @return the updated TeamsTab
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsTab patch(@Nonnull final TeamsTab sourceTeamsTab) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsTab);
    }

    /**
     * Creates a TeamsTab with a new object
     *
     * @param newTeamsTab the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsTab> postAsync(@Nonnull final TeamsTab newTeamsTab) {
        return sendAsync(HttpMethod.POST, newTeamsTab);
    }

    /**
     * Creates a TeamsTab with a new object
     *
     * @param newTeamsTab the new object to create
     * @return the created TeamsTab
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsTab post(@Nonnull final TeamsTab newTeamsTab) throws ClientException {
        return send(HttpMethod.POST, newTeamsTab);
    }

    /**
     * Creates a TeamsTab with a new object
     *
     * @param newTeamsTab the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsTab> putAsync(@Nonnull final TeamsTab newTeamsTab) {
        return sendAsync(HttpMethod.PUT, newTeamsTab);
    }

    /**
     * Creates a TeamsTab with a new object
     *
     * @param newTeamsTab the object to create/update
     * @return the created TeamsTab
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsTab put(@Nonnull final TeamsTab newTeamsTab) throws ClientException {
        return send(HttpMethod.PUT, newTeamsTab);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsTabRequest select(@Nonnull final String value) {
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
     public TeamsTabRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

