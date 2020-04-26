package pl.czarczeslaw.experimentsapp.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.czarczeslaw.experimentsapp.model.Rooms;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateProductDto {
    private Long id;

    @NotNull(message = "Provide correct product name")
    private String name;

    @NotNull(message = "Provide correct room[KITCHEN, BATHROOM, OFFICE] id")
    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    private Rooms rooms;
}
