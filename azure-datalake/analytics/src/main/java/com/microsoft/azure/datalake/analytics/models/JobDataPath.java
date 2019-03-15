/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics U-SQL job data path item.
 */
public class JobDataPath {
    /**
     * Gets the id of the job this data is for.
     */
    @JsonProperty(value = "jobId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID jobId;

    /**
     * Gets the command that this job data relates to.
     */
    @JsonProperty(value = "command", access = JsonProperty.Access.WRITE_ONLY)
    private String command;

    /**
     * Gets the list of paths to all of the job data.
     */
    @JsonProperty(value = "paths", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> paths;

    /**
     * Get gets the id of the job this data is for.
     *
     * @return the jobId value
     */
    public UUID jobId() {
        return this.jobId;
    }

    /**
     * Get gets the command that this job data relates to.
     *
     * @return the command value
     */
    public String command() {
        return this.command;
    }

    /**
     * Get gets the list of paths to all of the job data.
     *
     * @return the paths value
     */
    public List<String> paths() {
        return this.paths;
    }

}
