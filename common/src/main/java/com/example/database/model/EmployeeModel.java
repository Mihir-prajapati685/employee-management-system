package com.example.database.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class EmployeeModel {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9881357+05:30", comments="Source field: d_employee_tbl.employee_id")
    private Integer employeeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_name")
    private String employeeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_phone_number")
    private String employeePhoneNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_address")
    private String employeeAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_gender")
    private String employeeGender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_date_of_birth")
    private String employeeDateOfBirth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_profile_picture")
    private String employeeProfilePicture;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_department")
    private String employeeDepartment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_role")
    private String employeeRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_salary")
    private Double employeeSalary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_status")
    private String employeeStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9945891+05:30", comments="Source field: d_employee_tbl.eff_ts")
    private Date effTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9945891+05:30", comments="Source field: d_employee_tbl.end_ts")
    private Date endTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9911591+05:30", comments="Source field: d_employee_tbl.employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9911591+05:30", comments="Source field: d_employee_tbl.employee_id")
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_name")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_phone_number")
    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_phone_number")
    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_address")
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_address")
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_gender")
    public String getEmployeeGender() {
        return employeeGender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_gender")
    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_date_of_birth")
    public String getEmployeeDateOfBirth() {
        return employeeDateOfBirth;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_date_of_birth")
    public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
        this.employeeDateOfBirth = employeeDateOfBirth;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_profile_picture")
    public String getEmployeeProfilePicture() {
        return employeeProfilePicture;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9921576+05:30", comments="Source field: d_employee_tbl.employee_profile_picture")
    public void setEmployeeProfilePicture(String employeeProfilePicture) {
        this.employeeProfilePicture = employeeProfilePicture;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_department")
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_department")
    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_role")
    public String getEmployeeRole() {
        return employeeRole;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_role")
    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_salary")
    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_salary")
    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9935834+05:30", comments="Source field: d_employee_tbl.employee_status")
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9945891+05:30", comments="Source field: d_employee_tbl.employee_status")
    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9945891+05:30", comments="Source field: d_employee_tbl.eff_ts")
    public Date getEffTs() {
        return effTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9945891+05:30", comments="Source field: d_employee_tbl.eff_ts")
    public void setEffTs(Date effTs) {
        this.effTs = effTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9945891+05:30", comments="Source field: d_employee_tbl.end_ts")
    public Date getEndTs() {
        return endTs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:42.9945891+05:30", comments="Source field: d_employee_tbl.end_ts")
    public void setEndTs(Date endTs) {
        this.endTs = endTs;
    }
}