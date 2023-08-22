package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveinfo(StudentEntity s) {
		return sr.save(s);
	}
	
	public List<StudentEntity> savedetails(List<StudentEntity> ss) {
		return (List<StudentEntity>)sr.saveAll(ss);
	}
	
	public List<StudentEntity> showinfo() {
		return sr.findAll();
	}
	
	public Optional<StudentEntity> disp(int id) {
		return sr.findById(id);
	}
	
	public StudentEntity changeinfo(StudentEntity ss) {
		return sr.saveAndFlush(ss);
	}
	
	public void deleteid(int id) {
		sr.deleteById(id);
	}
}
