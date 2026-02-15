package com.example.database.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UserModelDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source Table: d_user_tbl")
    public static final UserModel userModel = new UserModel();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.304522+05:30", comments="Source field: d_user_tbl.user_id")
    public static final SqlColumn<Integer> userId = userModel.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.304522+05:30", comments="Source field: d_user_tbl.sub_uuid")
    public static final SqlColumn<String> subUuid = userModel.subUuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.304522+05:30", comments="Source field: d_user_tbl.phone_number")
    public static final SqlColumn<String> phoneNumber = userModel.phoneNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.304522+05:30", comments="Source field: d_user_tbl.email")
    public static final SqlColumn<String> email = userModel.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.304522+05:30", comments="Source field: d_user_tbl.verified")
    public static final SqlColumn<String> verified = userModel.verified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.304522+05:30", comments="Source field: d_user_tbl.eff_ts")
    public static final SqlColumn<Date> effTs = userModel.effTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.304522+05:30", comments="Source field: d_user_tbl.end_ts")
    public static final SqlColumn<Date> endTs = userModel.endTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-04T19:32:11.3035228+05:30", comments="Source Table: d_user_tbl")
    public static final class UserModel extends AliasableSqlTable<UserModel> {
        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> subUuid = column("sub_uuid", JDBCType.VARCHAR);

        public final SqlColumn<String> phoneNumber = column("phone_number", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> verified = column("verified", JDBCType.CHAR);

        public final SqlColumn<Date> effTs = column("eff_ts", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTs = column("end_ts", JDBCType.TIMESTAMP);

        public UserModel() {
            super("d_user_tbl", UserModel::new);
        }
    }
}