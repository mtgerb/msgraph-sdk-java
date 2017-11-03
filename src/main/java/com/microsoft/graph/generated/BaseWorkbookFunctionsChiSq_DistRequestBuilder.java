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
 * The class for the Base Workbook Functions Chi Sq_Dist Request Builder.
 */
public class BaseWorkbookFunctionsChiSq_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsChiSq_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsChiSq_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("x", x);
        mBodyParams.put("degFreedom", degFreedom);
        mBodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsChiSq_DistRequest
     *
     * @return The IWorkbookFunctionsChiSq_DistRequest instance
     */
    public IWorkbookFunctionsChiSq_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsChiSq_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsChiSq_DistRequest instance
     */
    public IWorkbookFunctionsChiSq_DistRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsChiSq_DistRequest request = new WorkbookFunctionsChiSq_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.mBody.x = getParameter("x");
        }

        if (hasParameter("degFreedom")) {
            request.mBody.degFreedom = getParameter("degFreedom");
        }

        if (hasParameter("cumulative")) {
            request.mBody.cumulative = getParameter("cumulative");
        }

        return request;
    }
}