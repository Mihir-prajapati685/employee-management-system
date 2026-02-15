package com.example.database.mapper;

import static com.example.database.mapper.RoleModelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.database.model.RoleModel;
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
public interface RoleModelMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4077086+05:30", comments="Source Table: dm_role_tbl")
    BasicColumn[] selectList = BasicColumn.columnList(roleId, roleName, roleDiscription, effTs, endTs);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3957091+05:30", comments="Source Table: dm_role_tbl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="row.roleId", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<RoleModel> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4007067+05:30", comments="Source Table: dm_role_tbl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleModelResult", value = {
            @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
            @Result(column="role_discription", property="roleDiscription", jdbcType=JdbcType.VARCHAR),
            @Result(column="eff_ts", property="effTs", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="end_ts", property="endTs", jdbcType=JdbcType.TIMESTAMP)
    })
    List<RoleModel> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4017049+05:30", comments="Source Table: dm_role_tbl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleModelResult")
    Optional<RoleModel> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4027082+05:30", comments="Source Table: dm_role_tbl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, roleModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4027082+05:30", comments="Source Table: dm_role_tbl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roleModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4037038+05:30", comments="Source Table: dm_role_tbl")
    default int deleteByPrimaryKey(Integer roleId_) {
        return delete(c ->
                c.where(roleId, isEqualTo(roleId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4047043+05:30", comments="Source Table: dm_role_tbl")
    default int insert(RoleModel row) {
        return MyBatis3Utils.insert(this::insert, row, roleModel, c ->
                c.map(roleName).toProperty("roleName")
                        .map(roleDiscription).toProperty("roleDiscription")
                        .map(effTs).toProperty("effTs")
                        .map(endTs).toProperty("endTs")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4057068+05:30", comments="Source Table: dm_role_tbl")
    default int insertSelective(RoleModel row) {
        return MyBatis3Utils.insert(this::insert, row, roleModel, c ->
                c.map(roleName).toPropertyWhenPresent("roleName", row::getRoleName)
                        .map(roleDiscription).toPropertyWhenPresent("roleDiscription", row::getRoleDiscription)
                        .map(effTs).toPropertyWhenPresent("effTs", row::getEffTs)
                        .map(endTs).toPropertyWhenPresent("endTs", row::getEndTs)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4087068+05:30", comments="Source Table: dm_role_tbl")
    default Optional<RoleModel> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roleModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4097116+05:30", comments="Source Table: dm_role_tbl")
    default List<RoleModel> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roleModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4107092+05:30", comments="Source Table: dm_role_tbl")
    default List<RoleModel> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roleModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4107092+05:30", comments="Source Table: dm_role_tbl")
    default Optional<RoleModel> selectByPrimaryKey(Integer roleId_) {
        return selectOne(c ->
                c.where(roleId, isEqualTo(roleId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4117018+05:30", comments="Source Table: dm_role_tbl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roleModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4117018+05:30", comments="Source Table: dm_role_tbl")
    static UpdateDSL<UpdateModel> updateAllColumns(RoleModel row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(roleName).equalTo(row::getRoleName)
                .set(roleDiscription).equalTo(row::getRoleDiscription)
                .set(effTs).equalTo(row::getEffTs)
                .set(endTs).equalTo(row::getEndTs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4137072+05:30", comments="Source Table: dm_role_tbl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RoleModel row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(roleName).equalToWhenPresent(row::getRoleName)
                .set(roleDiscription).equalToWhenPresent(row::getRoleDiscription)
                .set(effTs).equalToWhenPresent(row::getEffTs)
                .set(endTs).equalToWhenPresent(row::getEndTs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4157087+05:30", comments="Source Table: dm_role_tbl")
    default int updateByPrimaryKey(RoleModel row) {
        return update(c ->
                c.set(roleName).equalTo(row::getRoleName)
                        .set(roleDiscription).equalTo(row::getRoleDiscription)
                        .set(effTs).equalTo(row::getEffTs)
                        .set(endTs).equalTo(row::getEndTs)
                        .where(roleId, isEqualTo(row::getRoleId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.4167058+05:30", comments="Source Table: dm_role_tbl")
    default int updateByPrimaryKeySelective(RoleModel row) {
        return update(c ->
                c.set(roleName).equalToWhenPresent(row::getRoleName)
                        .set(roleDiscription).equalToWhenPresent(row::getRoleDiscription)
                        .set(effTs).equalToWhenPresent(row::getEffTs)
                        .set(endTs).equalToWhenPresent(row::getEndTs)
                        .where(roleId, isEqualTo(row::getRoleId))
        );
    }
}