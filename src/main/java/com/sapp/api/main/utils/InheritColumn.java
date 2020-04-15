package com.sapp.api.main.utils;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;


@MappedSuperclass
public class InheritColumn 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public LocalDateTime getCreationDate() 
	{
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) 
	{
		this.creationDate = creationDate;
	}
	
	@PrePersist
	public void init()
	{
		this.creationDate = LocalDateTime.now();
	}
	
}
