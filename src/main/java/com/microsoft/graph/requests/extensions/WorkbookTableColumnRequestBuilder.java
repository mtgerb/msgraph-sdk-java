// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.IWorkbookFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Column Request Builder.
 */
public class WorkbookTableColumnRequestBuilder extends BaseRequestBuilder implements IWorkbookTableColumnRequestBuilder {

    /**
     * The request builder for the WorkbookTableColumn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableColumnRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableColumnRequest instance
     */
    public IWorkbookTableColumnRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableColumnRequest instance
     */
    public IWorkbookTableColumnRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookTableColumnRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookFilter
     *
     * @return the IWorkbookFilterRequestBuilder instance
     */
    public IWorkbookFilterRequestBuilder filter() {
        return new WorkbookFilterRequestBuilder(getRequestUrlWithAdditionalSegment("filter"), getClient(), null);
    }

    public IWorkbookTableColumnDataBodyRangeRequestBuilder dataBodyRange() {
        return new WorkbookTableColumnDataBodyRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dataBodyRange"), getClient(), null);
    }

    public IWorkbookTableColumnHeaderRowRangeRequestBuilder headerRowRange() {
        return new WorkbookTableColumnHeaderRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.headerRowRange"), getClient(), null);
    }

    public IWorkbookTableColumnRangeRequestBuilder range() {
        return new WorkbookTableColumnRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }

    public IWorkbookTableColumnTotalRowRangeRequestBuilder totalRowRange() {
        return new WorkbookTableColumnTotalRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.totalRowRange"), getClient(), null);
    }
}
