package pl.czarczeslaw.experimentsapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddNewImageDto {
    private Long id;
    private String name;
    private byte[] foto;
}
