// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MessageRuleActions;
import com.microsoft.graph.models.extensions.MessageRulePredicates;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Rule.
 */
public class MessageRule extends Entity implements IJsonBackedObject {


    /**
     * The Actions.
     * Actions to be taken on a message when the corresponding conditions are fulfilled.
     */
    @SerializedName(value = "actions", alternate = {"Actions"})
    @Expose
    public MessageRuleActions actions;

    /**
     * The Conditions.
     * Conditions that when fulfilled, will trigger the corresponding actions for that rule.
     */
    @SerializedName(value = "conditions", alternate = {"Conditions"})
    @Expose
    public MessageRulePredicates conditions;

    /**
     * The Display Name.
     * The display name of the rule.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Exceptions.
     * Exception conditions for the rule.
     */
    @SerializedName(value = "exceptions", alternate = {"Exceptions"})
    @Expose
    public MessageRulePredicates exceptions;

    /**
     * The Has Error.
     * Indicates whether the rule is in an error condition. Read-only.
     */
    @SerializedName(value = "hasError", alternate = {"HasError"})
    @Expose
    public Boolean hasError;

    /**
     * The Is Enabled.
     * Indicates whether the rule is enabled to be applied to messages.
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
    public Boolean isEnabled;

    /**
     * The Is Read Only.
     * Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
     */
    @SerializedName(value = "isReadOnly", alternate = {"IsReadOnly"})
    @Expose
    public Boolean isReadOnly;

    /**
     * The Sequence.
     * Indicates the order in which the rule is executed, among other rules.
     */
    @SerializedName(value = "sequence", alternate = {"Sequence"})
    @Expose
    public Integer sequence;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
