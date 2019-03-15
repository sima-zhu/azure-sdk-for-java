/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Trigger that runs every time the selected Blob container changes.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BlobTrigger")
@JsonFlatten
public class BlobTrigger extends MultiplePipelineTrigger {
    /**
     * The path of the container/folder that will trigger the pipeline.
     */
    @JsonProperty(value = "typeProperties.folderPath", required = true)
    private String folderPath;

    /**
     * The max number of parallel files to handle when it is triggered.
     */
    @JsonProperty(value = "typeProperties.maxConcurrency", required = true)
    private int maxConcurrency;

    /**
     * The Azure Storage linked service reference.
     */
    @JsonProperty(value = "typeProperties.linkedService", required = true)
    private LinkedServiceReference linkedService;

    /**
     * Get the path of the container/folder that will trigger the pipeline.
     *
     * @return the folderPath value
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the path of the container/folder that will trigger the pipeline.
     *
     * @param folderPath the folderPath value to set
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the max number of parallel files to handle when it is triggered.
     *
     * @return the maxConcurrency value
     */
    public int maxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the max number of parallel files to handle when it is triggered.
     *
     * @param maxConcurrency the maxConcurrency value to set
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withMaxConcurrency(int maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * Get the Azure Storage linked service reference.
     *
     * @return the linkedService value
     */
    public LinkedServiceReference linkedService() {
        return this.linkedService;
    }

    /**
     * Set the Azure Storage linked service reference.
     *
     * @param linkedService the linkedService value to set
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withLinkedService(LinkedServiceReference linkedService) {
        this.linkedService = linkedService;
        return this;
    }

}
