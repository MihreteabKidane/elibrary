package edu.mum.cs.cs425.demowebapps.Mkweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MkwebController {
	
	@GetMapping("/home")
	public String homePage() {
		
		return "MyHomePage";
	}

}
