/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Trusted Root certificates of a firewall policy.
 */
@JsonFlatten
public class FirewallPolicyTrustedRootCertificate {
    /**
     * Secret Id of (base-64 encoded unencrypted pfx) the public certificate
     * data stored in KeyVault.
     */
    @JsonProperty(value = "properties.keyVaultSecretId")
    private String keyVaultSecretId;

    /**
     * Name of the trusted root certificate that is unique within a firewall
     * policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get secret Id of (base-64 encoded unencrypted pfx) the public certificate data stored in KeyVault.
     *
     * @return the keyVaultSecretId value
     */
    public String keyVaultSecretId() {
        return this.keyVaultSecretId;
    }

    /**
     * Set secret Id of (base-64 encoded unencrypted pfx) the public certificate data stored in KeyVault.
     *
     * @param keyVaultSecretId the keyVaultSecretId value to set
     * @return the FirewallPolicyTrustedRootCertificate object itself.
     */
    public FirewallPolicyTrustedRootCertificate withKeyVaultSecretId(String keyVaultSecretId) {
        this.keyVaultSecretId = keyVaultSecretId;
        return this;
    }

    /**
     * Get name of the trusted root certificate that is unique within a firewall policy.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the trusted root certificate that is unique within a firewall policy.
     *
     * @param name the name value to set
     * @return the FirewallPolicyTrustedRootCertificate object itself.
     */
    public FirewallPolicyTrustedRootCertificate withName(String name) {
        this.name = name;
        return this;
    }

}