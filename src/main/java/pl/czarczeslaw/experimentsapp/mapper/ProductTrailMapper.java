package pl.czarczeslaw.experimentsapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pl.czarczeslaw.experimentsapp.model.Product;
import pl.czarczeslaw.experimentsapp.model.ProductTrial;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.dto.AddProductToTrailDto;


@Mapper(componentModel = "spring", imports = {Trial.class, Product.class, ProductTrial.class})
        public interface ProductTrailMapper{
//        @Mappings(value = {
//                @Mapping(source = "productId", target = "product"),
//                @Mapping(source = "trailId", target = "trail"),
//                @Mapping(ignore = true, target = "id")
//        })
//        ProductTrial addProductToTrailDto(AddProductToTrailDto dto);
        }
