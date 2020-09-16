// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSumIfsRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSumIfsRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Sum Ifs Request Builder.
 */
public class WorkbookFunctionsSumIfsRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsSumIfsRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSumIfs
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param sumRange the sumRange
     * @param values the values
     */
    public WorkbookFunctionsSumIfsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement sumRange, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("sumRange", sumRange);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsSumIfsRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSumIfsRequest instance
     */
    public IWorkbookFunctionsSumIfsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSumIfsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSumIfsRequest instance
     */
    public IWorkbookFunctionsSumIfsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsSumIfsRequest request = new WorkbookFunctionsSumIfsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sumRange")) {
            request.body.sumRange = getParameter("sumRange");
        }

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
