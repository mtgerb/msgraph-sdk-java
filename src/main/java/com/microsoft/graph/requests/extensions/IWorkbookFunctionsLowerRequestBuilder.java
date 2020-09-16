// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsLowerRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Lower Request Builder.
 */
public interface IWorkbookFunctionsLowerRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsLowerRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLowerRequest instance
     */
    IWorkbookFunctionsLowerRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsLowerRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLowerRequest instance
     */
    IWorkbookFunctionsLowerRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
