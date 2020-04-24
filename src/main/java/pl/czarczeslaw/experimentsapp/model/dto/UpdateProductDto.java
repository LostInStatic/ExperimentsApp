package pl.czarczeslaw.experimentsapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.czarczeslaw.experimentsapp.model.Rooms;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateProductDto {
    private Long ProductId;
    private String name;
    private Rooms rooms;
}