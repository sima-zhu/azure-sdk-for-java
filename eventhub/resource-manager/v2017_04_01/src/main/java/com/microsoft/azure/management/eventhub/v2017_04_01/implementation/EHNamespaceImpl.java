/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2017_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.eventhub.v2017_04_01.EHNamespace;
import rx.Observable;
import com.microsoft.azure.management.eventhub.v2017_04_01.Sku;
import org.joda.time.DateTime;

class EHNamespaceImpl extends GroupableResourceCoreImpl<EHNamespace, EHNamespaceInner, EHNamespaceImpl, EventHubManager> implements EHNamespace, EHNamespace.Definition, EHNamespace.Update {
    EHNamespaceImpl(String name, EHNamespaceInner inner, EventHubManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<EHNamespace> createResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<EHNamespace> updateResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<EHNamespaceInner> getInnerAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public Boolean isAutoInflateEnabled() {
        return this.inner().isAutoInflateEnabled();
    }

    @Override
    public Boolean kafkaEnabled() {
        return this.inner().kafkaEnabled();
    }

    @Override
    public Integer maximumThroughputUnits() {
        return this.inner().maximumThroughputUnits();
    }

    @Override
    public String metricId() {
        return this.inner().metricId();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String serviceBusEndpoint() {
        return this.inner().serviceBusEndpoint();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime updatedAt() {
        return this.inner().updatedAt();
    }

    @Override
    public EHNamespaceImpl withIsAutoInflateEnabled(Boolean isAutoInflateEnabled) {
        this.inner().withIsAutoInflateEnabled(isAutoInflateEnabled);
        return this;
    }

    @Override
    public EHNamespaceImpl withKafkaEnabled(Boolean kafkaEnabled) {
        this.inner().withKafkaEnabled(kafkaEnabled);
        return this;
    }

    @Override
    public EHNamespaceImpl withMaximumThroughputUnits(Integer maximumThroughputUnits) {
        this.inner().withMaximumThroughputUnits(maximumThroughputUnits);
        return this;
    }

    @Override
    public EHNamespaceImpl withSku(Sku sku) {
        this.inner().withSku(sku);
        return this;
    }

}
