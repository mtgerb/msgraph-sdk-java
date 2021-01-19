// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DomainDnsUnavailableRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Unavailable Record Request.
 */
public class DomainDnsUnavailableRecordRequest extends BaseRequest<DomainDnsUnavailableRecord> {
	
    /**
     * The request for the DomainDnsUnavailableRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsUnavailableRecordRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsUnavailableRecord.class);
    }

    /**
     * Gets the DomainDnsUnavailableRecord from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsUnavailableRecord> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DomainDnsUnavailableRecord from the service
     *
     * @return the DomainDnsUnavailableRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsUnavailableRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsUnavailableRecord> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DomainDnsUnavailableRecord delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DomainDnsUnavailableRecord with a source
     *
     * @param sourceDomainDnsUnavailableRecord the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsUnavailableRecord> patchAsync(@Nonnull final DomainDnsUnavailableRecord sourceDomainDnsUnavailableRecord) {
        return sendAsync(HttpMethod.PATCH, sourceDomainDnsUnavailableRecord);
    }

    /**
     * Patches this DomainDnsUnavailableRecord with a source
     *
     * @param sourceDomainDnsUnavailableRecord the source object with updates
     * @return the updated DomainDnsUnavailableRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsUnavailableRecord patch(@Nonnull final DomainDnsUnavailableRecord sourceDomainDnsUnavailableRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsUnavailableRecord);
    }

    /**
     * Creates a DomainDnsUnavailableRecord with a new object
     *
     * @param newDomainDnsUnavailableRecord the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsUnavailableRecord> postAsync(@Nonnull final DomainDnsUnavailableRecord newDomainDnsUnavailableRecord) {
        return sendAsync(HttpMethod.POST, newDomainDnsUnavailableRecord);
    }

    /**
     * Creates a DomainDnsUnavailableRecord with a new object
     *
     * @param newDomainDnsUnavailableRecord the new object to create
     * @return the created DomainDnsUnavailableRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsUnavailableRecord post(@Nonnull final DomainDnsUnavailableRecord newDomainDnsUnavailableRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsUnavailableRecord);
    }

    /**
     * Creates a DomainDnsUnavailableRecord with a new object
     *
     * @param newDomainDnsUnavailableRecord the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsUnavailableRecord> putAsync(@Nonnull final DomainDnsUnavailableRecord newDomainDnsUnavailableRecord) {
        return sendAsync(HttpMethod.PUT, newDomainDnsUnavailableRecord);
    }

    /**
     * Creates a DomainDnsUnavailableRecord with a new object
     *
     * @param newDomainDnsUnavailableRecord the object to create/update
     * @return the created DomainDnsUnavailableRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsUnavailableRecord put(@Nonnull final DomainDnsUnavailableRecord newDomainDnsUnavailableRecord) throws ClientException {
        return send(HttpMethod.PUT, newDomainDnsUnavailableRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DomainDnsUnavailableRecordRequest select(@Nonnull final String value) {
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
     public DomainDnsUnavailableRecordRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

