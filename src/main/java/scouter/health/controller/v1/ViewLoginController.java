package scouter.health.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewLoginController {

	@GetMapping("/login")
	public String viewLogin() {
		return "view/login";
	}
}
