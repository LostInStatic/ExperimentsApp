package pl.czarczeslaw.experimentsapp.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "trial")
public class Trial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Please provide name of trial")
    private String name;

    @NotEmpty(message = "Please provide description of trial")
    @Column(length = 1020)
    private String description;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "trial_product",
            joinColumns = {@JoinColumn(name = "trial_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private List<Product> product = new ArrayList<>();

    @ManyToOne
    private TrialType type;

    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    @CreationTimestamp
    private LocalDateTime whenCreated;
}
