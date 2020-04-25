package pl.czarczeslaw.experimentsapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pl.czarczeslaw.experimentsapp.model.Product;
import pl.czarczeslaw.experimentsapp.model.dto.AddProductToTrailDto;
import pl.czarczeslaw.experimentsapp.model.dto.CreateProductDto;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product createProductFromDto(CreateProductDto dto);

    @Mappings(value = {
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "rooms", target = "rooms"),
            @Mapping(target = "id", ignore = true)
    })
    Product AddProductsToTrial(AddProductToTrailDto dto);
}
