package pl.czarczeslaw.experimentsapp.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import pl.czarczeslaw.experimentsapp.model.TrialType;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTrialDto {

    private Long id;
    private String name;
    private String description;
    private TrialType type;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
    @CreatedDate
    private LocalDateTime whenCreated;

}
