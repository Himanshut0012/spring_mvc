package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/redirect")
public class RedirectController {
	
//	redirect by request mapping
	@RequestMapping(path = "/one",method = RequestMethod.GET)
	public String one() {
		System.out.println("this is one redirect;");
		return "redirect:enjoy";
	}

	@RequestMapping(path = "/enjoy",method = RequestMethod.GET)
	public String enjoy() {
		System.out.println("this is second/enjoy redirect");
		return"";
	}
	
//	redirect by RedirectView
	@RequestMapping(path = "/rdview",method = RequestMethod.GET)
	public RedirectView rdview() {
		System.out.println("this is rdview method handler");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	
	
	
}
