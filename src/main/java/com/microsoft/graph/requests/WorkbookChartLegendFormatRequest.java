// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartLegendFormat;
import com.microsoft.graph.requests.WorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartFontRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Legend Format Request.
 */
public class WorkbookChartLegendFormatRequest extends BaseRequest<WorkbookChartLegendFormat> {
	
    /**
     * The request for the WorkbookChartLegendFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartLegendFormatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartLegendFormat.class);
    }

    /**
     * Gets the WorkbookChartLegendFormat from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegendFormat> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookChartLegendFormat from the service
     *
     * @return the WorkbookChartLegendFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartLegendFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegendFormat> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookChartLegendFormat delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartLegendFormat with a source
     *
     * @param sourceWorkbookChartLegendFormat the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegendFormat> patchAsync(@Nonnull final WorkbookChartLegendFormat sourceWorkbookChartLegendFormat) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookChartLegendFormat);
    }

    /**
     * Patches this WorkbookChartLegendFormat with a source
     *
     * @param sourceWorkbookChartLegendFormat the source object with updates
     * @return the updated WorkbookChartLegendFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartLegendFormat patch(@Nonnull final WorkbookChartLegendFormat sourceWorkbookChartLegendFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartLegendFormat);
    }

    /**
     * Creates a WorkbookChartLegendFormat with a new object
     *
     * @param newWorkbookChartLegendFormat the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegendFormat> postAsync(@Nonnull final WorkbookChartLegendFormat newWorkbookChartLegendFormat) {
        return sendAsync(HttpMethod.POST, newWorkbookChartLegendFormat);
    }

    /**
     * Creates a WorkbookChartLegendFormat with a new object
     *
     * @param newWorkbookChartLegendFormat the new object to create
     * @return the created WorkbookChartLegendFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartLegendFormat post(@Nonnull final WorkbookChartLegendFormat newWorkbookChartLegendFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartLegendFormat);
    }

    /**
     * Creates a WorkbookChartLegendFormat with a new object
     *
     * @param newWorkbookChartLegendFormat the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegendFormat> putAsync(@Nonnull final WorkbookChartLegendFormat newWorkbookChartLegendFormat) {
        return sendAsync(HttpMethod.PUT, newWorkbookChartLegendFormat);
    }

    /**
     * Creates a WorkbookChartLegendFormat with a new object
     *
     * @param newWorkbookChartLegendFormat the object to create/update
     * @return the created WorkbookChartLegendFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartLegendFormat put(@Nonnull final WorkbookChartLegendFormat newWorkbookChartLegendFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartLegendFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartLegendFormatRequest select(@Nonnull final String value) {
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
     public WorkbookChartLegendFormatRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

