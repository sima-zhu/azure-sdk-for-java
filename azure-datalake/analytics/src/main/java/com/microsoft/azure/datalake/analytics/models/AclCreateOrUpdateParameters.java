/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters used to create or update an access control list (ACL) entry.
 */
public class AclCreateOrUpdateParameters {
    /**
     * the access control list (ACL) entry type. UserObj and GroupObj denote
     * the owning user and group, respectively. Possible values include:
     * 'UserObj', 'GroupObj', 'Other', 'User', 'Group'.
     */
    @JsonProperty(value = "aceType", required = true)
    private AclType aceType;

    /**
     * the Azure AD object ID of the user or group being specified in the
     * access control list (ACL) entry.
     */
    @JsonProperty(value = "principalId", required = true)
    private UUID principalId;

    /**
     * the permission type of the access control list (ACL) entry. Possible
     * values include: 'None', 'Use', 'Create', 'Drop', 'Alter', 'Write',
     * 'All'.
     */
    @JsonProperty(value = "permission", required = true)
    private PermissionType permission;

    /**
     * Get the access control list (ACL) entry type. UserObj and GroupObj denote the owning user and group, respectively. Possible values include: 'UserObj', 'GroupObj', 'Other', 'User', 'Group'.
     *
     * @return the aceType value
     */
    public AclType aceType() {
        return this.aceType;
    }

    /**
     * Set the access control list (ACL) entry type. UserObj and GroupObj denote the owning user and group, respectively. Possible values include: 'UserObj', 'GroupObj', 'Other', 'User', 'Group'.
     *
     * @param aceType the aceType value to set
     * @return the AclCreateOrUpdateParameters object itself.
     */
    public AclCreateOrUpdateParameters withAceType(AclType aceType) {
        this.aceType = aceType;
        return this;
    }

    /**
     * Get the Azure AD object ID of the user or group being specified in the access control list (ACL) entry.
     *
     * @return the principalId value
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Set the Azure AD object ID of the user or group being specified in the access control list (ACL) entry.
     *
     * @param principalId the principalId value to set
     * @return the AclCreateOrUpdateParameters object itself.
     */
    public AclCreateOrUpdateParameters withPrincipalId(UUID principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the permission type of the access control list (ACL) entry. Possible values include: 'None', 'Use', 'Create', 'Drop', 'Alter', 'Write', 'All'.
     *
     * @return the permission value
     */
    public PermissionType permission() {
        return this.permission;
    }

    /**
     * Set the permission type of the access control list (ACL) entry. Possible values include: 'None', 'Use', 'Create', 'Drop', 'Alter', 'Write', 'All'.
     *
     * @param permission the permission value to set
     * @return the AclCreateOrUpdateParameters object itself.
     */
    public AclCreateOrUpdateParameters withPermission(PermissionType permission) {
        this.permission = permission;
        return this;
    }

}
