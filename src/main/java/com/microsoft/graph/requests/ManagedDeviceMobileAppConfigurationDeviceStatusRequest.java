// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Device Status Request.
 */
public class ManagedDeviceMobileAppConfigurationDeviceStatusRequest extends BaseRequest<ManagedDeviceMobileAppConfigurationDeviceStatus> {
	
    /**
     * The request for the ManagedDeviceMobileAppConfigurationDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatusRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationDeviceStatus.class);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationDeviceStatus from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatus> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationDeviceStatus from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationDeviceStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatus> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationDeviceStatus delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationDeviceStatus with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationDeviceStatus the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatus> patchAsync(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus sourceManagedDeviceMobileAppConfigurationDeviceStatus) {
        return sendAsync(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationDeviceStatus with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationDeviceStatus the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationDeviceStatus patch(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus sourceManagedDeviceMobileAppConfigurationDeviceStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceStatus the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatus> postAsync(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus) {
        return sendAsync(HttpMethod.POST, newManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceStatus the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationDeviceStatus post(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceStatus the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationDeviceStatus> putAsync(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus) {
        return sendAsync(HttpMethod.PUT, newManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceStatus the object to create/update
     * @return the created ManagedDeviceMobileAppConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationDeviceStatus put(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedDeviceMobileAppConfigurationDeviceStatusRequest select(@Nonnull final String value) {
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
     public ManagedDeviceMobileAppConfigurationDeviceStatusRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

