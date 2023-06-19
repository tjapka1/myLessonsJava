package com.GetHelpe.GetHelperDemo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum isHelperStatus {
    NO_HELPER(1),
    IS_HELPER(2);
    private final Integer helperStatusId;
    public static isHelperStatus findByTypeId(Integer typeId){
        if (typeId==null){return null;}
        return Arrays.stream(isHelperStatus.values())
                .filter(c->c.getHelperStatusId().equals(typeId))
                .findFirst()
                .orElse(null);
    }
}
