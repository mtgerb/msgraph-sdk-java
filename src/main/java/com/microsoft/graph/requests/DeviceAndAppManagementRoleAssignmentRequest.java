// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceAndAppManagementRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Assignment Request.
 */
public class DeviceAndAppManagementRoleAssignmentRequest extends BaseRequest<DeviceAndAppManagementRoleAssignment> {
	
    /**
     * The request for the DeviceAndAppManagementRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementRoleAssignment.class);
    }

    /**
     * Gets the DeviceAndAppManagementRoleAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceAndAppManagementRoleAssignment from the service
     *
     * @return the DeviceAndAppManagementRoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAndAppManagementRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceAndAppManagementRoleAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceAndAppManagementRoleAssignment with a source
     *
     * @param sourceDeviceAndAppManagementRoleAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleAssignment> patchAsync(@Nonnull final DeviceAndAppManagementRoleAssignment sourceDeviceAndAppManagementRoleAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Patches this DeviceAndAppManagementRoleAssignment with a source
     *
     * @param sourceDeviceAndAppManagementRoleAssignment the source object with updates
     * @return the updated DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAndAppManagementRoleAssignment patch(@Nonnull final DeviceAndAppManagementRoleAssignment sourceDeviceAndAppManagementRoleAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Creates a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleAssignment> postAsync(@Nonnull final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) {
        return sendAsync(HttpMethod.POST, newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Creates a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the new object to create
     * @return the created DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAndAppManagementRoleAssignment post(@Nonnull final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Creates a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleAssignment> putAsync(@Nonnull final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) {
        return sendAsync(HttpMethod.PUT, newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Creates a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the object to create/update
     * @return the created DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAndAppManagementRoleAssignment put(@Nonnull final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceAndAppManagementRoleAssignmentRequest select(@Nonnull final String value) {
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
     public DeviceAndAppManagementRoleAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

