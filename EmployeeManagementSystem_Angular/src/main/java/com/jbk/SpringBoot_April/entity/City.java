package com.jbk.SpringBoot_April.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sbng_city",catalog = "sbng_project")
public class City implements Serializable {

	private static final long serialversionUID=1L;


	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)
	private Integer cid;

	private String cname;

	public City() {

	}



	public City(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}




	public Integer getCid() {
		return cid;
	}



	public void setCid(Integer cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public static long getSerialversionuid() {
		return serialversionUID;
	}



	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + "]";
	}




}
