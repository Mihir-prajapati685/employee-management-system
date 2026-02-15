package com.example.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum DepartmentEnum {
    HR,
    SALES,
    IT,
    FINANCE,
    MARKETING,
    OPERATIONS,
    CUSTOMER_SERVICE,
    RESEARCH_AND_DEVELOPMENT,
    LEGAL,
    ADMINISTRATION;

    // Map to hold string to enum mapping
   private static final Map<String, DepartmentEnum> typeMap= new HashMap<>();

    // Static block to populate the map
    static {
         for (DepartmentEnum dept : DepartmentEnum.values()) {
              typeMap.put(dept.name(), dept);
         }
    }
    // Convert a string to the corresponding enum value
    public static DepartmentEnum fromString(String deptString) {
         return typeMap.get(deptString);
    }
}
