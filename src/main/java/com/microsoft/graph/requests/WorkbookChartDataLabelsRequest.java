// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartDataLabels;
import com.microsoft.graph.requests.WorkbookChartDataLabelFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Data Labels Request.
 */
public class WorkbookChartDataLabelsRequest extends BaseRequest<WorkbookChartDataLabels> {
	
    /**
     * The request for the WorkbookChartDataLabels
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartDataLabelsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartDataLabels.class);
    }

    /**
     * Gets the WorkbookChartDataLabels from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartDataLabels> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookChartDataLabels from the service
     *
     * @return the WorkbookChartDataLabels from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartDataLabels get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartDataLabels> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookChartDataLabels delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartDataLabels with a source
     *
     * @param sourceWorkbookChartDataLabels the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartDataLabels> patchAsync(@Nonnull final WorkbookChartDataLabels sourceWorkbookChartDataLabels) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookChartDataLabels);
    }

    /**
     * Patches this WorkbookChartDataLabels with a source
     *
     * @param sourceWorkbookChartDataLabels the source object with updates
     * @return the updated WorkbookChartDataLabels
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartDataLabels patch(@Nonnull final WorkbookChartDataLabels sourceWorkbookChartDataLabels) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartDataLabels);
    }

    /**
     * Creates a WorkbookChartDataLabels with a new object
     *
     * @param newWorkbookChartDataLabels the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartDataLabels> postAsync(@Nonnull final WorkbookChartDataLabels newWorkbookChartDataLabels) {
        return sendAsync(HttpMethod.POST, newWorkbookChartDataLabels);
    }

    /**
     * Creates a WorkbookChartDataLabels with a new object
     *
     * @param newWorkbookChartDataLabels the new object to create
     * @return the created WorkbookChartDataLabels
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartDataLabels post(@Nonnull final WorkbookChartDataLabels newWorkbookChartDataLabels) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartDataLabels);
    }

    /**
     * Creates a WorkbookChartDataLabels with a new object
     *
     * @param newWorkbookChartDataLabels the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartDataLabels> putAsync(@Nonnull final WorkbookChartDataLabels newWorkbookChartDataLabels) {
        return sendAsync(HttpMethod.PUT, newWorkbookChartDataLabels);
    }

    /**
     * Creates a WorkbookChartDataLabels with a new object
     *
     * @param newWorkbookChartDataLabels the object to create/update
     * @return the created WorkbookChartDataLabels
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartDataLabels put(@Nonnull final WorkbookChartDataLabels newWorkbookChartDataLabels) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartDataLabels);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartDataLabelsRequest select(@Nonnull final String value) {
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
     public WorkbookChartDataLabelsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

