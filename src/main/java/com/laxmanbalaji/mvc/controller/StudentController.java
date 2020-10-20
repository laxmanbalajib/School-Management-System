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
import com.laxmanbalaji.mvc.repo.StudentRepo;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentRepo studentRepo;

	@RequestMapping("")
	public String home() {
		System.out.println("Student Home page is requested...");
		return "studentInfo";
	}

	@RequestMapping("/findAllStudents")
	public String getstudents(Model m) {
		System.out.println("Requested all students...");

		m.addAttribute("students", studentRepo.getAllStudents());
		return "showStudents";
	}

	@RequestMapping("/findStudentById")
	public String getstudentById(@RequestParam int studentId, Model m) {
		System.out.println("Requested student by ID...");
		m.addAttribute("hide", 1);
		m.addAttribute("student", studentRepo.getStudentById(studentId));
		return "studentInfo";
	}

	@RequestMapping("/findAllStudentsTuition")
	public String getstudentsTuition(Model m) {
		System.out.println("Requested all students...");

		m.addAttribute("students", studentRepo.getTuition());
		return "showStudentsTotal";
	}
	/*
	 * @RequestMapping("/findstudentBySalary") public String
	 * getstudentBySalary(@RequestParam int salaryStart, @RequestParam int
	 * salaryEnd, Model m) { System.out.println("Requested student by Salary...");
	 * m.addAttribute("hide", 1); m.addAttribute("salaryStart", salaryStart);
	 * m.addAttribute("salaryEnd", salaryEnd); m.addAttribute("students",
	 * studentRepo.getstudentBySalary(salaryStart, salaryEnd)); return
	 * "showstudents"; }
	 */
}
