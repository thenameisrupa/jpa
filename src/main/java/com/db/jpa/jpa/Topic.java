package com.db.jpa.jpa;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;

	
}