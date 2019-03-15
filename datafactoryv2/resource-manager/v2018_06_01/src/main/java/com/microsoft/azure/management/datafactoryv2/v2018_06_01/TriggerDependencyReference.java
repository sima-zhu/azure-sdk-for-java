/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Trigger referenced dependency.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TriggerDependencyReference")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "TumblingWindowTriggerDependencyReference", value = TumblingWindowTriggerDependencyReference.class)
})
public class TriggerDependencyReference extends DependencyReference {
    /**
     * Referenced trigger.
     */
    @JsonProperty(value = "referenceTrigger", required = true)
    private TriggerReference referenceTrigger;

    /**
     * Get referenced trigger.
     *
     * @return the referenceTrigger value
     */
    public TriggerReference referenceTrigger() {
        return this.referenceTrigger;
    }

    /**
     * Set referenced trigger.
     *
     * @param referenceTrigger the referenceTrigger value to set
     * @return the TriggerDependencyReference object itself.
     */
    public TriggerDependencyReference withReferenceTrigger(TriggerReference referenceTrigger) {
        this.referenceTrigger = referenceTrigger;
        return this;
    }

}
