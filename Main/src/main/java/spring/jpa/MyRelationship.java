package spring.jpa;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "my_relationship")
@Data
public class MyRelationship {

    @Id
    private Long id;

    @Column
    private String name;


}
