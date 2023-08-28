package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService ser;
	
	@PostMapping("add")
	public Child add(@RequestBody Child ss) {
		return ser.addinfo(ss);
	}
	
	@PostMapping("addDetails")
	public List<Child> adddetails(@RequestBody List<Child> ss) {
		return ser.addDetails(ss);
	}
	
	@GetMapping("showDetails")
	public List<Child> show() {
		return ser.displayDetails();
	}
	
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Child> shoepageinfo(@PathVariable int pageno, @PathVariable int pagesize) {
		return ser.getByPage(pageno, pagesize);
	}
	
	@GetMapping("sort/{name}")
	public List<Child> getSortInfo(@PathVariable String s) {
		return ser.sortinfo(s);
	}
	
	@GetMapping("paging/{pageno}/{pagesize}/{s}")
	public List<Child> shoepage(@PathVariable int pageno, @PathVariable int pagesize, @PathVariable String s) {
		return ser.paging(pageno, pagesize, s);
	}
}
