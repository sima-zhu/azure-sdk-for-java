// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SyncCopyStatusType.
 */
public enum SyncCopyStatusType {
    /**
     * Enum value success.
     */
    SUCCESS("success");

    /**
     * The actual serialized value for a SyncCopyStatusType instance.
     */
    private final String value;

    private SyncCopyStatusType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SyncCopyStatusType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SyncCopyStatusType object, or null if unable to parse.
     */
    @JsonCreator
    public static SyncCopyStatusType fromString(String value) {
        SyncCopyStatusType[] items = SyncCopyStatusType.values();
        for (SyncCopyStatusType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
