// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationUser;
import com.microsoft.graph.requests.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationClassRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Request.
 */
public class EducationUserRequest extends BaseRequest<EducationUser> {
	
    /**
     * The request for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationUser.class);
    }

    /**
     * Gets the EducationUser from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EducationUser from the service
     *
     * @return the EducationUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EducationUser delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationUser with a source
     *
     * @param sourceEducationUser the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> patchAsync(@Nonnull final EducationUser sourceEducationUser) {
        return sendAsync(HttpMethod.PATCH, sourceEducationUser);
    }

    /**
     * Patches this EducationUser with a source
     *
     * @param sourceEducationUser the source object with updates
     * @return the updated EducationUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationUser patch(@Nonnull final EducationUser sourceEducationUser) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationUser);
    }

    /**
     * Creates a EducationUser with a new object
     *
     * @param newEducationUser the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> postAsync(@Nonnull final EducationUser newEducationUser) {
        return sendAsync(HttpMethod.POST, newEducationUser);
    }

    /**
     * Creates a EducationUser with a new object
     *
     * @param newEducationUser the new object to create
     * @return the created EducationUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationUser post(@Nonnull final EducationUser newEducationUser) throws ClientException {
        return send(HttpMethod.POST, newEducationUser);
    }

    /**
     * Creates a EducationUser with a new object
     *
     * @param newEducationUser the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> putAsync(@Nonnull final EducationUser newEducationUser) {
        return sendAsync(HttpMethod.PUT, newEducationUser);
    }

    /**
     * Creates a EducationUser with a new object
     *
     * @param newEducationUser the object to create/update
     * @return the created EducationUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationUser put(@Nonnull final EducationUser newEducationUser) throws ClientException {
        return send(HttpMethod.PUT, newEducationUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EducationUserRequest select(@Nonnull final String value) {
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
     public EducationUserRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

