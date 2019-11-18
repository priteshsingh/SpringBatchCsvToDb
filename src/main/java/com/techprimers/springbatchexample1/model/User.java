package com.techprimers.springbatchexample1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public @Data class User {

	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
	private Date time;

}
