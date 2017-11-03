// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Range Sort Request Builder.
 */
public class BaseWorkbookRangeSortRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookRangeSortRequestBuilder {

    /**
     * The request builder for the WorkbookRangeSort
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeSortRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookRangeSortRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookRangeSortRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new WorkbookRangeSortRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookRangeSortApplyRequestBuilder apply(final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final Boolean hasHeaders, final String orientation, final String method) {
        return new WorkbookRangeSortApplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.apply"), getClient(), null, fields, matchCase, hasHeaders, orientation, method);
    }
}