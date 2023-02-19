package com.RestAPI.studentRest.Controller;


import com.RestAPI.studentRest.Service.StudentService;
import com.RestAPI.studentRest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student added ";
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
    return studentService.getStudents();
    }
    
    @DeleteMapping("/deleteAll")
    public void DeleteAll() {
    	studentService.DeleteAll();
    }
}
