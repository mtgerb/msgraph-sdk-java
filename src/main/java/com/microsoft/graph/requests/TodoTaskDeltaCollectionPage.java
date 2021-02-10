// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TodoTask;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.TodoTaskDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.TodoTaskDeltaCollectionPage;
import com.microsoft.graph.requests.TodoTaskDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task Delta Collection Page.
 */
public class TodoTaskDeltaCollectionPage extends DeltaCollectionPage<TodoTask, TodoTaskDeltaCollectionRequestBuilder> {

    /**
     * A collection page for TodoTask.
     *
     * @param response The serialized TodoTaskDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public TodoTaskDeltaCollectionPage(@Nonnull final TodoTaskDeltaCollectionResponse response, @Nonnull final TodoTaskDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for TodoTaskDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TodoTaskDeltaCollectionPage(@Nonnull final java.util.List<TodoTask> pageContents, @Nullable final TodoTaskDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}