package spring.jpa;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "my_entity")
@Data
public class MyEntity {

    @Id
    @Column(nullable = false)
    // nullable???
    private Long id;

    @Column
    @NotNull
    // Not null??
    // Is @NotNull the same than nullable?
    private String name;

    // transient??
    private transient boolean isUpdated;

    @Transient
    // Is @Transient the same than nullable?
    private boolean calculatedField;

    // what is EAGER? mappedBy?? does this work?
    // Cascade??
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "myEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MyRelationship> myRelationships;
}
