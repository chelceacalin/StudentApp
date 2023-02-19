package com.RestAPI.studentRest.Service;

import com.RestAPI.studentRest.model.Student;
import com.RestAPI.studentRest.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements  StudentService{


    StudentRepository repository;

    @Autowired
    public StudentServiceImplementation(StudentRepository repository){
        this.repository=repository;
    }

    @Override
    public List<Student> getStudents() {

       List<Student >list =repository.findAll();

        return list;
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

	@Override
	public void DeleteAll() {
		
		repository.deleteAll();
		
	}
}
