/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StoredProcedureParameterType.
 */
public final class StoredProcedureParameterType extends ExpandableStringEnum<StoredProcedureParameterType> {
    /** Static value String for StoredProcedureParameterType. */
    public static final StoredProcedureParameterType STRING = fromString("String");

    /** Static value Int for StoredProcedureParameterType. */
    public static final StoredProcedureParameterType INT = fromString("Int");

    /** Static value Decimal for StoredProcedureParameterType. */
    public static final StoredProcedureParameterType DECIMAL = fromString("Decimal");

    /** Static value Guid for StoredProcedureParameterType. */
    public static final StoredProcedureParameterType GUID = fromString("Guid");

    /** Static value Boolean for StoredProcedureParameterType. */
    public static final StoredProcedureParameterType BOOLEAN = fromString("Boolean");

    /** Static value Date for StoredProcedureParameterType. */
    public static final StoredProcedureParameterType DATE = fromString("Date");

    /**
     * Creates or finds a StoredProcedureParameterType from its string representation.
     * @param name a name to look for
     * @return the corresponding StoredProcedureParameterType
     */
    @JsonCreator
    public static StoredProcedureParameterType fromString(String name) {
        return fromString(name, StoredProcedureParameterType.class);
    }

    /**
     * @return known StoredProcedureParameterType values
     */
    public static Collection<StoredProcedureParameterType> values() {
        return values(StoredProcedureParameterType.class);
    }
}
