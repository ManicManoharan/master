package com.student.controller;

import com.student.dto.StudentDto;
import com.student.model.Student;
import com.student.repository.StudentRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/student")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	/**
	 * API to get All Student Details
	 * 
	 * @return
	 */

	@GetMapping("/all")
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	/**
	 * API to get student details by roll number
	 * 
	 * @param rollNo
	 * @return
	 */
	@GetMapping("/{rollNo}")
	public Student getStudent(@PathVariable("rollNo") final long rollNo) {
		return studentRepository.findByRollNo(rollNo);

	}

	/**
	 * API to save student details DTO is converted to entity Object and updated in
	 * database
	 * 
	 * @param dto
	 * @return
	 */
	@PostMapping("/save}")
	public Student save(@RequestBody StudentDto dto) {
		Student student = new Student();
		BeanUtils.copyProperties(dto, student);
		return studentRepository.save(student);
	}

	/**
	 * API to update student details (Mandatory to pass existing roll number) DTO is
	 * converted to entity Object and updated in database
	 * 
	 * @param dto
	 * @return
	 */
	@PostMapping("/update}")
	public Student update(@RequestBody StudentDto dto) {
		Student student = new Student();
		BeanUtils.copyProperties(dto, student);
		return studentRepository.save(student);
	}

	/**
	 * API to delete student by roll number
	 * 
	 * @param rollNo
	 * @return
	 */
	@DeleteMapping("/delete")
	public Integer delete(@RequestParam("rollNo") final long rollNo) {
		return studentRepository.deleteByRollNo(rollNo);

	}
}
