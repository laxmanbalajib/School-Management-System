package com.laxmanbalaji.mvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.laxmanbalaji.mvc.model.Staff;

public interface StaffRepo extends CrudRepository<Staff, Integer>{
	@Query(value = "SELECT * FROM Staff", nativeQuery = true)
	List<Staff> getAllStaff();
	
	@Query(value = "SELECT * FROM Staff WHERE id = :staffId", nativeQuery = true)
	Staff getStaffById(int staffId);
}
