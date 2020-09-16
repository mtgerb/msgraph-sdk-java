// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeVisibleViewRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeVisibleViewRequest;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Visible View Request Builder.
 */
public class WorkbookRangeVisibleViewRequestBuilder extends BaseFunctionRequestBuilder implements IWorkbookRangeVisibleViewRequestBuilder {

    /**
     * The request builder for this WorkbookRangeVisibleView
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeVisibleViewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookRangeVisibleViewRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeVisibleViewRequest instance
     */
    public IWorkbookRangeVisibleViewRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookRangeVisibleViewRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeVisibleViewRequest instance
     */
    public IWorkbookRangeVisibleViewRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRangeVisibleViewRequest request = new WorkbookRangeVisibleViewRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
    public IWorkbookRangeViewCollectionRequestBuilder rows() {
        return new WorkbookRangeViewCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rows"), getClient(), null);
    }

    public IWorkbookRangeViewRequestBuilder rows(final String id) {
        return new WorkbookRangeViewRequestBuilder(getRequestUrlWithAdditionalSegment("rows") + "/" + id, getClient(), null);
    }
}
