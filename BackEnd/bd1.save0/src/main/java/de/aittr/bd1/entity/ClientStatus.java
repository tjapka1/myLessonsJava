package de.aittr.bd1.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
@AllArgsConstructor
@Getter
public enum ClientStatus {
    NORMAL(1, "normal"),
    VIP(2, "vip");


    private final Integer clientStatus;
    private final String externalTypeId;
    public static ClientStatus findByTypeId(Integer typeId){
        if (typeId==null){return null;}
        return Arrays.stream(ClientStatus.values())
                .filter(c->c.getClientStatus().equals(typeId))
                .findFirst()
                .orElse(null);
    }
    @JsonCreator
    public static ClientStatus findByExternalTypeId(String typeId){
        if (typeId==null){return null;}
        return Arrays.stream(ClientStatus.values())
                .filter(c->c.getExternalTypeId().equals(typeId))
                .findFirst()
                .orElse(null);
    }
}
