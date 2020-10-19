package com.laxmanbalaji.mvc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laxmanbalaji.mvc.repo.StaffRepo;

@Controller
public class HomeController {
	
	@Autowired
	StaffRepo staffRepo;

	/*
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("dataName", "Balaji");
	}*/
	

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Home page is requested...");
		mv.setViewName("index");

		return mv;
	}
	/*
	@PostMapping("addAlien3")
	public String addAlien3(@ModelAttribute("modelName") Alien a) {

		repo.save(a);
		return "result";
	}*/
	
	@RequestMapping("getStaffs")
	public String getStaffs(Model m) {
		
		m.addAttribute("staffs", staffRepo.findAll());
		
		return "showStaffs";
	} 
	
	@GetMapping("getStaffById")
	public String getAlien(@RequestParam int id, Model m) {
		
		m.addAttribute("staffs", staffRepo.getOne(id));
		
		return "showStaffs";
	}
	
	/*@GetMapping("getAlienByName")
	public String getAlien(@RequestParam String name, Model m) {
		
		//m.addAttribute("aliens", repo.findByName(name));
		//m.addAttribute("aliens", repo.findByNameOrderByAgeDesc(name));
		//m.addAttribute("aliens", repo.find(name));
		m.addAttribute("aliens", repo.findOneByName(name));
		
		return "showAliens";
	}*/
}

