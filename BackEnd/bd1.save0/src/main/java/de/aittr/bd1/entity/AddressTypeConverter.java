package de.aittr.bd1.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import jakarta.persistence.Id;

@Converter(autoApply = true)
public class AddressTypeConverter implements AttributeConverter<AddressType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(AddressType attribute) {
        return attribute == null ? null : attribute.getAddressTypeId();
    }

    @Override
    public AddressType convertToEntityAttribute(Integer typeId) {
        return typeId == null ? null : AddressType.findByTypeID(typeId);
    }
}
