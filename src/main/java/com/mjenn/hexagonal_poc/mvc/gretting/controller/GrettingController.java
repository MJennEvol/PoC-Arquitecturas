package com.mjenn.hexagonal_poc.mvc.gretting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GrettingController {
    @GetMapping("/greeting")
	public String greeting(
        @RequestParam(name="name", required=false, defaultValue="World") String name,
        @RequestParam(name="lastname", required=false, defaultValue="Espinoza") String lastname, 
        Model model) {
		model.addAttribute("name", name);
        model.addAttribute("lastname", lastname);
		return "greeting";
	}
}
