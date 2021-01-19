// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WorkbookSessionInfo;
import com.microsoft.graph.models.Workbook;
import com.microsoft.graph.requests.WorkbookSessionInfoResourceRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.WorkbookSessionInfoResourceParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Session Info Resource Request.
 */
public class WorkbookSessionInfoResourceRequest extends BaseRequest<WorkbookSessionInfo> {
    /**
     * The request for this WorkbookSessionInfoResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookSessionInfoResourceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookSessionInfo.class);
    }

    /**
     * Gets the WorkbookSessionInfo
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookSessionInfo> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookSessionInfo
     *
     * @return the WorkbookSessionInfo
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public WorkbookSessionInfo get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookSessionInfoResourceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookSessionInfoResourceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
