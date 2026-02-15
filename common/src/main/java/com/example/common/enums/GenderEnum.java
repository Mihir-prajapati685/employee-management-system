package com.example.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum GenderEnum {
    MALE,
    FEMALE;

    private static final Map<String, GenderEnum> genderMap = new HashMap<>();

    static {
        for(GenderEnum gender : GenderEnum.values()){
            genderMap.put(gender.name(), gender);
        }
    }
}
