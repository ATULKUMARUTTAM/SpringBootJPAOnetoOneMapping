package com.atuluttam.SpringBootJPAOnetoOneMapping.Repository;

import com.atuluttam.SpringBootJPAOnetoOneMapping.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
