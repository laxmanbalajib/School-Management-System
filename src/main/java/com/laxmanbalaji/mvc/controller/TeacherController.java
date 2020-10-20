package com.laxmanbalaji.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laxmanbalaji.mvc.repo.CourseRepo;
import com.laxmanbalaji.mvc.repo.EarnRepo;
import com.laxmanbalaji.mvc.repo.StaffRepo;


@Controller
@RequestMapping("teacher")
public class TeacherController {

	@Autowired
	StaffRepo staffRepo;
	
	@RequestMapping("")
	public String home() {
		System.out.println("Teacher Home page is requested...");
		return "teacherInfo";
	}

	@RequestMapping("/findAllStaff")
	public String getStaffs(Model m) {
		System.out.println("Requested all staffs...");

		m.addAttribute("staffs", staffRepo.getAllStaff());
		return "showStaffs";
	}
	
	@RequestMapping("/findStaffById")
	public String getStaffById(@RequestParam int staffId, Model m) {
		System.out.println("Requested staff by ID...");
		m.addAttribute("hide", 1);
		m.addAttribute("staff", staffRepo.getStaffById(staffId));
		return "teacherInfo";
	}
	
	@RequestMapping("/findStaffBySalary")
	public String getStaffBySalary(@RequestParam int salaryStart, @RequestParam int salaryEnd, Model m) {
		System.out.println("Requested staff by ID...");
		m.addAttribute("staffs", staffRepo.getStaffBySalary(salaryStart, salaryEnd));
		return "showStaffs";
	}
}
