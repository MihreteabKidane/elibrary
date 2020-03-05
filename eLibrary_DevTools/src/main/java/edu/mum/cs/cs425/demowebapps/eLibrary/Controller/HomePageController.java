package edu.mum.cs.cs425.demowebapps.eLibrary.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
@GetMapping(value= {"/","/eLibrary","/eLibrary/home"})
public String displayHomePage() {
	return "home/index";
}

}
