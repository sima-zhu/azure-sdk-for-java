/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.SelfHostedIntegrationRuntimeNodeInner;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Self-hosted integration runtime status.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SelfHosted")
@JsonFlatten
public class SelfHostedIntegrationRuntimeStatus extends IntegrationRuntimeStatus {
    /**
     * The time at which the integration runtime was created, in ISO8601
     * format.
     */
    @JsonProperty(value = "typeProperties.createTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createTime;

    /**
     * The task queue id of the integration runtime.
     */
    @JsonProperty(value = "typeProperties.taskQueueId", access = JsonProperty.Access.WRITE_ONLY)
    private String taskQueueId;

    /**
     * It is used to set the encryption mode for node-node communication
     * channel (when more than 2 self-hosted integration runtime nodes exist).
     * Possible values include: 'NotSet', 'SslEncrypted', 'NotEncrypted'.
     */
    @JsonProperty(value = "typeProperties.internalChannelEncryption", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeInternalChannelEncryptionMode internalChannelEncryption;

    /**
     * Version of the integration runtime.
     */
    @JsonProperty(value = "typeProperties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * The list of nodes for this integration runtime.
     */
    @JsonProperty(value = "typeProperties.nodes")
    private List<SelfHostedIntegrationRuntimeNodeInner> nodes;

    /**
     * The date at which the integration runtime will be scheduled to update,
     * in ISO8601 format.
     */
    @JsonProperty(value = "typeProperties.scheduledUpdateDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime scheduledUpdateDate;

    /**
     * The time in the date scheduled by service to update the integration
     * runtime, e.g., PT03H is 3 hours.
     */
    @JsonProperty(value = "typeProperties.updateDelayOffset", access = JsonProperty.Access.WRITE_ONLY)
    private String updateDelayOffset;

    /**
     * The local time zone offset in hours.
     */
    @JsonProperty(value = "typeProperties.localTimeZoneOffset", access = JsonProperty.Access.WRITE_ONLY)
    private String localTimeZoneOffset;

    /**
     * Object with additional information about integration runtime
     * capabilities.
     */
    @JsonProperty(value = "typeProperties.capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> capabilities;

    /**
     * The URLs for the services used in integration runtime backend service.
     */
    @JsonProperty(value = "typeProperties.serviceUrls", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> serviceUrls;

    /**
     * Whether Self-hosted integration runtime auto update has been turned on.
     * Possible values include: 'On', 'Off'.
     */
    @JsonProperty(value = "typeProperties.autoUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeAutoUpdate autoUpdate;

    /**
     * Status of the integration runtime version.
     */
    @JsonProperty(value = "typeProperties.versionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String versionStatus;

    /**
     * The list of linked integration runtimes that are created to share with
     * this integration runtime.
     */
    @JsonProperty(value = "typeProperties.links")
    private List<LinkedIntegrationRuntime> links;

    /**
     * Get the time at which the integration runtime was created, in ISO8601 format.
     *
     * @return the createTime value
     */
    public DateTime createTime() {
        return this.createTime;
    }

    /**
     * Get the task queue id of the integration runtime.
     *
     * @return the taskQueueId value
     */
    public String taskQueueId() {
        return this.taskQueueId;
    }

    /**
     * Get it is used to set the encryption mode for node-node communication channel (when more than 2 self-hosted integration runtime nodes exist). Possible values include: 'NotSet', 'SslEncrypted', 'NotEncrypted'.
     *
     * @return the internalChannelEncryption value
     */
    public IntegrationRuntimeInternalChannelEncryptionMode internalChannelEncryption() {
        return this.internalChannelEncryption;
    }

    /**
     * Get version of the integration runtime.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the list of nodes for this integration runtime.
     *
     * @return the nodes value
     */
    public List<SelfHostedIntegrationRuntimeNodeInner> nodes() {
        return this.nodes;
    }

    /**
     * Set the list of nodes for this integration runtime.
     *
     * @param nodes the nodes value to set
     * @return the SelfHostedIntegrationRuntimeStatus object itself.
     */
    public SelfHostedIntegrationRuntimeStatus withNodes(List<SelfHostedIntegrationRuntimeNodeInner> nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * Get the date at which the integration runtime will be scheduled to update, in ISO8601 format.
     *
     * @return the scheduledUpdateDate value
     */
    public DateTime scheduledUpdateDate() {
        return this.scheduledUpdateDate;
    }

    /**
     * Get the time in the date scheduled by service to update the integration runtime, e.g., PT03H is 3 hours.
     *
     * @return the updateDelayOffset value
     */
    public String updateDelayOffset() {
        return this.updateDelayOffset;
    }

    /**
     * Get the local time zone offset in hours.
     *
     * @return the localTimeZoneOffset value
     */
    public String localTimeZoneOffset() {
        return this.localTimeZoneOffset;
    }

    /**
     * Get object with additional information about integration runtime capabilities.
     *
     * @return the capabilities value
     */
    public Map<String, String> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the URLs for the services used in integration runtime backend service.
     *
     * @return the serviceUrls value
     */
    public List<String> serviceUrls() {
        return this.serviceUrls;
    }

    /**
     * Get whether Self-hosted integration runtime auto update has been turned on. Possible values include: 'On', 'Off'.
     *
     * @return the autoUpdate value
     */
    public IntegrationRuntimeAutoUpdate autoUpdate() {
        return this.autoUpdate;
    }

    /**
     * Get status of the integration runtime version.
     *
     * @return the versionStatus value
     */
    public String versionStatus() {
        return this.versionStatus;
    }

    /**
     * Get the list of linked integration runtimes that are created to share with this integration runtime.
     *
     * @return the links value
     */
    public List<LinkedIntegrationRuntime> links() {
        return this.links;
    }

    /**
     * Set the list of linked integration runtimes that are created to share with this integration runtime.
     *
     * @param links the links value to set
     * @return the SelfHostedIntegrationRuntimeStatus object itself.
     */
    public SelfHostedIntegrationRuntimeStatus withLinks(List<LinkedIntegrationRuntime> links) {
        this.links = links;
        return this;
    }

}
