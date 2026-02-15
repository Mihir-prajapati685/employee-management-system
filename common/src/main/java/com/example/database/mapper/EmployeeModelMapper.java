package com.example.database.mapper;

import static com.example.database.mapper.EmployeeModelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.database.model.EmployeeModel;
import jakarta.annotation.Generated;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface EmployeeModelMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0224179+05:30", comments="Source Table: d_employee_tbl")
    BasicColumn[] selectList = BasicColumn.columnList(employeeId, employeeName, employeePhoneNumber, employeeAddress, employeeGender, employeeDateOfBirth, employeeProfilePicture, employeeDepartment, employeeRole, employeeSalary, employeeStatus, effTs, endTs);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.005348+05:30", comments="Source Table: d_employee_tbl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="row.employeeId", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<EmployeeModel> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.013858+05:30", comments="Source Table: d_employee_tbl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EmployeeModelResult", value = {
            @Result(column="employee_id", property="employeeId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="employee_name", property="employeeName", jdbcType=JdbcType.VARCHAR),
            @Result(column="employee_phone_number", property="employeePhoneNumber", jdbcType=JdbcType.VARCHAR),
            @Result(column="employee_address", property="employeeAddress", jdbcType=JdbcType.VARCHAR),
            @Result(column="employee_gender", property="employeeGender", jdbcType=JdbcType.CHAR),
            @Result(column="employee_date_of_birth", property="employeeDateOfBirth", jdbcType=JdbcType.VARCHAR),
            @Result(column="employee_profile_picture", property="employeeProfilePicture", jdbcType=JdbcType.VARCHAR),
            @Result(column="employee_department", property="employeeDepartment", jdbcType=JdbcType.CHAR),
            @Result(column="employee_role", property="employeeRole", jdbcType=JdbcType.CHAR),
            @Result(column="employee_salary", property="employeeSalary", jdbcType=JdbcType.DOUBLE),
            @Result(column="employee_status", property="employeeStatus", jdbcType=JdbcType.CHAR),
            @Result(column="eff_ts", property="effTs", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="end_ts", property="endTs", jdbcType=JdbcType.TIMESTAMP)
    })
    List<EmployeeModel> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0149074+05:30", comments="Source Table: d_employee_tbl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EmployeeModelResult")
    Optional<EmployeeModel> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0158767+05:30", comments="Source Table: d_employee_tbl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, employeeModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0158767+05:30", comments="Source Table: d_employee_tbl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, employeeModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.017286+05:30", comments="Source Table: d_employee_tbl")
    default int deleteByPrimaryKey(Integer employeeId_) {
        return delete(c ->
                c.where(employeeId, isEqualTo(employeeId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0184366+05:30", comments="Source Table: d_employee_tbl")
    default int insert(EmployeeModel row) {
        return MyBatis3Utils.insert(this::insert, row, employeeModel, c ->
                c.map(employeeName).toProperty("employeeName")
                        .map(employeePhoneNumber).toProperty("employeePhoneNumber")
                        .map(employeeAddress).toProperty("employeeAddress")
                        .map(employeeGender).toProperty("employeeGender")
                        .map(employeeDateOfBirth).toProperty("employeeDateOfBirth")
                        .map(employeeProfilePicture).toProperty("employeeProfilePicture")
                        .map(employeeDepartment).toProperty("employeeDepartment")
                        .map(employeeRole).toProperty("employeeRole")
                        .map(employeeSalary).toProperty("employeeSalary")
                        .map(employeeStatus).toProperty("employeeStatus")
                        .map(effTs).toProperty("effTs")
                        .map(endTs).toProperty("endTs")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0204146+05:30", comments="Source Table: d_employee_tbl")
    default int insertSelective(EmployeeModel row) {
        return MyBatis3Utils.insert(this::insert, row, employeeModel, c ->
                c.map(employeeName).toPropertyWhenPresent("employeeName", row::getEmployeeName)
                        .map(employeePhoneNumber).toPropertyWhenPresent("employeePhoneNumber", row::getEmployeePhoneNumber)
                        .map(employeeAddress).toPropertyWhenPresent("employeeAddress", row::getEmployeeAddress)
                        .map(employeeGender).toPropertyWhenPresent("employeeGender", row::getEmployeeGender)
                        .map(employeeDateOfBirth).toPropertyWhenPresent("employeeDateOfBirth", row::getEmployeeDateOfBirth)
                        .map(employeeProfilePicture).toPropertyWhenPresent("employeeProfilePicture", row::getEmployeeProfilePicture)
                        .map(employeeDepartment).toPropertyWhenPresent("employeeDepartment", row::getEmployeeDepartment)
                        .map(employeeRole).toPropertyWhenPresent("employeeRole", row::getEmployeeRole)
                        .map(employeeSalary).toPropertyWhenPresent("employeeSalary", row::getEmployeeSalary)
                        .map(employeeStatus).toPropertyWhenPresent("employeeStatus", row::getEmployeeStatus)
                        .map(effTs).toPropertyWhenPresent("effTs", row::getEffTs)
                        .map(endTs).toPropertyWhenPresent("endTs", row::getEndTs)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0244309+05:30", comments="Source Table: d_employee_tbl")
    default Optional<EmployeeModel> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, employeeModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0254223+05:30", comments="Source Table: d_employee_tbl")
    default List<EmployeeModel> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, employeeModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0254223+05:30", comments="Source Table: d_employee_tbl")
    default List<EmployeeModel> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, employeeModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0278683+05:30", comments="Source Table: d_employee_tbl")
    default Optional<EmployeeModel> selectByPrimaryKey(Integer employeeId_) {
        return selectOne(c ->
                c.where(employeeId, isEqualTo(employeeId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0288799+05:30", comments="Source Table: d_employee_tbl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, employeeModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0288799+05:30", comments="Source Table: d_employee_tbl")
    static UpdateDSL<UpdateModel> updateAllColumns(EmployeeModel row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(employeeName).equalTo(row::getEmployeeName)
                .set(employeePhoneNumber).equalTo(row::getEmployeePhoneNumber)
                .set(employeeAddress).equalTo(row::getEmployeeAddress)
                .set(employeeGender).equalTo(row::getEmployeeGender)
                .set(employeeDateOfBirth).equalTo(row::getEmployeeDateOfBirth)
                .set(employeeProfilePicture).equalTo(row::getEmployeeProfilePicture)
                .set(employeeDepartment).equalTo(row::getEmployeeDepartment)
                .set(employeeRole).equalTo(row::getEmployeeRole)
                .set(employeeSalary).equalTo(row::getEmployeeSalary)
                .set(employeeStatus).equalTo(row::getEmployeeStatus)
                .set(effTs).equalTo(row::getEffTs)
                .set(endTs).equalTo(row::getEndTs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0298973+05:30", comments="Source Table: d_employee_tbl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EmployeeModel row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(employeeName).equalToWhenPresent(row::getEmployeeName)
                .set(employeePhoneNumber).equalToWhenPresent(row::getEmployeePhoneNumber)
                .set(employeeAddress).equalToWhenPresent(row::getEmployeeAddress)
                .set(employeeGender).equalToWhenPresent(row::getEmployeeGender)
                .set(employeeDateOfBirth).equalToWhenPresent(row::getEmployeeDateOfBirth)
                .set(employeeProfilePicture).equalToWhenPresent(row::getEmployeeProfilePicture)
                .set(employeeDepartment).equalToWhenPresent(row::getEmployeeDepartment)
                .set(employeeRole).equalToWhenPresent(row::getEmployeeRole)
                .set(employeeSalary).equalToWhenPresent(row::getEmployeeSalary)
                .set(employeeStatus).equalToWhenPresent(row::getEmployeeStatus)
                .set(effTs).equalToWhenPresent(row::getEffTs)
                .set(endTs).equalToWhenPresent(row::getEndTs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0318962+05:30", comments="Source Table: d_employee_tbl")
    default int updateByPrimaryKey(EmployeeModel row) {
        return update(c ->
                c.set(employeeName).equalTo(row::getEmployeeName)
                        .set(employeePhoneNumber).equalTo(row::getEmployeePhoneNumber)
                        .set(employeeAddress).equalTo(row::getEmployeeAddress)
                        .set(employeeGender).equalTo(row::getEmployeeGender)
                        .set(employeeDateOfBirth).equalTo(row::getEmployeeDateOfBirth)
                        .set(employeeProfilePicture).equalTo(row::getEmployeeProfilePicture)
                        .set(employeeDepartment).equalTo(row::getEmployeeDepartment)
                        .set(employeeRole).equalTo(row::getEmployeeRole)
                        .set(employeeSalary).equalTo(row::getEmployeeSalary)
                        .set(employeeStatus).equalTo(row::getEmployeeStatus)
                        .set(effTs).equalTo(row::getEffTs)
                        .set(endTs).equalTo(row::getEndTs)
                        .where(employeeId, isEqualTo(row::getEmployeeId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-12-03T21:28:43.0329154+05:30", comments="Source Table: d_employee_tbl")
    default int updateByPrimaryKeySelective(EmployeeModel row) {
        return update(c ->
                c.set(employeeName).equalToWhenPresent(row::getEmployeeName)
                        .set(employeePhoneNumber).equalToWhenPresent(row::getEmployeePhoneNumber)
                        .set(employeeAddress).equalToWhenPresent(row::getEmployeeAddress)
                        .set(employeeGender).equalToWhenPresent(row::getEmployeeGender)
                        .set(employeeDateOfBirth).equalToWhenPresent(row::getEmployeeDateOfBirth)
                        .set(employeeProfilePicture).equalToWhenPresent(row::getEmployeeProfilePicture)
                        .set(employeeDepartment).equalToWhenPresent(row::getEmployeeDepartment)
                        .set(employeeRole).equalToWhenPresent(row::getEmployeeRole)
                        .set(employeeSalary).equalToWhenPresent(row::getEmployeeSalary)
                        .set(employeeStatus).equalToWhenPresent(row::getEmployeeStatus)
                        .set(effTs).equalToWhenPresent(row::getEffTs)
                        .set(endTs).equalToWhenPresent(row::getEndTs)
                        .where(employeeId, isEqualTo(row::getEmployeeId))
        );
    }
}