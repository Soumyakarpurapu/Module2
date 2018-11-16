package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="query_master")
public class QueryMaster 
{
	@Id
	@Column(name="query_id")
	@NotNull(message="Enter Trainee ID")
	private Integer queryId;
	
	@Column(name="technology")
	@NotNull(message="Technology cannot be empty")
	private String technology;

	@Column(name="query_raised_by")
	@NotNull(message="Enter your Name")
	private String name;
	
	@Column(name="query")
	@NotNull(message="Enter your Query")
	private String query;
	
	@Column(name="solution")
	private String solution;
	
	@Column(name="solution_given_by")
	private String master;

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}
	
	
}
