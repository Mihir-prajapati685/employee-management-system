package com.example.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum UserStatusEnum {
    ACTIVE,
    INACTIVE,
    SUSPENDED,
    DELETED;

    private static final Map<String, UserStatusEnum> statusMap = new HashMap<>();

    static {
        for (UserStatusEnum status : UserStatusEnum.values()) {
            statusMap.put(status.name(), status);
        }
    }
}