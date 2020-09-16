// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRadiansRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRadiansRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Radians Request Builder.
 */
public class WorkbookFunctionsRadiansRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsRadiansRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRadians
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param angle the angle
     */
    public WorkbookFunctionsRadiansRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement angle) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("angle", angle);
    }

    /**
     * Creates the IWorkbookFunctionsRadiansRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRadiansRequest instance
     */
    public IWorkbookFunctionsRadiansRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRadiansRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRadiansRequest instance
     */
    public IWorkbookFunctionsRadiansRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsRadiansRequest request = new WorkbookFunctionsRadiansRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("angle")) {
            request.body.angle = getParameter("angle");
        }

        return request;
    }
}
