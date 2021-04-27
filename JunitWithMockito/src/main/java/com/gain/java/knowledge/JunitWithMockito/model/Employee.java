package com.gain.java.knowledge.JunitWithMockito.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Employee implements Serializable{

	private static final long serialVersionUID = 4625037178092085622L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("message")
	private String message;

//	@Builder
//	@JsonCreator
//	public Employee(@JsonProperty("id") Integer id,
//			@JsonProperty("name") String name,
	
	//@JsonProperty("message") String message) {
//		this.id = id;
//		this.name = name;
//		this.message = message;
//	}

	public Employee(Integer id, String name, String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", message=" + message + "]";
	}
	
	

}
