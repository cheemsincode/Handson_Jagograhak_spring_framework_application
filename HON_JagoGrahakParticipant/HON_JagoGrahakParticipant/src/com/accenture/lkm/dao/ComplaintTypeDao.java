package com.accenture.lkm.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.data.repository.annotation.Repository;

import com.accenture.lkm.entity.ComplaintTypeEntity;

/**
To-Do Item 1.2: Define a custom repository for managing ComplaintTypes.
	TODO:
	--Use custom repository.
	--Add a method to get all ComplaintTypes details from the database.
*/
@RepositoryDefinition(idClass=Integer.class , domainClass=ComplaintTypeEntity.class) 
//@Repository
@Transactional(value = "txManager")
public interface ComplaintTypeDao { 
	
	@Query(value="Select u from ComplaintTypeEntity u")
	List<ComplaintTypeEntity> getAllComplaintDetails();
	
}
