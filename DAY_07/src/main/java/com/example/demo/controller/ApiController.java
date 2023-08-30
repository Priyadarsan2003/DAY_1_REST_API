package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService cs;
	@PostMapping("add")
	public Car add(@RequestBody Car ss) {
		return cs.addinfo(ss);
	}
	
	@PostMapping("addDetails")
	public List<Car> adddetails(@RequestBody List<Car> ss) {
		return cs.addDetails(ss);
	}
	
	@GetMapping("carGet")
	public List<Car> getCars(@RequestParam(value = "ownerId") int ownerId)
	{
		return cs.showOwners(ownerId);
	}
	
	@GetMapping("carAddress")
	public List<Car> getCarAddress(@RequestParam(value = "address") String address)
	{
		return cs.showAddress(address);
	}
	
	@GetMapping("carName")
	public List<Car> getCarName(@RequestParam(value = "carname") String carname)
	{
		return cs.showCarName(carname);
	}
	
	@GetMapping("carOwnerAndCartype")
	public List<Car> getCarOwnerAndType(@RequestParam(value = "id") int id, @RequestParam(value = "cartype") String cartype)
	{
		return cs.showOwnersAndCartype(id, cartype);
	}
}
