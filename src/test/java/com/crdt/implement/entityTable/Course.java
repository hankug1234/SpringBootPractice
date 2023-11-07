package com.crdt.implement.entityTable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COURSES")
@Getter
@Setter
public class Course {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name="CATEGORY")
	private String category;
	
	@Column(name = "RATING")
	private int rating;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	public Course() {}
	
	public Course(String name, String category, int rating, String description) {
		this.name = name;
		this.category = category;
		this.rating = rating;
		this.description = description;
	}
	
}
