package pl.czarczeslaw.experimentsapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductTrial {
    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "trail_id")
    Trial trailId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product productId;

    public ProductTrial(Trial trial, Product product) {
    }
}
