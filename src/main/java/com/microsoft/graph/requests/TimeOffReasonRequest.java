// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TimeOffReason;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Reason Request.
 */
public class TimeOffReasonRequest extends BaseRequest<TimeOffReason> {
	
    /**
     * The request for the TimeOffReason
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeOffReasonRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeOffReason.class);
    }

    /**
     * Gets the TimeOffReason from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TimeOffReason from the service
     *
     * @return the TimeOffReason from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeOffReason get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TimeOffReason delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TimeOffReason with a source
     *
     * @param sourceTimeOffReason the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> patchAsync(@Nonnull final TimeOffReason sourceTimeOffReason) {
        return sendAsync(HttpMethod.PATCH, sourceTimeOffReason);
    }

    /**
     * Patches this TimeOffReason with a source
     *
     * @param sourceTimeOffReason the source object with updates
     * @return the updated TimeOffReason
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeOffReason patch(@Nonnull final TimeOffReason sourceTimeOffReason) throws ClientException {
        return send(HttpMethod.PATCH, sourceTimeOffReason);
    }

    /**
     * Creates a TimeOffReason with a new object
     *
     * @param newTimeOffReason the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> postAsync(@Nonnull final TimeOffReason newTimeOffReason) {
        return sendAsync(HttpMethod.POST, newTimeOffReason);
    }

    /**
     * Creates a TimeOffReason with a new object
     *
     * @param newTimeOffReason the new object to create
     * @return the created TimeOffReason
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeOffReason post(@Nonnull final TimeOffReason newTimeOffReason) throws ClientException {
        return send(HttpMethod.POST, newTimeOffReason);
    }

    /**
     * Creates a TimeOffReason with a new object
     *
     * @param newTimeOffReason the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffReason> putAsync(@Nonnull final TimeOffReason newTimeOffReason) {
        return sendAsync(HttpMethod.PUT, newTimeOffReason);
    }

    /**
     * Creates a TimeOffReason with a new object
     *
     * @param newTimeOffReason the object to create/update
     * @return the created TimeOffReason
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeOffReason put(@Nonnull final TimeOffReason newTimeOffReason) throws ClientException {
        return send(HttpMethod.PUT, newTimeOffReason);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TimeOffReasonRequest select(@Nonnull final String value) {
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
     public TimeOffReasonRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
