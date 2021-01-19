// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Organization;
import com.microsoft.graph.models.CertificateBasedAuthConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.CertificateBasedAuthConfigurationWithReferenceRequest;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationReferenceRequestBuilder;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.CertificateBasedAuthConfiguration;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Collection Reference Request.
 */
public class CertificateBasedAuthConfigurationCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<CertificateBasedAuthConfiguration, CertificateBasedAuthConfigurationWithReferenceRequest, CertificateBasedAuthConfigurationReferenceRequestBuilder, CertificateBasedAuthConfigurationWithReferenceRequestBuilder, CertificateBasedAuthConfigurationCollectionResponse, CertificateBasedAuthConfigurationCollectionWithReferencesPage, CertificateBasedAuthConfigurationCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of CertificateBasedAuthConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CertificateBasedAuthConfigurationCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CertificateBasedAuthConfigurationCollectionResponse.class, CertificateBasedAuthConfigurationCollectionWithReferencesPage.class, CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new CertificateBasedAuthConfiguration
     * @param newCertificateBasedAuthConfiguration the CertificateBasedAuthConfiguration to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CertificateBasedAuthConfiguration> postAsync(@Nonnull final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/certificateBasedAuthConfiguration/" + newCertificateBasedAuthConfiguration.id);
        return new CertificateBasedAuthConfigurationWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newCertificateBasedAuthConfiguration, body);
    }

    /**
     * Creates a new CertificateBasedAuthConfiguration
     * @param newCertificateBasedAuthConfiguration the CertificateBasedAuthConfiguration to create
     * @return the newly created object
     */
    @Nonnull
    public CertificateBasedAuthConfiguration post(@Nonnull final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/certificateBasedAuthConfiguration/" + newCertificateBasedAuthConfiguration.id);
        return new CertificateBasedAuthConfigurationWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newCertificateBasedAuthConfiguration, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionReferenceRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
