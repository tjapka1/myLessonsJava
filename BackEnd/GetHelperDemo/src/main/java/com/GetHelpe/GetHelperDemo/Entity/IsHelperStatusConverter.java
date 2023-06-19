package com.GetHelpe.GetHelperDemo.Entity;

import jakarta.persistence.AttributeConverter;

public class IsHelperStatusConverter implements AttributeConverter<isHelperStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(isHelperStatus attribute) {
        return attribute == null? null : attribute.getHelperStatusId()
        ;
    }

    @Override
    public isHelperStatus convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : isHelperStatus.findByTypeId(dbData);
    }
}
