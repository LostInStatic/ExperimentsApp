package pl.czarczeslaw.experimentsapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssignProductToTrialDto {
   private Long productId;
   private Long trialId;
}
