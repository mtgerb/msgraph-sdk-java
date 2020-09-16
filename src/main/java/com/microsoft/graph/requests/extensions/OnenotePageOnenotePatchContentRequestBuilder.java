// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnenotePageOnenotePatchContentRequest;
import com.microsoft.graph.requests.extensions.OnenotePageOnenotePatchContentRequest;
import com.microsoft.graph.models.extensions.OnenotePatchContentCommand;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Onenote Patch Content Request Builder.
 */
public class OnenotePageOnenotePatchContentRequestBuilder extends BaseActionRequestBuilder implements IOnenotePageOnenotePatchContentRequestBuilder {

    /**
     * The request builder for this OnenotePageOnenotePatchContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param commands the commands
     */
    public OnenotePageOnenotePatchContentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<OnenotePatchContentCommand> commands) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("commands", commands);
    }

    /**
     * Creates the IOnenotePageOnenotePatchContentRequest
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageOnenotePatchContentRequest instance
     */
    public IOnenotePageOnenotePatchContentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IOnenotePageOnenotePatchContentRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageOnenotePatchContentRequest instance
     */
    public IOnenotePageOnenotePatchContentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OnenotePageOnenotePatchContentRequest request = new OnenotePageOnenotePatchContentRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("commands")) {
            request.body.commands = getParameter("commands");
        }

        return request;
    }
}
