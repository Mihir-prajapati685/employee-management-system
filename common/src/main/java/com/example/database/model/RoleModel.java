package com.example.database.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class RoleModel {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.385706+05:30", comments="Source field: dm_role_tbl.role_id")
    private Integer roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.role_name")
    private String roleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.role_discription")
    private String roleDiscription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.eff_ts")
    private Date effTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.end_ts")
    private Date endTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3877105+05:30", comments="Source field: dm_role_tbl.role_id")
    public Integer getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.role_id")
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.role_name")
    public String getRoleName() {
        return roleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.role_name")
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.role_discription")
    public String getRoleDiscription() {
        return roleDiscription;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.role_discription")
    public void setRoleDiscription(String roleDiscription) {
        this.roleDiscription = roleDiscription;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.eff_ts")
    public Date getEffTs() {
        return effTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.eff_ts")
    public void setEffTs(Date effTs) {
        this.effTs = effTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.end_ts")
    public Date getEndTs() {
        return endTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3887081+05:30", comments="Source field: dm_role_tbl.end_ts")
    public void setEndTs(Date endTs) {
        this.endTs = endTs;
    }
}