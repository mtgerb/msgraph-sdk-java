// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SharedDriveItem;
import com.microsoft.graph.requests.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.DriveItemRequestBuilder;
import com.microsoft.graph.requests.ListRequestBuilder;
import com.microsoft.graph.requests.ListItemRequestBuilder;
import com.microsoft.graph.requests.PermissionRequestBuilder;
import com.microsoft.graph.requests.SiteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared Drive Item Request Builder.
 */
public class SharedDriveItemRequestBuilder extends BaseRequestBuilder<SharedDriveItem> {

    /**
     * The request builder for the SharedDriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharedDriveItemRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SharedDriveItemRequest instance
     */
    @Nonnull
    public SharedDriveItemRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SharedDriveItemRequest instance
     */
    @Nonnull
    public SharedDriveItemRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.SharedDriveItemRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserWithReferenceRequestBuilder createdByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserWithReferenceRequestBuilder lastModifiedByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for DriveItem
     *
     * @return the DriveItemRequestBuilder instance
     */
    @Nonnull
    public DriveItemRequestBuilder driveItem() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("driveItem"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DriveItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DriveItemCollectionRequestBuilder items() {
        return new DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    /**
     * Gets a request builder for the DriveItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DriveItemRequestBuilder items(@Nonnull final String id) {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for List
     *
     * @return the ListRequestBuilder instance
     */
    @Nonnull
    public ListRequestBuilder list() {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("list"), getClient(), null);
    }

    /**
     * Gets the request builder for ListItem
     *
     * @return the ListItemRequestBuilder instance
     */
    @Nonnull
    public ListItemRequestBuilder listItem() {
        return new ListItemRequestBuilder(getRequestUrlWithAdditionalSegment("listItem"), getClient(), null);
    }

    /**
     * Gets the request builder for Permission
     *
     * @return the PermissionRequestBuilder instance
     */
    @Nonnull
    public PermissionRequestBuilder permission() {
        return new PermissionRequestBuilder(getRequestUrlWithAdditionalSegment("permission"), getClient(), null);
    }

    /**
     * Gets the request builder for DriveItem
     *
     * @return the DriveItemRequestBuilder instance
     */
    @Nonnull
    public DriveItemRequestBuilder root() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("root"), getClient(), null);
    }

    /**
     * Gets the request builder for Site
     *
     * @return the SiteRequestBuilder instance
     */
    @Nonnull
    public SiteRequestBuilder site() {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("site"), getClient(), null);
    }
}