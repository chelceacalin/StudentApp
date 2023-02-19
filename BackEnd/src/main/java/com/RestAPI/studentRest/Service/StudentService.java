package com.RestAPI.studentRest.Service;

import com.RestAPI.studentRest.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();

    public Student saveStudent(Student student);
    public void DeleteAll();
}
