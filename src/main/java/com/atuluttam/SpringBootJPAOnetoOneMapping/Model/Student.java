package com.atuluttam.SpringBootJPAOnetoOneMapping.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@ToString(exclude = "address")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "add_id")
    // This means Foreign key will be created only in the Student table
    // i.e. extra column 'address_id' will be created in the Student table
    private Address address;

    // Student-Address One-To-One Unidirectional Relationship Mapping

    // By using CascadeType.ALL, it essentially means that any operation
    // performed on the parent entity should also be performed on the child entity.


    // With FetchType.LAZY and @ToString(exclude = "address")
    // at the entity Class level,
    // it will fetch the details of the Parent only i.e. Student


    // With FetchType.EAGER, it will fetch the details of the Child along
    // with the Parent
    // i.e.both Address and Student details
}
