package de.aittr.bd1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum AccountType {
    DEBIT(1, "debit"),
    CREDIT(2, "credit");

    private final Integer accountTypeId;
    private final String externalTypeId;

    public static AccountType findByTypeId(Integer typeId){
        if (typeId==null){return null;}
        return Arrays.stream(AccountType.values())
                .filter(a->a.getAccountTypeId().equals(typeId))
                .findFirst()
                .orElse(null);
    }

    public static AccountType findByExternalTypeId(String typeId){
        if (typeId==null){return null;}
        return Arrays.stream(AccountType.values())
                .filter(a->a.getExternalTypeId().equals(typeId))
                .findFirst()
                .orElse(null);
    }



}

