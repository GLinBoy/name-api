package com.glinboy.name.web.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class NameResource {

	@GetMapping("/name")
	fun getName() = ResponseEntity("Name", HttpStatus.OK)
}
