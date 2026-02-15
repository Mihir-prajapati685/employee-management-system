package com.example.database.mapper;

import static com.example.database.mapper.UserModelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.database.model.UserModel;
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
public interface UserModelMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    BasicColumn[] selectList = BasicColumn.columnList(userId, subUuid, phoneNumber, email, verified, effTs, endTs);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.304522+05:30", comments="Source Table: d_user_tbl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="row.userId", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<UserModel> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserModelResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="sub_uuid", property="subUuid", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="verified", property="verified", jdbcType=JdbcType.CHAR),
        @Result(column="eff_ts", property="effTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_ts", property="endTs", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserModel> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserModelResult")
    Optional<UserModel> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default int deleteByPrimaryKey(Integer userId_) {
        return delete(c -> 
            c.where(userId, isEqualTo(userId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default int insert(UserModel row) {
        return MyBatis3Utils.insert(this::insert, row, userModel, c ->
            c.map(subUuid).toProperty("subUuid")
            .map(phoneNumber).toProperty("phoneNumber")
            .map(email).toProperty("email")
            .map(verified).toProperty("verified")
            .map(effTs).toProperty("effTs")
            .map(endTs).toProperty("endTs")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default int insertSelective(UserModel row) {
        return MyBatis3Utils.insert(this::insert, row, userModel, c ->
            c.map(subUuid).toPropertyWhenPresent("subUuid", row::getSubUuid)
            .map(phoneNumber).toPropertyWhenPresent("phoneNumber", row::getPhoneNumber)
            .map(email).toPropertyWhenPresent("email", row::getEmail)
            .map(verified).toPropertyWhenPresent("verified", row::getVerified)
            .map(effTs).toPropertyWhenPresent("effTs", row::getEffTs)
            .map(endTs).toPropertyWhenPresent("endTs", row::getEndTs)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default Optional<UserModel> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default List<UserModel> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default List<UserModel> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default Optional<UserModel> selectByPrimaryKey(Integer userId_) {
        return selectOne(c ->
            c.where(userId, isEqualTo(userId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userModel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3056707+05:30", comments="Source Table: d_user_tbl")
    static UpdateDSL<UpdateModel> updateAllColumns(UserModel row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(subUuid).equalTo(row::getSubUuid)
                .set(phoneNumber).equalTo(row::getPhoneNumber)
                .set(email).equalTo(row::getEmail)
                .set(verified).equalTo(row::getVerified)
                .set(effTs).equalTo(row::getEffTs)
                .set(endTs).equalTo(row::getEndTs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3070923+05:30", comments="Source Table: d_user_tbl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserModel row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(subUuid).equalToWhenPresent(row::getSubUuid)
                .set(phoneNumber).equalToWhenPresent(row::getPhoneNumber)
                .set(email).equalToWhenPresent(row::getEmail)
                .set(verified).equalToWhenPresent(row::getVerified)
                .set(effTs).equalToWhenPresent(row::getEffTs)
                .set(endTs).equalToWhenPresent(row::getEndTs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3070923+05:30", comments="Source Table: d_user_tbl")
    default int updateByPrimaryKey(UserModel row) {
        return update(c ->
            c.set(subUuid).equalTo(row::getSubUuid)
            .set(phoneNumber).equalTo(row::getPhoneNumber)
            .set(email).equalTo(row::getEmail)
            .set(verified).equalTo(row::getVerified)
            .set(effTs).equalTo(row::getEffTs)
            .set(endTs).equalTo(row::getEndTs)
            .where(userId, isEqualTo(row::getUserId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3070923+05:30", comments="Source Table: d_user_tbl")
    default int updateByPrimaryKeySelective(UserModel row) {
        return update(c ->
            c.set(subUuid).equalToWhenPresent(row::getSubUuid)
            .set(phoneNumber).equalToWhenPresent(row::getPhoneNumber)
            .set(email).equalToWhenPresent(row::getEmail)
            .set(verified).equalToWhenPresent(row::getVerified)
            .set(effTs).equalToWhenPresent(row::getEffTs)
            .set(endTs).equalToWhenPresent(row::getEndTs)
            .where(userId, isEqualTo(row::getUserId))
        );
    }
}