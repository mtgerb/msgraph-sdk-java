// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidManagedAppProtection;
import com.microsoft.graph.requests.extensions.IManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyDeploymentSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Protection Request Builder.
 */
public class AndroidManagedAppProtectionRequestBuilder extends BaseRequestBuilder implements IAndroidManagedAppProtectionRequestBuilder {

    /**
     * The request builder for the AndroidManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedAppProtectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAndroidManagedAppProtectionRequest instance
     */
    public IAndroidManagedAppProtectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAndroidManagedAppProtectionRequest instance
     */
    public IAndroidManagedAppProtectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public ITargetedManagedAppPolicyAssignmentRequestBuilder assignments(final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IManagedMobileAppCollectionRequestBuilder apps() {
        return new ManagedMobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("apps"), getClient(), null);
    }

    public IManagedMobileAppRequestBuilder apps(final String id) {
        return new ManagedMobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("apps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedAppPolicyDeploymentSummary
     *
     * @return the IManagedAppPolicyDeploymentSummaryRequestBuilder instance
     */
    public IManagedAppPolicyDeploymentSummaryRequestBuilder deploymentSummary() {
        return new ManagedAppPolicyDeploymentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentSummary"), getClient(), null);
    }
}
