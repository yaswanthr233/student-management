package com.soa.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.soa.model.Student;

public interface StudentRepo
        extends JpaRepository<Student, Long> {

}
