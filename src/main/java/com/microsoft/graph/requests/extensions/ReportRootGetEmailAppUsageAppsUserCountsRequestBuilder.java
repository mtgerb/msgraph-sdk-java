// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageAppsUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageAppsUserCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Email App Usage Apps User Counts Request Builder.
 */
public class ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetEmailAppUsageAppsUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetEmailAppUsageAppsUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetEmailAppUsageAppsUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetEmailAppUsageAppsUserCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetEmailAppUsageAppsUserCountsRequest instance
     */
    public IReportRootGetEmailAppUsageAppsUserCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IReportRootGetEmailAppUsageAppsUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetEmailAppUsageAppsUserCountsRequest instance
     */
    public IReportRootGetEmailAppUsageAppsUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetEmailAppUsageAppsUserCountsRequest request = new ReportRootGetEmailAppUsageAppsUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
