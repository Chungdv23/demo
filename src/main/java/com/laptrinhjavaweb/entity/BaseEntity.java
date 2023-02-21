package com.laptrinhjavaweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@CreatedDate
	@Column(name="createddated")
	private Date createdDated;
	
	@LastModifiedDate
	@Column(name = "modifieddated")
	private Date modifiedDated;
	
	@CreatedBy
	@Column(name = "createdby")
	private String createdBy;
	
	@LastModifiedBy
	@Column(name = "modifiedBy")
	private String modifiedby;


	public Date getCreatedDated() {
		return createdDated;
	}

	
	
	public Date getModifiedDated() {
		return modifiedDated;
	}

	
	public String getCreatedBy() {
		return createdBy;
	}


	public String getModifiedby() {
		return modifiedby;
	}

	

	public Long getId() {
		return id;
	}

	
	
	
}
