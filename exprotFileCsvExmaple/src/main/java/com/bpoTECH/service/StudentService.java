package com.bpoTECH.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.bpoTECH.entity.Student;

public interface StudentService {
	
	List<Student> findAll();
	
	void save(Student student);
	
	void exportCsvFile(HttpServletResponse response);

}
