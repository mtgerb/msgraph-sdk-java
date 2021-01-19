// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookRangeFormat;
import com.microsoft.graph.requests.WorkbookRangeBorderCollectionRequestBuilder;
import com.microsoft.graph.requests.WorkbookRangeBorderRequestBuilder;
import com.microsoft.graph.requests.WorkbookRangeFillRequestBuilder;
import com.microsoft.graph.requests.WorkbookRangeFontRequestBuilder;
import com.microsoft.graph.requests.WorkbookFormatProtectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Format Request.
 */
public class WorkbookRangeFormatRequest extends BaseRequest<WorkbookRangeFormat> {
	
    /**
     * The request for the WorkbookRangeFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeFormatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeFormat.class);
    }

    /**
     * Gets the WorkbookRangeFormat from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeFormat> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookRangeFormat from the service
     *
     * @return the WorkbookRangeFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeFormat> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookRangeFormat delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookRangeFormat with a source
     *
     * @param sourceWorkbookRangeFormat the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeFormat> patchAsync(@Nonnull final WorkbookRangeFormat sourceWorkbookRangeFormat) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookRangeFormat);
    }

    /**
     * Patches this WorkbookRangeFormat with a source
     *
     * @param sourceWorkbookRangeFormat the source object with updates
     * @return the updated WorkbookRangeFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeFormat patch(@Nonnull final WorkbookRangeFormat sourceWorkbookRangeFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeFormat);
    }

    /**
     * Creates a WorkbookRangeFormat with a new object
     *
     * @param newWorkbookRangeFormat the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeFormat> postAsync(@Nonnull final WorkbookRangeFormat newWorkbookRangeFormat) {
        return sendAsync(HttpMethod.POST, newWorkbookRangeFormat);
    }

    /**
     * Creates a WorkbookRangeFormat with a new object
     *
     * @param newWorkbookRangeFormat the new object to create
     * @return the created WorkbookRangeFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeFormat post(@Nonnull final WorkbookRangeFormat newWorkbookRangeFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeFormat);
    }

    /**
     * Creates a WorkbookRangeFormat with a new object
     *
     * @param newWorkbookRangeFormat the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookRangeFormat> putAsync(@Nonnull final WorkbookRangeFormat newWorkbookRangeFormat) {
        return sendAsync(HttpMethod.PUT, newWorkbookRangeFormat);
    }

    /**
     * Creates a WorkbookRangeFormat with a new object
     *
     * @param newWorkbookRangeFormat the object to create/update
     * @return the created WorkbookRangeFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeFormat put(@Nonnull final WorkbookRangeFormat newWorkbookRangeFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookRangeFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookRangeFormatRequest select(@Nonnull final String value) {
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
     public WorkbookRangeFormatRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

