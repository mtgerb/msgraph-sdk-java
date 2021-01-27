// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Hex2Bin Parameter Set.
 */
public class WorkbookFunctionsHex2BinParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The places.
     * 
     */
    @SerializedName(value = "places", alternate = {"Places"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement places;


    /**
     * Instiaciates a new WorkbookFunctionsHex2BinParameterSet
     */
    public WorkbookFunctionsHex2BinParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsHex2BinParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsHex2BinParameterSet(@Nonnull final WorkbookFunctionsHex2BinParameterSetBuilder builder) {
        this.number = builder.number;
        this.places = builder.places;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsHex2BinParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsHex2BinParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsHex2BinParameterSet
     */
    public static final class WorkbookFunctionsHex2BinParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsHex2BinParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The places parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement places;
        /**
         * Sets the Places
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsHex2BinParameterSetBuilder withPlaces(@Nullable final com.google.gson.JsonElement val) {
            this.places = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsHex2BinParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsHex2BinParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsHex2BinParameterSet build() {
            return new WorkbookFunctionsHex2BinParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.places != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("places", places));
        }
        return result;
    }
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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}