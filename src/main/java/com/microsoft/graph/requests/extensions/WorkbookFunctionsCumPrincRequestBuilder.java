// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCumPrincRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCumPrincRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Cum Princ Request Builder.
 */
public class WorkbookFunctionsCumPrincRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsCumPrincRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCumPrinc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param nper the nper
     * @param pv the pv
     * @param startPeriod the startPeriod
     * @param endPeriod the endPeriod
     * @param type the type
     */
    public WorkbookFunctionsCumPrincRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement startPeriod, final com.google.gson.JsonElement endPeriod, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("nper", nper);
        bodyParams.put("pv", pv);
        bodyParams.put("startPeriod", startPeriod);
        bodyParams.put("endPeriod", endPeriod);
        bodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsCumPrincRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCumPrincRequest instance
     */
    public IWorkbookFunctionsCumPrincRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCumPrincRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCumPrincRequest instance
     */
    public IWorkbookFunctionsCumPrincRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsCumPrincRequest request = new WorkbookFunctionsCumPrincRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("nper")) {
            request.body.nper = getParameter("nper");
        }

        if (hasParameter("pv")) {
            request.body.pv = getParameter("pv");
        }

        if (hasParameter("startPeriod")) {
            request.body.startPeriod = getParameter("startPeriod");
        }

        if (hasParameter("endPeriod")) {
            request.body.endPeriod = getParameter("endPeriod");
        }

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        return request;
    }
}
