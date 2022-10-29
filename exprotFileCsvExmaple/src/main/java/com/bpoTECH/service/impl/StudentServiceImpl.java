package com.bpoTECH.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpoTECH.entity.Student;
import com.bpoTECH.repository.StudentRepository;
import com.bpoTECH.service.StudentService;
import com.bpoTECH.utils.ExportCsvFileUtils;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ExportCsvFileUtils<Student> utilsExport;

	@Override
	public void exportCsvFile(HttpServletResponse response) {
		
		List<Student> listStudent =  findAll();

		List<String> csvHeader = List.of("User ID", "Full Name", "E-mail", "Class", "Phone");

		List<String> nameMapping = List.of("id", "name", "email", "classSt", "phone");

		try {
			
			utilsExport.exportCsvUtis(response, listStudent, csvHeader, nameMapping);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
		
	}

}
