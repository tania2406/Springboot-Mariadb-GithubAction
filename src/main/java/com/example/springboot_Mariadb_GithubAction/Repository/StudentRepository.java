package com.example.springboot_Mariadb_GithubAction.Repository;

import com.example.springboot_Mariadb_GithubAction.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
