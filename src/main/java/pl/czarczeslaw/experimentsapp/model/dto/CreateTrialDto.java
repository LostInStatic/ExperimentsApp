package pl.czarczeslaw.experimentsapp.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import pl.czarczeslaw.experimentsapp.model.TrialType;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTrialDto {

    private Long id;

    @NotNull(message = "Provide correct trial name")
    private String name;

    @NotNull(message = "Provide correct trial description")
    private String description;

}
