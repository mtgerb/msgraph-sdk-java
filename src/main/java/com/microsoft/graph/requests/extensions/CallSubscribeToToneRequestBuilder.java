// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallSubscribeToToneRequest;
import com.microsoft.graph.requests.extensions.CallSubscribeToToneRequest;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Subscribe To Tone Request Builder.
 */
public class CallSubscribeToToneRequestBuilder extends BaseActionRequestBuilder implements ICallSubscribeToToneRequestBuilder {

    /**
     * The request builder for this CallSubscribeToTone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param clientContext the clientContext
     */
    public CallSubscribeToToneRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String clientContext) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("clientContext", clientContext);
    }

    /**
     * Creates the ICallSubscribeToToneRequest
     *
     * @param requestOptions the options for the request
     * @return the ICallSubscribeToToneRequest instance
     */
    public ICallSubscribeToToneRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the ICallSubscribeToToneRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICallSubscribeToToneRequest instance
     */
    public ICallSubscribeToToneRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallSubscribeToToneRequest request = new CallSubscribeToToneRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("clientContext")) {
            request.body.clientContext = getParameter("clientContext");
        }

        return request;
    }
}
