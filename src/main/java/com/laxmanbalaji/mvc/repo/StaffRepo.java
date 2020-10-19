package com.laxmanbalaji.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.laxmanbalaji.mvc.model.Staff;

public interface StaffRepo extends JpaRepository<Staff, Integer>{
}
