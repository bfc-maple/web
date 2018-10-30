package com.bfc.web.user.entity;

public class RolePermissionEntity {
    private Integer rolePerssionId;

    private Integer roleId;

    private Integer permissionId;

    private Integer perssionType;

    public Integer getRolePerssionId() {
        return rolePerssionId;
    }

    public void setRolePerssionId(Integer rolePerssionId) {
        this.rolePerssionId = rolePerssionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getPerssionType() {
        return perssionType;
    }

    public void setPerssionType(Integer perssionType) {
        this.perssionType = perssionType;
    }
}