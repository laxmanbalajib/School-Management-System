package com.laxmanbalaji.mvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.laxmanbalaji.mvc.model.Earn;



public interface EarnRepo extends CrudRepository<Earn, Integer>{

	@Query(value = "SELECT * FROM Earn", nativeQuery = true)
	List<Earn> getAllEarning();
	
	@Query(value = "SELECT * FROM Earn WHERE staffId = :staffId", nativeQuery = true)
	Earn getAllEarnByStaffId(int staffId);

}
