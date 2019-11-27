// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.certificates;

import com.azure.security.keyvault.certificates.models.CertificatePolicy;
import com.azure.security.keyvault.certificates.models.MergeCertificateOptions;

/**
 * Represents well known issuer names to refer in {@link CertificatePolicy}
 */
public class WellKnownIssuerNames {

    /**
     * Create a self-issued certificate.
     */
    public static final String SELF = "Self";


    /**
     * Creates a certificate that requires merging an external X.509 certificate using
     * {@link CertificateClient#mergeCertificate(MergeCertificateOptions)} or
     * {@link CertificateAsyncClient#mergeCertificate(MergeCertificateOptions)}.
     */
    public static final String UNKNOWN = "Unknown";

}
