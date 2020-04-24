package pl.czarczeslaw.experimentsapp.mapper;

import org.mapstruct.Mapper;
import pl.czarczeslaw.experimentsapp.model.TrialType;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialTypeDto;

@Mapper(componentModel = "spring")
public interface TrialTypeMapper {
    TrialType createTrialTypeFromDto(CreateTrialTypeDto dto);
}
