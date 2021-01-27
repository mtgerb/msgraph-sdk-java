// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DomainDnsTxtRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Txt Record Request.
 */
public class DomainDnsTxtRecordRequest extends BaseRequest<DomainDnsTxtRecord> {
	
    /**
     * The request for the DomainDnsTxtRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsTxtRecordRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsTxtRecord.class);
    }

    /**
     * Gets the DomainDnsTxtRecord from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsTxtRecord> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DomainDnsTxtRecord from the service
     *
     * @return the DomainDnsTxtRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsTxtRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsTxtRecord> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DomainDnsTxtRecord delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DomainDnsTxtRecord with a source
     *
     * @param sourceDomainDnsTxtRecord the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsTxtRecord> patchAsync(@Nonnull final DomainDnsTxtRecord sourceDomainDnsTxtRecord) {
        return sendAsync(HttpMethod.PATCH, sourceDomainDnsTxtRecord);
    }

    /**
     * Patches this DomainDnsTxtRecord with a source
     *
     * @param sourceDomainDnsTxtRecord the source object with updates
     * @return the updated DomainDnsTxtRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsTxtRecord patch(@Nonnull final DomainDnsTxtRecord sourceDomainDnsTxtRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsTxtRecord);
    }

    /**
     * Creates a DomainDnsTxtRecord with a new object
     *
     * @param newDomainDnsTxtRecord the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsTxtRecord> postAsync(@Nonnull final DomainDnsTxtRecord newDomainDnsTxtRecord) {
        return sendAsync(HttpMethod.POST, newDomainDnsTxtRecord);
    }

    /**
     * Creates a DomainDnsTxtRecord with a new object
     *
     * @param newDomainDnsTxtRecord the new object to create
     * @return the created DomainDnsTxtRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsTxtRecord post(@Nonnull final DomainDnsTxtRecord newDomainDnsTxtRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsTxtRecord);
    }

    /**
     * Creates a DomainDnsTxtRecord with a new object
     *
     * @param newDomainDnsTxtRecord the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsTxtRecord> putAsync(@Nonnull final DomainDnsTxtRecord newDomainDnsTxtRecord) {
        return sendAsync(HttpMethod.PUT, newDomainDnsTxtRecord);
    }

    /**
     * Creates a DomainDnsTxtRecord with a new object
     *
     * @param newDomainDnsTxtRecord the object to create/update
     * @return the created DomainDnsTxtRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsTxtRecord put(@Nonnull final DomainDnsTxtRecord newDomainDnsTxtRecord) throws ClientException {
        return send(HttpMethod.PUT, newDomainDnsTxtRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DomainDnsTxtRecordRequest select(@Nonnull final String value) {
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
     public DomainDnsTxtRecordRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
