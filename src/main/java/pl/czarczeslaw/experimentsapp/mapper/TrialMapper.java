package pl.czarczeslaw.experimentsapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TrialMapper {
    Trial createTrialFromDto(CreateTrialDto dto);

}
