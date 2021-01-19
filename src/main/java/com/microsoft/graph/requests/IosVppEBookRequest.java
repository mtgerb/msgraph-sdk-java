// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosVppEBook;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp EBook Request.
 */
public class IosVppEBookRequest extends BaseRequest<IosVppEBook> {
	
    /**
     * The request for the IosVppEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppEBookRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosVppEBook.class);
    }

    /**
     * Gets the IosVppEBook from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBook> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosVppEBook from the service
     *
     * @return the IosVppEBook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppEBook get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBook> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosVppEBook delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosVppEBook with a source
     *
     * @param sourceIosVppEBook the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBook> patchAsync(@Nonnull final IosVppEBook sourceIosVppEBook) {
        return sendAsync(HttpMethod.PATCH, sourceIosVppEBook);
    }

    /**
     * Patches this IosVppEBook with a source
     *
     * @param sourceIosVppEBook the source object with updates
     * @return the updated IosVppEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppEBook patch(@Nonnull final IosVppEBook sourceIosVppEBook) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosVppEBook);
    }

    /**
     * Creates a IosVppEBook with a new object
     *
     * @param newIosVppEBook the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBook> postAsync(@Nonnull final IosVppEBook newIosVppEBook) {
        return sendAsync(HttpMethod.POST, newIosVppEBook);
    }

    /**
     * Creates a IosVppEBook with a new object
     *
     * @param newIosVppEBook the new object to create
     * @return the created IosVppEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppEBook post(@Nonnull final IosVppEBook newIosVppEBook) throws ClientException {
        return send(HttpMethod.POST, newIosVppEBook);
    }

    /**
     * Creates a IosVppEBook with a new object
     *
     * @param newIosVppEBook the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBook> putAsync(@Nonnull final IosVppEBook newIosVppEBook) {
        return sendAsync(HttpMethod.PUT, newIosVppEBook);
    }

    /**
     * Creates a IosVppEBook with a new object
     *
     * @param newIosVppEBook the object to create/update
     * @return the created IosVppEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppEBook put(@Nonnull final IosVppEBook newIosVppEBook) throws ClientException {
        return send(HttpMethod.PUT, newIosVppEBook);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosVppEBookRequest select(@Nonnull final String value) {
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
     public IosVppEBookRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

