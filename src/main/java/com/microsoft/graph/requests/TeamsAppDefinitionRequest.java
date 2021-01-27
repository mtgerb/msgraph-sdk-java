// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition Request.
 */
public class TeamsAppDefinitionRequest extends BaseRequest<TeamsAppDefinition> {
	
    /**
     * The request for the TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppDefinition.class);
    }

    /**
     * Gets the TeamsAppDefinition from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppDefinition> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TeamsAppDefinition from the service
     *
     * @return the TeamsAppDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppDefinition> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TeamsAppDefinition delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamsAppDefinition with a source
     *
     * @param sourceTeamsAppDefinition the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppDefinition> patchAsync(@Nonnull final TeamsAppDefinition sourceTeamsAppDefinition) {
        return sendAsync(HttpMethod.PATCH, sourceTeamsAppDefinition);
    }

    /**
     * Patches this TeamsAppDefinition with a source
     *
     * @param sourceTeamsAppDefinition the source object with updates
     * @return the updated TeamsAppDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppDefinition patch(@Nonnull final TeamsAppDefinition sourceTeamsAppDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsAppDefinition);
    }

    /**
     * Creates a TeamsAppDefinition with a new object
     *
     * @param newTeamsAppDefinition the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppDefinition> postAsync(@Nonnull final TeamsAppDefinition newTeamsAppDefinition) {
        return sendAsync(HttpMethod.POST, newTeamsAppDefinition);
    }

    /**
     * Creates a TeamsAppDefinition with a new object
     *
     * @param newTeamsAppDefinition the new object to create
     * @return the created TeamsAppDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppDefinition post(@Nonnull final TeamsAppDefinition newTeamsAppDefinition) throws ClientException {
        return send(HttpMethod.POST, newTeamsAppDefinition);
    }

    /**
     * Creates a TeamsAppDefinition with a new object
     *
     * @param newTeamsAppDefinition the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppDefinition> putAsync(@Nonnull final TeamsAppDefinition newTeamsAppDefinition) {
        return sendAsync(HttpMethod.PUT, newTeamsAppDefinition);
    }

    /**
     * Creates a TeamsAppDefinition with a new object
     *
     * @param newTeamsAppDefinition the object to create/update
     * @return the created TeamsAppDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppDefinition put(@Nonnull final TeamsAppDefinition newTeamsAppDefinition) throws ClientException {
        return send(HttpMethod.PUT, newTeamsAppDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsAppDefinitionRequest select(@Nonnull final String value) {
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
     public TeamsAppDefinitionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
