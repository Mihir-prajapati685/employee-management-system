package com.example.database.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class UserModel {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.sub_uuid")
    private String subUuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.phone_number")
    private String phoneNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.verified")
    private String verified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source field: d_user_tbl.eff_ts")
    private Date effTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source field: d_user_tbl.end_ts")
    private Date endTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.sub_uuid")
    public String getSubUuid() {
        return subUuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.sub_uuid")
    public void setSubUuid(String subUuid) {
        this.subUuid = subUuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3023842+05:30", comments="Source field: d_user_tbl.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source field: d_user_tbl.verified")
    public String getVerified() {
        return verified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source field: d_user_tbl.verified")
    public void setVerified(String verified) {
        this.verified = verified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source field: d_user_tbl.eff_ts")
    public Date getEffTs() {
        return effTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source field: d_user_tbl.eff_ts")
    public void setEffTs(Date effTs) {
        this.effTs = effTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source field: d_user_tbl.end_ts")
    public Date getEndTs() {
        return endTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source field: d_user_tbl.end_ts")
    public void setEndTs(Date endTs) {
        this.endTs = endTs;
    }
}