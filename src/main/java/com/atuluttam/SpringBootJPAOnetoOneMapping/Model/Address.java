package com.atuluttam.SpringBootJPAOnetoOneMapping.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long add_id;

    private String street;
    private String city;
    private String pincode;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;
}
