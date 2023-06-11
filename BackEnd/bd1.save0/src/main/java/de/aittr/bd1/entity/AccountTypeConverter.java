package de.aittr.bd1.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AccountTypeConverter implements AttributeConverter<AccountType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(AccountType attribute) {
        return attribute == null?null:attribute.getAccountTypeId();
    }

    @Override
    public AccountType convertToEntityAttribute(Integer typeId) {
        return typeId ==null?null:AccountType.findByTypeId(typeId);
    }
}
