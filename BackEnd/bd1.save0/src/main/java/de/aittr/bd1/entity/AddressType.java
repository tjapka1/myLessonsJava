package de.aittr.bd1.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum AddressType {
    HOME(1, "home_address"),
    WORK(2, "work_address"),
    OTHER(3, "other_address");


    private final Integer addressTypeId;
    private final String externalTypeId;

    public static AddressType findByTypeID(Integer typeId){
        if (typeId==null){return null;}
        return Arrays.stream(AddressType.values())
                .filter(a->a.addressTypeId.equals(typeId))
                .findFirst()
                .orElse(null);
    }
    @JsonCreator
    public static AddressType findByExternalId(String typeId){
        if (typeId == null) {return null;}
        return Arrays.stream(AddressType.values())
                .filter(a -> a.getExternalTypeId().equals(typeId))
                .findFirst()
                .orElse(null);
    }
}
