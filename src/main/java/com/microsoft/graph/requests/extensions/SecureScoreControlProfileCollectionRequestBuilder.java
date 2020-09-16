// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.SecureScoreControlProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Secure Score Control Profile Collection Request Builder.
 */
public class SecureScoreControlProfileCollectionRequestBuilder extends BaseRequestBuilder implements ISecureScoreControlProfileCollectionRequestBuilder {

    /**
     * The request builder for this collection of Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecureScoreControlProfileCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISecureScoreControlProfileCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISecureScoreControlProfileCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SecureScoreControlProfileCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISecureScoreControlProfileRequestBuilder byId(final String id) {
        return new SecureScoreControlProfileRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
