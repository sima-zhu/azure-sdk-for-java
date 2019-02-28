/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.management.network.v2018_12_01.EndpointServiceResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class EndpointServiceResultImpl extends WrapperImpl<EndpointServiceResultInner> implements EndpointServiceResult {
    private final NetworkManager manager;

    EndpointServiceResultImpl(EndpointServiceResultInner inner,  NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
