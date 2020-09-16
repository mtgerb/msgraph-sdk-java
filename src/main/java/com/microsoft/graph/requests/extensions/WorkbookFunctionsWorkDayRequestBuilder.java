// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsWorkDayRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsWorkDayRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Work Day Request Builder.
 */
public class WorkbookFunctionsWorkDayRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsWorkDayRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsWorkDay
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param days the days
     * @param holidays the holidays
     */
    public WorkbookFunctionsWorkDayRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement days, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("days", days);
        bodyParams.put("holidays", holidays);
    }

    /**
     * Creates the IWorkbookFunctionsWorkDayRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsWorkDayRequest instance
     */
    public IWorkbookFunctionsWorkDayRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsWorkDayRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsWorkDayRequest instance
     */
    public IWorkbookFunctionsWorkDayRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsWorkDayRequest request = new WorkbookFunctionsWorkDayRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        if (hasParameter("days")) {
            request.body.days = getParameter("days");
        }

        if (hasParameter("holidays")) {
            request.body.holidays = getParameter("holidays");
        }

        return request;
    }
}
