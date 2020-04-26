package pl.czarczeslaw.experimentsapp.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.czarczeslaw.experimentsapp.model.Rooms;

<<<<<<< HEAD
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

=======
>>>>>>> master
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateProductDto {
    @NotNull(message = "Provide correct product id")
    @Min(1)
    private Long ProductId;

    @NotNull(message = "Provide correct product name")
    private String name;

    @NotNull(message = "Provide correct room[KITCHEN, BATHROOM, OFFICE] id")
    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    private Rooms rooms;
}
