package pl.czarczeslaw.experimentsapp.mapper;

import org.mapstruct.Mapper;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;

@Mapper(componentModel = "spring")
public interface TrialMapper {
    Trial createTrialFromDto(CreateTrialDto dto);

}
