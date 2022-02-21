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
    private String name;

    // transient??
    private transient boolean isUpdated;

    @Transient
    private boolean calculatedField;

    // EAGER? mappedBy?? does this work?
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "myEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MyRelationship> myRelationships;
}
