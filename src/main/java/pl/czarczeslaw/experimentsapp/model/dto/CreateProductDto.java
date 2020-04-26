package pl.czarczeslaw.experimentsapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.czarczeslaw.experimentsapp.model.Rooms;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateProductDto {
    private Long id;
    private String name;
    private Rooms rooms;
}
