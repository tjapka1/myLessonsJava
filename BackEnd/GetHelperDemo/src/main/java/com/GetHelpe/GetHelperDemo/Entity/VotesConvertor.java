package com.GetHelpe.GetHelperDemo.Entity;

import jakarta.persistence.AttributeConverter;

public class VotesConvertor implements AttributeConverter<Votes, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Votes attribute) {
        return attribute == null ? null : attribute.getVotesId();
    }

    @Override
    public Votes convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : Votes.findByVotesId(dbData);
    }
}
