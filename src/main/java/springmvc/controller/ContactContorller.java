package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;


@Controller
@RequestMapping("/contact")
public class ContactContorller {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("hdr","Please fill this form");
		model.addAttribute("desc","all fields are monditanory");
	}
	
	@RequestMapping( path = "/",method = RequestMethod.GET )
	public String showForm(Model model) {
		
		return "contact";
	}
	
	/*
	 * @RequestMapping(path = "/form",method = RequestMethod.POST) public
	 * ModelAndView submitForm(
	 * 
	 * @RequestParam(name="userName", required = true) String userName,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("password") String password) {
	 * System.out.println("post handler method run"); ModelAndView modelAndView=new
	 * ModelAndView(); // modelAndView.addObject("userName",userName); //
	 * modelAndView.addObject("email",email); //
	 * modelAndView.addObject("password",password); //
	 * modelAndView.addObject("check",check);
	 * 
	 * // Create User Class and set attribute there User user = new User();
	 * user.setUserName(userName); user.setEmail(email); user.setPassword(password);
	 * modelAndView.addObject("user", user);
	 * 
	 * System.out.println(user); modelAndView.setViewName("showInputContact");
	 * 
	 * return modelAndView; }
	 */
	
	@RequestMapping(path = "/form",method = RequestMethod.POST)
	public String submitForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		if(user.getUserName().isBlank()) {
			return "redirect: /springmvc/contact/";
		}
		int id =this.userService.createUser(user);
		model.addAttribute("msg", id);
		return "showInputContact";
	}

}
