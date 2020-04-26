package pl.czarczeslaw.experimentsapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateTrialDto {
    @NotNull(message = "Provide correct trail id")
    @Min(1)
    private Long TrialId;

    @NotNull(message = "Provide correct trial name")
    private String name;

    @NotNull(message = "Provide correct trial description")
    private String description;
}
