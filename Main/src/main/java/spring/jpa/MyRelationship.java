package spring.jpa;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "my_relationship")
@Data
public class MyRelationship {

    @Id
    private Long id;

    @Column
    private String name;

    // Something is missing here to solve the problem

}