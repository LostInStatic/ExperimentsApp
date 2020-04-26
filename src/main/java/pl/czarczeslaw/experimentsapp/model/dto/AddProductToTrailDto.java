package pl.czarczeslaw.experimentsapp.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.czarczeslaw.experimentsapp.model.Rooms;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddProductToTrailDto {
    @NotNull(message = "Provide correct product id")
    @Min(1)
    private Long productId;

    @NotNull(message = "Provide correct product name")
    private String name;

    @NotNull(message = "Provide correct room[KITCHEN, BATHROOM, OFFICE] id")
    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    private Rooms rooms;

    @NotNull(message = "Provide correct trail id")
    @Min(1)
    private Long trailId;
}
