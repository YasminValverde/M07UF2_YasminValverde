package cat.institutmarianao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

	@GetMapping(value = "/loginfailed")
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		return "login";
	}
}