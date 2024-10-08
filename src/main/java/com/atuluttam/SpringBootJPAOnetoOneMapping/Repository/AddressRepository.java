package com.atuluttam.SpringBootJPAOnetoOneMapping.Repository;

import com.atuluttam.SpringBootJPAOnetoOneMapping.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
