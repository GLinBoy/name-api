package com.glinboy.name.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

	@GetMapping("/")
	fun home(): String = "redirect:/swagger-ui.html"
}
