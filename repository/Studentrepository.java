package com.Student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Student_management_system.entity.Student;
@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {

}
