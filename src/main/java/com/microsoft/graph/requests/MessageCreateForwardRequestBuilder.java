// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.MessageCreateForwardRequest;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.Message;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.MessageCreateForwardParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Create Forward Request Builder.
 */
public class MessageCreateForwardRequestBuilder extends BaseActionRequestBuilder<Message> {

    private MessageCreateForwardParameterSet body;
    /**
     * The request builder for this MessageCreateForward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public MessageCreateForwardRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final MessageCreateForwardParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the MessageCreateForwardRequest
     *
     * @param requestOptions the options for the request
     * @return the MessageCreateForwardRequest instance
     */
    @Nonnull
    public MessageCreateForwardRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the MessageCreateForwardRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the MessageCreateForwardRequest instance
     */
    @Nonnull
    public MessageCreateForwardRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MessageCreateForwardRequest request = new MessageCreateForwardRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}