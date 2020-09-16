// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableConvertToRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableConvertToRangeRequest;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Convert To Range Request Builder.
 */
public class WorkbookTableConvertToRangeRequestBuilder extends BaseActionRequestBuilder implements IWorkbookTableConvertToRangeRequestBuilder {

    /**
     * The request builder for this WorkbookTableConvertToRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableConvertToRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableConvertToRangeRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableConvertToRangeRequest instance
     */
    public IWorkbookTableConvertToRangeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookTableConvertToRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableConvertToRangeRequest instance
     */
    public IWorkbookTableConvertToRangeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookTableConvertToRangeRequest request = new WorkbookTableConvertToRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
