// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnenotePageCopyToSectionRequest;
import com.microsoft.graph.requests.extensions.OnenotePageCopyToSectionRequest;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Copy To Section Request Builder.
 */
public class OnenotePageCopyToSectionRequestBuilder extends BaseActionRequestBuilder implements IOnenotePageCopyToSectionRequestBuilder {

    /**
     * The request builder for this OnenotePageCopyToSection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param id the id
     * @param groupId the groupId
     * @param siteCollectionId the siteCollectionId
     * @param siteId the siteId
     */
    public OnenotePageCopyToSectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String id, final String groupId, final String siteCollectionId, final String siteId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("id", id);
        bodyParams.put("groupId", groupId);
        bodyParams.put("siteCollectionId", siteCollectionId);
        bodyParams.put("siteId", siteId);
    }

    /**
     * Creates the IOnenotePageCopyToSectionRequest
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageCopyToSectionRequest instance
     */
    public IOnenotePageCopyToSectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the IOnenotePageCopyToSectionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageCopyToSectionRequest instance
     */
    public IOnenotePageCopyToSectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OnenotePageCopyToSectionRequest request = new OnenotePageCopyToSectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("id")) {
            request.body.id = getParameter("id");
        }

        if (hasParameter("groupId")) {
            request.body.groupId = getParameter("groupId");
        }

        if (hasParameter("siteCollectionId")) {
            request.body.siteCollectionId = getParameter("siteCollectionId");
        }

        if (hasParameter("siteId")) {
            request.body.siteId = getParameter("siteId");
        }

        return request;
    }
}
