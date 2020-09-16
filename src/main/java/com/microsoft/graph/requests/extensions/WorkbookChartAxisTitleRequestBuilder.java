// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxisTitle;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisTitleFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisTitleFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Title Request Builder.
 */
public class WorkbookChartAxisTitleRequestBuilder extends BaseRequestBuilder implements IWorkbookChartAxisTitleRequestBuilder {

    /**
     * The request builder for the WorkbookChartAxisTitle
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisTitleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartAxisTitleRequest instance
     */
    public IWorkbookChartAxisTitleRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartAxisTitleRequest instance
     */
    public IWorkbookChartAxisTitleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookChartAxisTitleRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartAxisTitleFormat
     *
     * @return the IWorkbookChartAxisTitleFormatRequestBuilder instance
     */
    public IWorkbookChartAxisTitleFormatRequestBuilder format() {
        return new WorkbookChartAxisTitleFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
}
