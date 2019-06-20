package com.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView hello() {
		return new ModelAndView("hello", "message",
				"Welcome to my first spring mvc web");
	}

	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public Registration registration() {
		return new Registration();
	}

	@RequestMapping(value = "registration-page", method = RequestMethod.POST)
	public ModelAndView register(
			@ModelAttribute("registration") @Valid Registration registration,
			BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return new ModelAndView("registration");
		}
		model.addAttribute("firstName", registration.getFirstName());
		model.addAttribute("lastName", registration.getLastName());
		model.addAttribute("email", registration.getEmail());
		model.addAttribute("password", registration.getPassword());

		return new ModelAndView("success");
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout() {
		return "hello";

	}
}