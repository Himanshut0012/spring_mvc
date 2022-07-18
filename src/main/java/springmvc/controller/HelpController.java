package springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/help")

public class HelpController {
	@RequestMapping("/")
	public ModelAndView help() {
		
//		creating object of model and view
		ModelAndView modelAndView= new ModelAndView();
		
//		pass data by model and view
		modelAndView.addObject("name","Mahadev");
		modelAndView.addObject("empId", 627);

//		Local time and date api use
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
//		pass date and time to help page
		modelAndView.addObject("date", date);
		modelAndView.addObject("time", time);
		modelAndView.addObject("dateTime", dateTime);
		
//		pass non primitive data 
		List<Integer> mobile=new ArrayList<Integer>();
		mobile.add(904477);
		mobile.add(5476576);
		mobile.add(546548);
		
		modelAndView.addObject("mobile",mobile);
		
//		pass data to jsp page
		modelAndView.setViewName("help");
		
		
		return modelAndView;
		
	}

}
