package com.example.database.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RoleModelDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3927055+05:30", comments="Source Table: dm_role_tbl")
    public static final RoleModel roleModel = new RoleModel();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3937087+05:30", comments="Source field: dm_role_tbl.role_id")
    public static final SqlColumn<Integer> roleId = roleModel.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3947058+05:30", comments="Source field: dm_role_tbl.role_name")
    public static final SqlColumn<String> roleName = roleModel.roleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3947058+05:30", comments="Source field: dm_role_tbl.role_discription")
    public static final SqlColumn<String> roleDiscription = roleModel.roleDiscription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3947058+05:30", comments="Source field: dm_role_tbl.eff_ts")
    public static final SqlColumn<Date> effTs = roleModel.effTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3947058+05:30", comments="Source field: dm_role_tbl.end_ts")
    public static final SqlColumn<Date> endTs = roleModel.endTs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-01-29T21:53:14.3937087+05:30", comments="Source Table: dm_role_tbl")
    public static final class RoleModel extends AliasableSqlTable<RoleModel> {
        public final SqlColumn<Integer> roleId = column("role_id", JDBCType.INTEGER);

        public final SqlColumn<String> roleName = column("role_name", JDBCType.VARCHAR);

        public final SqlColumn<String> roleDiscription = column("role_discription", JDBCType.VARCHAR);

        public final SqlColumn<Date> effTs = column("eff_ts", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTs = column("end_ts", JDBCType.TIMESTAMP);

        public RoleModel() {
            super("dm_role_tbl", RoleModel::new);
        }
    }
}