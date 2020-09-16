// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITeamArchiveRequest;
import com.microsoft.graph.requests.extensions.TeamArchiveRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Archive Request Builder.
 */
public class TeamArchiveRequestBuilder extends BaseActionRequestBuilder implements ITeamArchiveRequestBuilder {

    /**
     * The request builder for this TeamArchive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param shouldSetSpoSiteReadOnlyForMembers the shouldSetSpoSiteReadOnlyForMembers
     */
    public TeamArchiveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Boolean shouldSetSpoSiteReadOnlyForMembers) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("shouldSetSpoSiteReadOnlyForMembers", shouldSetSpoSiteReadOnlyForMembers);
    }

    /**
     * Creates the ITeamArchiveRequest
     *
     * @param requestOptions the options for the request
     * @return the ITeamArchiveRequest instance
     */
    public ITeamArchiveRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(requestOptions != null && requestOptions.length > 0 ? Arrays.asList(requestOptions) : getOptions());
    }

    /**
     * Creates the ITeamArchiveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITeamArchiveRequest instance
     */
    public ITeamArchiveRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TeamArchiveRequest request = new TeamArchiveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("shouldSetSpoSiteReadOnlyForMembers")) {
            request.body.shouldSetSpoSiteReadOnlyForMembers = getParameter("shouldSetSpoSiteReadOnlyForMembers");
        }

        return request;
    }
}
