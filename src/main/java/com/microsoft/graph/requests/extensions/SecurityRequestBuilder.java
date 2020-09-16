// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.requests.extensions.IAlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAlertRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Request Builder.
 */
public class SecurityRequestBuilder extends BaseRequestBuilder implements ISecurityRequestBuilder {

    /**
     * The request builder for the Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISecurityRequest instance
     */
    public ISecurityRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISecurityRequest instance
     */
    public ISecurityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SecurityRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAlertCollectionRequestBuilder alerts() {
        return new AlertCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("alerts"), getClient(), null);
    }

    public IAlertRequestBuilder alerts(final String id) {
        return new AlertRequestBuilder(getRequestUrlWithAdditionalSegment("alerts") + "/" + id, getClient(), null);
    }
    public ISecureScoreControlProfileCollectionRequestBuilder secureScoreControlProfiles() {
        return new SecureScoreControlProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("secureScoreControlProfiles"), getClient(), null);
    }

    public ISecureScoreControlProfileRequestBuilder secureScoreControlProfiles(final String id) {
        return new SecureScoreControlProfileRequestBuilder(getRequestUrlWithAdditionalSegment("secureScoreControlProfiles") + "/" + id, getClient(), null);
    }
    public ISecureScoreCollectionRequestBuilder secureScores() {
        return new SecureScoreCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("secureScores"), getClient(), null);
    }

    public ISecureScoreRequestBuilder secureScores(final String id) {
        return new SecureScoreRequestBuilder(getRequestUrlWithAdditionalSegment("secureScores") + "/" + id, getClient(), null);
    }
}
