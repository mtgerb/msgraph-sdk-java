// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceComplianceActionItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Action Item Request.
 */
public class DeviceComplianceActionItemRequest extends BaseRequest<DeviceComplianceActionItem> {
	
    /**
     * The request for the DeviceComplianceActionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceActionItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceActionItem.class);
    }

    /**
     * Gets the DeviceComplianceActionItem from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceActionItem> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceComplianceActionItem from the service
     *
     * @return the DeviceComplianceActionItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceActionItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceActionItem> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceComplianceActionItem delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceComplianceActionItem with a source
     *
     * @param sourceDeviceComplianceActionItem the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceActionItem> patchAsync(@Nonnull final DeviceComplianceActionItem sourceDeviceComplianceActionItem) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceComplianceActionItem);
    }

    /**
     * Patches this DeviceComplianceActionItem with a source
     *
     * @param sourceDeviceComplianceActionItem the source object with updates
     * @return the updated DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceActionItem patch(@Nonnull final DeviceComplianceActionItem sourceDeviceComplianceActionItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceActionItem> postAsync(@Nonnull final DeviceComplianceActionItem newDeviceComplianceActionItem) {
        return sendAsync(HttpMethod.POST, newDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the new object to create
     * @return the created DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceActionItem post(@Nonnull final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceActionItem> putAsync(@Nonnull final DeviceComplianceActionItem newDeviceComplianceActionItem) {
        return sendAsync(HttpMethod.PUT, newDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the object to create/update
     * @return the created DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceActionItem put(@Nonnull final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceActionItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceComplianceActionItemRequest select(@Nonnull final String value) {
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
     public DeviceComplianceActionItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
