package com.jbk.SpringBoot_April.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.SpringBoot_April.entity.City;
import com.jbk.SpringBoot_April.entity.Employee;
import com.jbk.SpringBoot_April.entity.Register;
@Repository
public class EmployeeDao_impl implements EmployeeDao_i {

	@Autowired
	private SessionFactory sessionfactory;
	
	
	@Override
	public boolean saveEmployee(Employee employee) {
		
		boolean b=false;
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
		b=true;
		return b;
	}

	/*
	 * @Override public boolean deleteEmployee(int id) { boolean b=false; Session
	 * session=sessionfactory.getCurrentSession(); //Employee employee=new
	 * Employee(); //employee.setId(id); Employee
	 * employee=session.load(Employee.class, id); session.delete(employee); b=true;
	 * return b; }
	 */
	
	
	@Override
	public String deleteEmployee(int id) {
		String msg="Employee Not Deleted...";
		Session session = sessionfactory.getCurrentSession();
		Employee employee=session.load(Employee.class, id);
		session.delete(employee);
		msg="Employee Deleted Successfully...!!!";
		
		return msg;
	}

	@Override
	public String updateEmployee(Employee employee) {
		String msg="Employee Not updated...";
		Session session=sessionfactory.getCurrentSession();
		session.update(employee);
		msg="Employee Updated Successfully...!!!";
		
		return msg;
	}

	@Override
	public Employee getProfile(int id) {
		Session session=sessionfactory.getCurrentSession();
		Employee employee=session.get(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> listOfEmployee() {
		
		Session session=sessionfactory.getCurrentSession();
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> list=criteria.list();
		return list;
	}

	

	@Override
	public Register loginValidation(Register register) {
		
		Session session=sessionfactory.openSession();
		Criteria criteria=session.createCriteria(Register.class);
	
		criteria.add(Restrictions.eq("email",register.getEmail()));
		criteria.add(Restrictions.eq("password",register.getPassword()));
		
		Register user=(Register) criteria.uniqueResult();
		System.out.println("user......"+user);
		System.out.println(register);
		return user;
	}

	@Override
	public List<City> getAllCountries() {
		Session session=sessionfactory.getCurrentSession();
		Criteria criteria=session.createCriteria(City.class);
		List<City> list=criteria.list();
		return list;
	}

}
