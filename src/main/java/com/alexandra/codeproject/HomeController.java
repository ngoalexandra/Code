package com.alexandra.codeproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class HomeController {
	@RequestMapping("/") 
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String theCode(@RequestParam(value="code") String guess, RedirectAttributes redirectAttributes) {
		if (guess.equals("secretcode")) {
			return "redirect:/winner";
		} else {
			redirectAttributes.addFlashAttribute("error", "Try again!");
			return "redirect:/";
		}
		
		}
	@RequestMapping("/winner")
	public String win() {
		return "winner.jsp";
	}         

}
