// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsXnpvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsXnpvRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Xnpv Request Builder.
 */
public class WorkbookFunctionsXnpvRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsXnpvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsXnpv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param values the values
     * @param dates the dates
     */
    public WorkbookFunctionsXnpvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement values, final com.google.gson.JsonElement dates) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("values", values);
        bodyParams.put("dates", dates);
    }

    /**
     * Creates the IWorkbookFunctionsXnpvRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsXnpvRequest instance
     */
    public IWorkbookFunctionsXnpvRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsXnpvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsXnpvRequest instance
     */
    public IWorkbookFunctionsXnpvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsXnpvRequest request = new WorkbookFunctionsXnpvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        if (hasParameter("dates")) {
            request.body.dates = getParameter("dates");
        }

        return request;
    }
}
