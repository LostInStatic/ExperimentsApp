package pl.czarczeslaw.experimentsapp.mapper;

import org.mapstruct.Mapper;
import pl.czarczeslaw.experimentsapp.model.Product;
import pl.czarczeslaw.experimentsapp.model.dto.CreateProductDto;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product createProductFromDto(CreateProductDto dto);
}
