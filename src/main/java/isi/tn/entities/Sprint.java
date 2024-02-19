package isi.tn.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
@Entity
public class Sprint implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="sprintid")
	private Long id;
	private String description;
	private Date datesatrt;
	
	
	@ManyToOne
	private Project porjects; 

	public Sprint() {
		super();
	}
	
	
	public Sprint(Long id, String description, Date datesatrt, Project porjects) {
		super();
		this.id = id;
		this.description = description;
		this.datesatrt = datesatrt;
		this.porjects = porjects;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDatesatrt() {
		return datesatrt;
	}
	public void setDatesatrt(Date datesatrt) {
		this.datesatrt = datesatrt;
	}
	public Project getPorjects() {
		return porjects;
	}
	public void setPorjects(Project porjects) {
		this.porjects = porjects;
	}
	
	
	
}
