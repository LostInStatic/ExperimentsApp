package pl.czarczeslaw.experimentsapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.czarczeslaw.experimentsapp.model.Rooms;
import pl.czarczeslaw.experimentsapp.model.Trial;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddProductToTrialDto {
    private Long id;
    private String name;
    private Rooms rooms;
    private Long trialId;
}
