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
    @EmbeddedId
    ProductTrialKey id;

    @ManyToOne
    @MapsId("trailId")
    Trial trail;

    @ManyToOne
    @MapsId("productId")
    Product product;

    public ProductTrial(Trial trial, Product product) {
    }
}
