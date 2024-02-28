package scouter.health.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewCalendarController {

	@GetMapping("/calendar")
	public String viewCalendar() {
		return "calendar";
	}

}
