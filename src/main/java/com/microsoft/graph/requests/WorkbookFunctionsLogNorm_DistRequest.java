// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WorkbookFunctionResult;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.graph.requests.WorkbookFunctionsLogNorm_DistRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.WorkbookFunctionsLogNorm_DistParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Log Norm_Dist Request.
 */
public class WorkbookFunctionsLogNorm_DistRequest extends BaseRequest<WorkbookFunctionResult> {
    /**
     * The request for this WorkbookFunctionsLogNorm_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookFunctionsLogNorm_DistRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookFunctionsLogNorm_DistParameterSet parameters) {
        super(requestUrl, client, requestOptions, WorkbookFunctionResult.class);
        body = parameters;
    }

	/** The body for the method */
    @Nullable
    protected WorkbookFunctionsLogNorm_DistParameterSet body;
    /**
     * Invokes the method and returns a future with the result
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFunctionResult> postAsync() {
        return sendAsync(HttpMethod.POST, body);
    }

    /**
     * Invokes the method and returns the result
     * @return result of the method invocation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public WorkbookFunctionResult post() throws ClientException {
       return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookFunctionsLogNorm_DistRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookFunctionsLogNorm_DistRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
