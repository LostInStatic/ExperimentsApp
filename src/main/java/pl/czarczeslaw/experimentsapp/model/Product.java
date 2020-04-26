package pl.czarczeslaw.experimentsapp.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Please provide name of product")
    private String name;

    @Enumerated(EnumType.STRING)
    private Rooms rooms;

    @ManyToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Trial> trial = new HashSet<>();


}
