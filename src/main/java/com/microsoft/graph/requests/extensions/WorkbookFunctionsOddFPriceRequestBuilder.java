// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsOddFPriceRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsOddFPriceRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Odd FPrice Request Builder.
 */
public class WorkbookFunctionsOddFPriceRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsOddFPriceRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsOddFPrice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param issue the issue
     * @param firstCoupon the firstCoupon
     * @param rate the rate
     * @param yld the yld
     * @param redemption the redemption
     * @param frequency the frequency
     * @param basis the basis
     */
    public WorkbookFunctionsOddFPriceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement firstCoupon, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement yld, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("issue", issue);
        bodyParams.put("firstCoupon", firstCoupon);
        bodyParams.put("rate", rate);
        bodyParams.put("yld", yld);
        bodyParams.put("redemption", redemption);
        bodyParams.put("frequency", frequency);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsOddFPriceRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsOddFPriceRequest instance
     */
    public IWorkbookFunctionsOddFPriceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsOddFPriceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsOddFPriceRequest instance
     */
    public IWorkbookFunctionsOddFPriceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsOddFPriceRequest request = new WorkbookFunctionsOddFPriceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("issue")) {
            request.body.issue = getParameter("issue");
        }

        if (hasParameter("firstCoupon")) {
            request.body.firstCoupon = getParameter("firstCoupon");
        }

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("yld")) {
            request.body.yld = getParameter("yld");
        }

        if (hasParameter("redemption")) {
            request.body.redemption = getParameter("redemption");
        }

        if (hasParameter("frequency")) {
            request.body.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
