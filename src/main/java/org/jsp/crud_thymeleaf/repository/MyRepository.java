package org.jsp.crud_thymeleaf.repository;

import org.jsp.crud_thymeleaf.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<Student, Integer> {

}
