package com.example.springboot_Mariadb_GithubAction.Controller;

import com.example.springboot_Mariadb_GithubAction.Entity.Student;
import com.example.springboot_Mariadb_GithubAction.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    StudentRepository srepo;
    @RequestMapping("/test")
    public String test()
    {
        return "test for github action with database";
    }
    @RequestMapping("/save")
    public String saveData(@RequestBody Student std)
    {
        srepo.save(std);
        return "data saved";
    }
    @RequestMapping("/all")
    public List<Student> allData()
    {
        return srepo.findAll();
    }

}
