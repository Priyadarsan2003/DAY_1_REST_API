package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Child;
import com.example.demo.repository.ChildRepo;

@Service
public class ApiService {

	@Autowired
	ChildRepo cr;

	public Child addinfo(Child r) {
		return cr.save(r);
	}
		
	public List<Child> addDetails(List<Child> sr) {
		return (List<Child>)cr.saveAll(sr);
	}
		
	public List<Child> displayDetails() {
		return cr.findAll();
	}
	
	public List<Child> getByPage(int pgno, int pgsize) {
		Page<Child> p = cr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	
	public List<Child> sortinfo(String s) {
		return cr.findAll(Sort.by(Sort.DEFAULT_DIRECTION));
	}
	
	public List<Child> paging(int pgno, int pgsize, String s) {
		Sort st = Sort.by(s);
		Page<Child> p = cr.findAll(PageRequest.of(pgno, pgsize, st));
		return p.getContent();
	}
	
}
