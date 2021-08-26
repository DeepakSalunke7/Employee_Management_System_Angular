package com.jbk.SpringBoot_April.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbk.SpringBoot_April.dao.EmployeeDao_i;
import com.jbk.SpringBoot_April.dao.EmployeeDao_impl;
import com.jbk.SpringBoot_April.entity.City;
import com.jbk.SpringBoot_April.entity.Employee;
import com.jbk.SpringBoot_April.entity.Register;

@Service
@Transactional
public class EmployeeService_impl implements EmployeeService_i {
	@Autowired
	private EmployeeDao_i Dao;

	@Override
	public boolean saveEmployee(Employee employee) {
		boolean b = Dao.saveEmployee(employee);

		return b;
	}

	/*
	 * @Override public boolean deleteEmployee(int id) { boolean b =
	 * Dao.deleteEmployee(id); return b; }
	 */
	

	@Override
	public String deleteEmployee(int id) {
		
		String msg=Dao.deleteEmployee(id);
		
		return msg;
	}

	@Override
	public String updateEmployee(Employee employee) {
		String msg = Dao.updateEmployee(employee);
		return msg;
	}

	@Override
	public Employee getProfile(int id) {
		Employee employee = Dao.getProfile(id);
		return employee;
	}

	@Override
	public List<Employee> listOfEmployee() {

		List<Employee> list = Dao.listOfEmployee();
		return list;
	}
	
	  @Override 
	  public HashMap loginValidation(Register register) {
	 
	  Register reg=Dao.loginValidation(register); 
	  HashMap map=new HashMap<>();
	  
	  if(reg!=null) {
		  map.put("msg", "Valid User");
		  map.put("user", reg);
	  }else {
	  map.put("msg", "Invalid User");
	  map.put("user", reg);
	  }
	  
	  return map; 
	}

	@Override
	public List<City> getAllCountries() {
			List<City> list=Dao.getAllCountries();
		return list;
	}

	@Override
	public String empChangeStatusbyId(int id) {
		
		String msg="Status Not Change...";
	
		Employee employee=Dao.getProfile(id);
		String status=employee.getStatus();
		
		if(status.equalsIgnoreCase("Active")) {
			employee.setStatus("Inactive");
			Dao.updateEmployee(employee);
			msg="Employee Status Change Successfully...!!!";
		
		}else if(status.equalsIgnoreCase("Inactive")) {
			employee.setStatus("Active");
			Dao.updateEmployee(employee);
			msg="Employee Status Change Successfully...!!!";

		}else {
			msg="Employee is Already Suspended...!!!";
		}
		
		return msg;
	
	}
	   
}
