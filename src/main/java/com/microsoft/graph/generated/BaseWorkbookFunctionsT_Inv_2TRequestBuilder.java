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
 * The class for the Base Workbook Functions T_Inv_2TRequest Builder.
 */
public class BaseWorkbookFunctionsT_Inv_2TRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsT_Inv_2T
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsT_Inv_2TRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("probability", probability);
        mBodyParams.put("degFreedom", degFreedom);
    }

    /**
     * Creates the IWorkbookFunctionsT_Inv_2TRequest
     *
     * @return The IWorkbookFunctionsT_Inv_2TRequest instance
     */
    public IWorkbookFunctionsT_Inv_2TRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsT_Inv_2TRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsT_Inv_2TRequest instance
     */
    public IWorkbookFunctionsT_Inv_2TRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsT_Inv_2TRequest request = new WorkbookFunctionsT_Inv_2TRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.mBody.probability = getParameter("probability");
        }

        if (hasParameter("degFreedom")) {
            request.mBody.degFreedom = getParameter("degFreedom");
        }

        return request;
    }
}