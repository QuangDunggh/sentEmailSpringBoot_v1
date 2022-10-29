package com.bpoTECH.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bpoTECH.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
