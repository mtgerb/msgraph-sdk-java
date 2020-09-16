// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsWeekdayRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsWeekdayRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Weekday Request Builder.
 */
public class WorkbookFunctionsWeekdayRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsWeekdayRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsWeekday
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param serialNumber the serialNumber
     * @param returnType the returnType
     */
    public WorkbookFunctionsWeekdayRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement serialNumber, final com.google.gson.JsonElement returnType) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("serialNumber", serialNumber);
        bodyParams.put("returnType", returnType);
    }

    /**
     * Creates the IWorkbookFunctionsWeekdayRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsWeekdayRequest instance
     */
    public IWorkbookFunctionsWeekdayRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsWeekdayRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsWeekdayRequest instance
     */
    public IWorkbookFunctionsWeekdayRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsWeekdayRequest request = new WorkbookFunctionsWeekdayRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("serialNumber")) {
            request.body.serialNumber = getParameter("serialNumber");
        }

        if (hasParameter("returnType")) {
            request.body.returnType = getParameter("returnType");
        }

        return request;
    }
}
