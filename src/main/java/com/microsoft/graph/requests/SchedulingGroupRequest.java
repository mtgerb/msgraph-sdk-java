// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SchedulingGroup;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Scheduling Group Request.
 */
public class SchedulingGroupRequest extends BaseRequest<SchedulingGroup> {
	
    /**
     * The request for the SchedulingGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SchedulingGroupRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SchedulingGroup.class);
    }

    /**
     * Gets the SchedulingGroup from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SchedulingGroup> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SchedulingGroup from the service
     *
     * @return the SchedulingGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SchedulingGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SchedulingGroup> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SchedulingGroup delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SchedulingGroup with a source
     *
     * @param sourceSchedulingGroup the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SchedulingGroup> patchAsync(@Nonnull final SchedulingGroup sourceSchedulingGroup) {
        return sendAsync(HttpMethod.PATCH, sourceSchedulingGroup);
    }

    /**
     * Patches this SchedulingGroup with a source
     *
     * @param sourceSchedulingGroup the source object with updates
     * @return the updated SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SchedulingGroup patch(@Nonnull final SchedulingGroup sourceSchedulingGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceSchedulingGroup);
    }

    /**
     * Creates a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SchedulingGroup> postAsync(@Nonnull final SchedulingGroup newSchedulingGroup) {
        return sendAsync(HttpMethod.POST, newSchedulingGroup);
    }

    /**
     * Creates a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the new object to create
     * @return the created SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SchedulingGroup post(@Nonnull final SchedulingGroup newSchedulingGroup) throws ClientException {
        return send(HttpMethod.POST, newSchedulingGroup);
    }

    /**
     * Creates a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SchedulingGroup> putAsync(@Nonnull final SchedulingGroup newSchedulingGroup) {
        return sendAsync(HttpMethod.PUT, newSchedulingGroup);
    }

    /**
     * Creates a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the object to create/update
     * @return the created SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SchedulingGroup put(@Nonnull final SchedulingGroup newSchedulingGroup) throws ClientException {
        return send(HttpMethod.PUT, newSchedulingGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SchedulingGroupRequest select(@Nonnull final String value) {
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
     public SchedulingGroupRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

