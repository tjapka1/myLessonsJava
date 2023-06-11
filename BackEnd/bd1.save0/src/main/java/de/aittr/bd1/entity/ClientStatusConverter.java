package de.aittr.bd1.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClientStatusConverter implements AttributeConverter<ClientStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ClientStatus attribute) {
        return attribute == null ? null : attribute.getCardTypeId();
    }

    @Override
    public ClientStatus convertToEntityAttribute(Integer statusId) {
        return statusId == null ? null : ClientStatus.findByTypeId(statusId);
    }
}
