package com.bfc.web.user.entity;

public class GroupPremissionEntity {
    private Integer groupPerssionId;

    private Integer permissionId;

    private Integer groupId;

    private Integer perssionType;

    public Integer getGroupPerssionId() {
        return groupPerssionId;
    }

    public void setGroupPerssionId(Integer groupPerssionId) {
        this.groupPerssionId = groupPerssionId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getPerssionType() {
        return perssionType;
    }

    public void setPerssionType(Integer perssionType) {
        this.perssionType = perssionType;
    }
}