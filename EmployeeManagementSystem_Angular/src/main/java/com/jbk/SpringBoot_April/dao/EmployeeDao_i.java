package com.jbk.SpringBoot_April.dao;

import java.util.List;

import com.jbk.SpringBoot_April.entity.City;
import com.jbk.SpringBoot_April.entity.Employee;
import com.jbk.SpringBoot_April.entity.Register;

public interface EmployeeDao_i {

	public boolean saveEmployee(Employee employee);
	public String deleteEmployee(int id);
	public String updateEmployee(Employee employee);
	public Employee getProfile(int id);
	public List<Employee> listOfEmployee();
	public Register loginValidation(Register register);
	public List<City> getAllCountries();
}
