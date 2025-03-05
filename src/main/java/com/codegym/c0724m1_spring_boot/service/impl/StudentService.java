package com.codegym.c0724m1.service.impl;

import com.codegym.c0724m1.dto.StudentDTO;
import com.codegym.c0724m1.entity.Student;
import com.codegym.c0724m1.repository.StudentRepository;
import com.codegym.c0724m1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

//    DI sử dụng Field injection
//    DI bằng setter và constructor
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();

        return students;
    }

    @Override
    public void save(Student s) {
        studentRepository.save(s);
    }

    @Override
    public void update(int id, Student s) {

    }

    @Override
    public void remove(Long id) {
        studentRepository.remove(id);
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }

    @Override
    public List<StudentDTO> getAllDTO() {
        return null;
    }
}
