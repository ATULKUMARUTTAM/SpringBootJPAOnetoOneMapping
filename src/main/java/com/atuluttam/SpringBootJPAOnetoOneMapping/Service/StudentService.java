package com.atuluttam.SpringBootJPAOnetoOneMapping.Service;

import com.atuluttam.SpringBootJPAOnetoOneMapping.Model.Student;
import com.atuluttam.SpringBootJPAOnetoOneMapping.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Fetch all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Fetch a student by ID
    public Student getStudentById(Long studentId) {
        Optional<Student> student = studentRepository.findById(studentId);
        return student.orElse(null); // Return null if student not found
    }

    // Create or update a student
    public Student saveOrUpdateStudent(Student student) {
        return studentRepository.save(student); // Save and return the student entity
    }

    // Delete a student by ID
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId); // Delete the student by ID
    }
}
