// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMessageCreateReplyRequest;
import com.microsoft.graph.requests.extensions.MessageCreateReplyRequest;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Create Reply Request Builder.
 */
public class MessageCreateReplyRequestBuilder extends BaseActionRequestBuilder implements IMessageCreateReplyRequestBuilder {

    /**
     * The request builder for this MessageCreateReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param message the message
     * @param comment the comment
     */
    public MessageCreateReplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Message message, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("message", message);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the IMessageCreateReplyRequest
     *
     * @param requestOptions the options for the request
     * @return the IMessageCreateReplyRequest instance
     */
    public IMessageCreateReplyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IMessageCreateReplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMessageCreateReplyRequest instance
     */
    public IMessageCreateReplyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MessageCreateReplyRequest request = new MessageCreateReplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("message")) {
            request.body.message = getParameter("message");
        }

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}
