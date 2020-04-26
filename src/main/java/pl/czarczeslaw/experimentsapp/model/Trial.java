package pl.czarczeslaw.experimentsapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Please provide name of trial")
    private String name;

    @NotEmpty(message = "Please provide description of trial")
    private String description;

    @OneToMany(mappedBy = "trail")
    private List<ProductTrial> list;

    @ManyToOne
    private TrialType type;

    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
    @CreatedDate
    @CreationTimestamp
    private LocalDateTime whenCreated;
}
