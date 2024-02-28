package scouter.health.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import scouter.health.filter.LoginUser;
import scouter.health.model.User;

@Controller
@RequestMapping("/view")
public class ViewCalendarController {

	@GetMapping("/calendar")
	public String viewCalendar(@LoginUser User user) {
		return "view/calendar";
	}

}
