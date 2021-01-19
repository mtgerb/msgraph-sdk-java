// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedAppRegistration;
import com.microsoft.graph.requests.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.ManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Reference Request.
 */
public class ManagedAppRegistrationReferenceRequest extends BaseReferenceRequest<ManagedAppRegistration> {

    /**
     * The request for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistration.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ManagedAppRegistrationReferenceRequest select(@Nonnull final String value) {
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
    public ManagedAppRegistrationReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the ManagedAppRegistration
     *
     * @param srcManagedAppRegistration the ManagedAppRegistration reference to PUT
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppRegistration> putAsync(@Nonnull final ManagedAppRegistration srcManagedAppRegistration) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/deviceAppManagement/managedAppRegistrations/" + srcManagedAppRegistration.id));
        return sendAsync(HttpMethod.PUT, payload);
    }

    /**
     * Puts the ManagedAppRegistration
     *
     * @param srcManagedAppRegistration the ManagedAppRegistration reference to PUT
     * @return the ManagedAppRegistration
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public ManagedAppRegistration put(@Nonnull final ManagedAppRegistration srcManagedAppRegistration) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/deviceAppManagement/managedAppRegistrations/" + srcManagedAppRegistration.id));
        return send(HttpMethod.PUT, payload);
    }
}
