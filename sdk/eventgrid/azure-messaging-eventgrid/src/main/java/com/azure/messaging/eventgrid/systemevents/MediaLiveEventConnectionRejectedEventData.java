// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encoder connection rejected event data. */
@Immutable
public final class MediaLiveEventConnectionRejectedEventData {
    /*
     * Gets the ingest URL provided by the live event.
     */
    @JsonProperty(value = "ingestUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String ingestUrl;

    /*
     * Gets the stream Id.
     */
    @JsonProperty(value = "streamId", access = JsonProperty.Access.WRITE_ONLY)
    private String streamId;

    /*
     * Gets the remote IP.
     */
    @JsonProperty(value = "encoderIp", access = JsonProperty.Access.WRITE_ONLY)
    private String encoderIp;

    /*
     * Gets the remote port.
     */
    @JsonProperty(value = "encoderPort", access = JsonProperty.Access.WRITE_ONLY)
    private String encoderPort;

    /*
     * Gets the result code.
     */
    @JsonProperty(value = "resultCode", access = JsonProperty.Access.WRITE_ONLY)
    private String resultCode;

    /**
     * Get the ingestUrl property: Gets the ingest URL provided by the live event.
     *
     * @return the ingestUrl value.
     */
    public String getIngestUrl() {
        return this.ingestUrl;
    }

    /**
     * Get the streamId property: Gets the stream Id.
     *
     * @return the streamId value.
     */
    public String getStreamId() {
        return this.streamId;
    }

    /**
     * Get the encoderIp property: Gets the remote IP.
     *
     * @return the encoderIp value.
     */
    public String getEncoderIp() {
        return this.encoderIp;
    }

    /**
     * Get the encoderPort property: Gets the remote port.
     *
     * @return the encoderPort value.
     */
    public String getEncoderPort() {
        return this.encoderPort;
    }

    /**
     * Get the resultCode property: Gets the result code.
     *
     * @return the resultCode value.
     */
    public String getResultCode() {
        return this.resultCode;
    }
}
