package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("this is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/pass")
	public String pass(Model model) {
		model.addAttribute("name", "Himanshu Tripathi");
		model.addAttribute("ID", 627);
		List<String> skills = new ArrayList<String>();
		skills.add("Java");
		skills.add("MYSQL");
		skills.add("HTML/CSS");
		model.addAttribute("sp", skills);
		
		
		return "about";
	}

}
