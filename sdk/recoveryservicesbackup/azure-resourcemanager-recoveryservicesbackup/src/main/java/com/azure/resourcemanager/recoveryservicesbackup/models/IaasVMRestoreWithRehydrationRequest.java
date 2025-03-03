// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** IaaS VM workload-specific restore with integrated rehydration of recovery point. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("IaasVMRestoreWithRehydrationRequest")
@Fluent
public final class IaasVMRestoreWithRehydrationRequest extends IaasVMRestoreRequest {
    /*
     * RP Rehydration Info
     */
    @JsonProperty(value = "recoveryPointRehydrationInfo")
    private RecoveryPointRehydrationInfo recoveryPointRehydrationInfo;

    /** Creates an instance of IaasVMRestoreWithRehydrationRequest class. */
    public IaasVMRestoreWithRehydrationRequest() {
    }

    /**
     * Get the recoveryPointRehydrationInfo property: RP Rehydration Info.
     *
     * @return the recoveryPointRehydrationInfo value.
     */
    public RecoveryPointRehydrationInfo recoveryPointRehydrationInfo() {
        return this.recoveryPointRehydrationInfo;
    }

    /**
     * Set the recoveryPointRehydrationInfo property: RP Rehydration Info.
     *
     * @param recoveryPointRehydrationInfo the recoveryPointRehydrationInfo value to set.
     * @return the IaasVMRestoreWithRehydrationRequest object itself.
     */
    public IaasVMRestoreWithRehydrationRequest withRecoveryPointRehydrationInfo(
        RecoveryPointRehydrationInfo recoveryPointRehydrationInfo) {
        this.recoveryPointRehydrationInfo = recoveryPointRehydrationInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withRecoveryPointId(String recoveryPointId) {
        super.withRecoveryPointId(recoveryPointId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withRecoveryType(RecoveryType recoveryType) {
        super.withRecoveryType(recoveryType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withTargetVirtualMachineId(String targetVirtualMachineId) {
        super.withTargetVirtualMachineId(targetVirtualMachineId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withTargetResourceGroupId(String targetResourceGroupId) {
        super.withTargetResourceGroupId(targetResourceGroupId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withStorageAccountId(String storageAccountId) {
        super.withStorageAccountId(storageAccountId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withVirtualNetworkId(String virtualNetworkId) {
        super.withVirtualNetworkId(virtualNetworkId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withSubnetId(String subnetId) {
        super.withSubnetId(subnetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withTargetDomainNameId(String targetDomainNameId) {
        super.withTargetDomainNameId(targetDomainNameId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withRegion(String region) {
        super.withRegion(region);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withAffinityGroup(String affinityGroup) {
        super.withAffinityGroup(affinityGroup);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withCreateNewCloudService(Boolean createNewCloudService) {
        super.withCreateNewCloudService(createNewCloudService);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withOriginalStorageAccountOption(Boolean originalStorageAccountOption) {
        super.withOriginalStorageAccountOption(originalStorageAccountOption);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withEncryptionDetails(EncryptionDetails encryptionDetails) {
        super.withEncryptionDetails(encryptionDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withRestoreDiskLunList(List<Integer> restoreDiskLunList) {
        super.withRestoreDiskLunList(restoreDiskLunList);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withRestoreWithManagedDisks(Boolean restoreWithManagedDisks) {
        super.withRestoreWithManagedDisks(restoreWithManagedDisks);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withDiskEncryptionSetId(String diskEncryptionSetId) {
        super.withDiskEncryptionSetId(diskEncryptionSetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withZones(List<String> zones) {
        super.withZones(zones);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withIdentityInfo(IdentityInfo identityInfo) {
        super.withIdentityInfo(identityInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IaasVMRestoreWithRehydrationRequest withIdentityBasedRestoreDetails(
        IdentityBasedRestoreDetails identityBasedRestoreDetails) {
        super.withIdentityBasedRestoreDetails(identityBasedRestoreDetails);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (recoveryPointRehydrationInfo() != null) {
            recoveryPointRehydrationInfo().validate();
        }
    }
}
