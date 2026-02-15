package com.example.database.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class EmployeeModelDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0000248+05:30", comments="Source Table: d_employee_tbl")
    public static final EmployeeModel employeeModel = new EmployeeModel();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0020189+05:30", comments="Source field: d_employee_tbl.employee_id")
    public static final SqlColumn<Integer> employeeId = employeeModel.employeeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0030238+05:30", comments="Source field: d_employee_tbl.employee_name")
    public static final SqlColumn<String> employeeName = employeeModel.employeeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0030238+05:30", comments="Source field: d_employee_tbl.employee_phone_number")
    public static final SqlColumn<String> employeePhoneNumber = employeeModel.employeePhoneNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0030238+05:30", comments="Source field: d_employee_tbl.employee_address")
    public static final SqlColumn<String> employeeAddress = employeeModel.employeeAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0030238+05:30", comments="Source field: d_employee_tbl.employee_gender")
    public static final SqlColumn<String> employeeGender = employeeModel.employeeGender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0030238+05:30", comments="Source field: d_employee_tbl.employee_date_of_birth")
    public static final SqlColumn<String> employeeDateOfBirth = employeeModel.employeeDateOfBirth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0030238+05:30", comments="Source field: d_employee_tbl.employee_profile_picture")
    public static final SqlColumn<String> employeeProfilePicture = employeeModel.employeeProfilePicture;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0030238+05:30", comments="Source field: d_employee_tbl.employee_department")
    public static final SqlColumn<String> employeeDepartment = employeeModel.employeeDepartment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0030238+05:30", comments="Source field: d_employee_tbl.employee_role")
    public static final SqlColumn<String> employeeRole = employeeModel.employeeRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0043512+05:30", comments="Source field: d_employee_tbl.employee_salary")
    public static final SqlColumn<Double> employeeSalary = employeeModel.employeeSalary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0043512+05:30", comments="Source field: d_employee_tbl.employee_status")
    public static final SqlColumn<String> employeeStatus = employeeModel.employeeStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0043512+05:30", comments="Source field: d_employee_tbl.eff_ts")
    public static final SqlColumn<Date> effTs = employeeModel.effTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0043512+05:30", comments="Source field: d_employee_tbl.end_ts")
    public static final SqlColumn<Date> endTs = employeeModel.endTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0010294+05:30", comments="Source Table: d_employee_tbl")
    public static final class EmployeeModel extends AliasableSqlTable<EmployeeModel> {
        public final SqlColumn<Integer> employeeId = column("employee_id", JDBCType.INTEGER);

        public final SqlColumn<String> employeeName = column("employee_name", JDBCType.VARCHAR);

        public final SqlColumn<String> employeePhoneNumber = column("employee_phone_number", JDBCType.VARCHAR);

        public final SqlColumn<String> employeeAddress = column("employee_address", JDBCType.VARCHAR);

        public final SqlColumn<String> employeeGender = column("employee_gender", JDBCType.CHAR);

        public final SqlColumn<String> employeeDateOfBirth = column("employee_date_of_birth", JDBCType.VARCHAR);

        public final SqlColumn<String> employeeProfilePicture = column("employee_profile_picture", JDBCType.VARCHAR);

        public final SqlColumn<String> employeeDepartment = column("employee_department", JDBCType.CHAR);

        public final SqlColumn<String> employeeRole = column("employee_role", JDBCType.CHAR);

        public final SqlColumn<Double> employeeSalary = column("employee_salary", JDBCType.DOUBLE);

        public final SqlColumn<String> employeeStatus = column("employee_status", JDBCType.CHAR);

        public final SqlColumn<Date> effTs = column("eff_ts", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTs = column("end_ts", JDBCType.TIMESTAMP);

        public EmployeeModel() {
            super("d_employee_tbl", EmployeeModel::new);
        }
    }
}