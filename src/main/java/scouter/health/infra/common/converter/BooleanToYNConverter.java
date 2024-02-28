package scouter.health.infra.common.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class BooleanToYNConverter implements AttributeConverter<Boolean, String> {

	@Override
	public String convertToDatabaseColumn(final Boolean attribute) {
		return attribute == Boolean.TRUE ? "Y" : "N";
	}

	@Override
	public Boolean convertToEntityAttribute(final String dbData) {
		return "Y".equalsIgnoreCase(dbData);
	}

}
