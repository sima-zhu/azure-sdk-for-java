/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.IntegrationRuntimeConnectionInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class IntegrationRuntimeConnectionInfoImpl extends WrapperImpl<IntegrationRuntimeConnectionInfoInner> implements IntegrationRuntimeConnectionInfo {
    private final DataFactoryManager manager;
    IntegrationRuntimeConnectionInfoImpl(IntegrationRuntimeConnectionInfoInner inner, DataFactoryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, Object> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public String hostServiceUri() {
        return this.inner().hostServiceUri();
    }

    @Override
    public String identityCertThumbprint() {
        return this.inner().identityCertThumbprint();
    }

    @Override
    public Boolean isIdentityCertExprired() {
        return this.inner().isIdentityCertExprired();
    }

    @Override
    public String publicKey() {
        return this.inner().publicKey();
    }

    @Override
    public String serviceToken() {
        return this.inner().serviceToken();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

}
