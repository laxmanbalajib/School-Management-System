package com.laxmanbalaji.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laxmanbalaji.mvc.model.Earn;
import com.laxmanbalaji.mvc.model.Tuition;



public interface TuitionFeeRepo extends JpaRepository<Tuition, Integer>{

}
