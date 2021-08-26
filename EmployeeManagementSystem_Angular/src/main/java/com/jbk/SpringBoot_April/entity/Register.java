package com.jbk.SpringBoot_April.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sbng_register")
public class Register {

	@Id														//auto-increment value
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column	
	private int userid;
	
	@Column	
	private String email;
	
	@Column	
	private String username;
	
	@Column	
	private String password;
	
	@Column	
	private String nationality;
	
	@Column	
	private String gender;
	
	@Column	
	private String city;
	
	@Column	
	private Date createddtm;
	
	@Column	
	private String mobileno;
	
	public Register() {
		// TODO Auto-generated constructor stub
	}

	public Register(int userid, String email, String username, String password, String nationality, String gender,
			String city, Date createddtm, String mobileno) {
		super();
		this.userid = userid;
		this.email = email;
		this.username = username;
		this.password = password;
		this.nationality = nationality;
		this.gender = gender;
		this.city = city;
		this.createddtm = createddtm;
		this.mobileno = mobileno;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getCreateddtm() {
		return createddtm;
	}

	public void setCreateddtm(Date createddtm) {
		this.createddtm = createddtm;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Register [userid=" + userid + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", nationality=" + nationality + ", gender=" + gender + ", city=" + city + ", createddtm="
				+ createddtm + ", mobileno=" + mobileno + "]";
	}
	
	
}
