package com.supraja.student.dal.Repos;

import org.springframework.data.repository.CrudRepository;

import com.supraja.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
