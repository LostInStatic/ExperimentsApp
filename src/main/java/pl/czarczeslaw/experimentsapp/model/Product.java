package pl.czarczeslaw.experimentsapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Rooms rooms;

    @OneToMany(mappedBy = "product")
    private List<ProductTrial> list;


}
