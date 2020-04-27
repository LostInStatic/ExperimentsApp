package pl.czarczeslaw.experimentsapp.mapper;

import org.mapstruct.Mapper;
import pl.czarczeslaw.experimentsapp.model.TrialPhoto;
import pl.czarczeslaw.experimentsapp.model.dto.AddNewImageDto;

@Mapper(componentModel = "spring")
public interface ImageMapper {
    TrialPhoto mapImageFromDto(AddNewImageDto dto);
}
