package org.jsp.crud_thymeleaf.dao;

import java.util.List;

import org.jsp.crud_thymeleaf.dto.Student;
import org.jsp.crud_thymeleaf.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyDao {

	@Autowired
	MyRepository repository;

	public void save(Student student) {
		repository.save(student);
	}

	public List<Student> fetchAll() {
		return repository.findAll();
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
	
	public Student fetchById(int id)
	{
		return repository.findById(id).orElse(null);
	}

}
