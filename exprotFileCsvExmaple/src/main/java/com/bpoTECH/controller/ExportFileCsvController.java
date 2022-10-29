package com.bpoTECH.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpoTECH.entity.Student;
import com.bpoTECH.service.StudentService;

@RestController
@RequestMapping("api/v1/export-file-csv")
public class ExportFileCsvController {
	
	@Autowired
	private StudentService studentService;
	 

	@GetMapping
	public void exportFileCsv(HttpServletResponse response) {

		studentService.exportCsvFile(response);

	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(studentService.findAll());
	}
	
	@PostMapping
	public ResponseEntity<?> saveStudent(@RequestBody Student student) {
		
		studentService.save(student);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("ok thanh cong");
	}
}
