package com.accenture.lkm.test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.business.bean.ComplaintBean;
import com.accenture.lkm.dao.ComplaintDaoWrapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebContent/WEB-INF/cst-root-ctx.xml" })
@Transactional
public class ComplaintDaoWrapperTest {

	@Autowired
	private ComplaintDaoWrapper complaintDaoWrapper;

	/**
     * To-Do Item 1.14: Test method for registering complaint details.
     *
     * Steps to Implement:
     * 1. Initialize a ComplaintBean object with relevant data.
     * 2. Call complaintDaoWrapper.registerComplaintDetails() with the initialized ComplaintBean.
     * 3. Assert that the method returns an ID greater than 10003.
     *
     * @throws Exception if an error occurs during the test.
     */
	@Test
	public void registerComplaintDetails() throws Exception {
		// Your implementation goes here 
		ComplaintBean testBean  = new ComplaintBean(); 
		testBean.setAmount(2000.0);
//		testBean.setComplaintId(complaintId); 
		testBean.setComplaintTypeId(1004); 
		testBean.setCustomerName("Priyank Singh");
		testBean.setDescription("Testing This Description if working or not ");
		testBean.setDateOfIncidence(new Date()); 
		 
		
		int updatedBean = complaintDaoWrapper.registerComplaintDetails(testBean); 
		boolean condition = updatedBean > 1003;
		assertTrue(condition);
		
	}

	
		
}
