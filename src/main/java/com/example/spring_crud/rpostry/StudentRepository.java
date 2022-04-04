package com.example.spring_crud.rpostry;
import java.util.List;

import com.example.spring_crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    List<Student> findByName(String name);
}