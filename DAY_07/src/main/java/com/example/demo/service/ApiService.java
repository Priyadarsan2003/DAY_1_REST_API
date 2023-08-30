package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class ApiService {
	
	@Autowired
	CarRepo cr;

	public Car addinfo(Car r) {
		return cr.save(r);
	}
		
	public List<Car> addDetails(List<Car> sr) {
		return (List<Car>)cr.saveAll(sr);
	}
	
	public List<Car> showOwners(int owners)
	{
		return cr.getCarOwners(owners);
	}
	
	public List<Car> showAddress(String address)
	{
		return cr.getCarAddress(address);
	}
	
	public List<Car> showCarName(String carname)
	{
		return cr.getCarName(carname);
	}
	
	public List<Car> showOwnersAndCartype(int owners, String cartype)
	{
		return cr.getCarOwnerAndCartype(owners, cartype);
	}
}
