// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Reference Request.
 */
public class ManagedDeviceReferenceRequest extends BaseRequest implements IManagedDeviceReferenceRequest {

    /**
     * The request for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDevice.class);
    }

    public void delete(final ICallback<? super ManagedDevice> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagedDevice delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceReferenceRequest)this;
    }
    /**
     * Puts the ManagedDevice
     *
     * @param srcManagedDevice the ManagedDevice reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedDevice srcManagedDevice, final ICallback<? super ManagedDevice> callback) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/ManagedDevices/" + srcManagedDevice.id));
        send(HttpMethod.PUT, callback, payload);
    }

    /**
     * Puts the ManagedDevice
     *
     * @param srcManagedDevice the ManagedDevice reference to PUT
     * @return the ManagedDevice
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedDevice put(ManagedDevice srcManagedDevice) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/ManagedDevices/" + srcManagedDevice.id));
        return send(HttpMethod.PUT, payload);
    }
}
