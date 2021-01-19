// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartAxis;
import com.microsoft.graph.requests.WorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartAxisTitleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Request.
 */
public class WorkbookChartAxisRequest extends BaseRequest<WorkbookChartAxis> {
	
    /**
     * The request for the WorkbookChartAxis
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxis.class);
    }

    /**
     * Gets the WorkbookChartAxis from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxis> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookChartAxis from the service
     *
     * @return the WorkbookChartAxis from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxis get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxis> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookChartAxis delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartAxis with a source
     *
     * @param sourceWorkbookChartAxis the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxis> patchAsync(@Nonnull final WorkbookChartAxis sourceWorkbookChartAxis) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookChartAxis);
    }

    /**
     * Patches this WorkbookChartAxis with a source
     *
     * @param sourceWorkbookChartAxis the source object with updates
     * @return the updated WorkbookChartAxis
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxis patch(@Nonnull final WorkbookChartAxis sourceWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxis> postAsync(@Nonnull final WorkbookChartAxis newWorkbookChartAxis) {
        return sendAsync(HttpMethod.POST, newWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the new object to create
     * @return the created WorkbookChartAxis
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxis post(@Nonnull final WorkbookChartAxis newWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAxis> putAsync(@Nonnull final WorkbookChartAxis newWorkbookChartAxis) {
        return sendAsync(HttpMethod.PUT, newWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the object to create/update
     * @return the created WorkbookChartAxis
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxis put(@Nonnull final WorkbookChartAxis newWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartAxis);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartAxisRequest select(@Nonnull final String value) {
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
     public WorkbookChartAxisRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

