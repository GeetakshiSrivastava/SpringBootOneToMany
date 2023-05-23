package com.app.SpringBootOneToMany.repo;

import com.app.SpringBootOneToMany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
