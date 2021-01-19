// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.InformationProtection;
import com.microsoft.graph.requests.ThreatAssessmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.ThreatAssessmentRequestRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Request.
 */
public class InformationProtectionRequest extends BaseRequest<InformationProtection> {
	
    /**
     * The request for the InformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InformationProtection.class);
    }

    /**
     * Gets the InformationProtection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the InformationProtection from the service
     *
     * @return the InformationProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InformationProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public InformationProtection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this InformationProtection with a source
     *
     * @param sourceInformationProtection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> patchAsync(@Nonnull final InformationProtection sourceInformationProtection) {
        return sendAsync(HttpMethod.PATCH, sourceInformationProtection);
    }

    /**
     * Patches this InformationProtection with a source
     *
     * @param sourceInformationProtection the source object with updates
     * @return the updated InformationProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InformationProtection patch(@Nonnull final InformationProtection sourceInformationProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceInformationProtection);
    }

    /**
     * Creates a InformationProtection with a new object
     *
     * @param newInformationProtection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> postAsync(@Nonnull final InformationProtection newInformationProtection) {
        return sendAsync(HttpMethod.POST, newInformationProtection);
    }

    /**
     * Creates a InformationProtection with a new object
     *
     * @param newInformationProtection the new object to create
     * @return the created InformationProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InformationProtection post(@Nonnull final InformationProtection newInformationProtection) throws ClientException {
        return send(HttpMethod.POST, newInformationProtection);
    }

    /**
     * Creates a InformationProtection with a new object
     *
     * @param newInformationProtection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InformationProtection> putAsync(@Nonnull final InformationProtection newInformationProtection) {
        return sendAsync(HttpMethod.PUT, newInformationProtection);
    }

    /**
     * Creates a InformationProtection with a new object
     *
     * @param newInformationProtection the object to create/update
     * @return the created InformationProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InformationProtection put(@Nonnull final InformationProtection newInformationProtection) throws ClientException {
        return send(HttpMethod.PUT, newInformationProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public InformationProtectionRequest select(@Nonnull final String value) {
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
     public InformationProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

