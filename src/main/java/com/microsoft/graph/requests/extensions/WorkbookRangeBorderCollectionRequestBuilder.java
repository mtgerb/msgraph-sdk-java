// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeFormat;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderItemAtRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Border Collection Request Builder.
 */
public class WorkbookRangeBorderCollectionRequestBuilder extends BaseRequestBuilder implements IWorkbookRangeBorderCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookRangeFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeBorderCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWorkbookRangeBorderCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWorkbookRangeBorderCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookRangeBorderCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookRangeBorderRequestBuilder byId(final String id) {
        return new WorkbookRangeBorderRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IWorkbookRangeBorderCountRequestBuilder count() {
        return new WorkbookRangeBorderCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }

    public IWorkbookRangeBorderItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookRangeBorderItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }
}
