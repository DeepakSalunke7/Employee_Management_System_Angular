package com.jbk.SpringBoot_April.service;

import java.util.HashMap;
import java.util.List;

import com.jbk.SpringBoot_April.entity.City;
import com.jbk.SpringBoot_April.entity.Employee;
import com.jbk.SpringBoot_April.entity.Register;

public interface EmployeeService_i {
	
	public boolean saveEmployee(Employee employee);
	public String deleteEmployee(int id);
	public String updateEmployee(Employee employee);
	public Employee getProfile(int id);
	public List<Employee> listOfEmployee();
	public HashMap loginValidation(Register register);
	public List<City> getAllCountries();
	public String empChangeStatusbyId(int id);
}
