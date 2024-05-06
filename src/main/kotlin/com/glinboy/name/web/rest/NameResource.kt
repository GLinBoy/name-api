package com.glinboy.name.web.rest

import com.glinboy.name.web.service.NameService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class NameResource(val nameService: NameService) {

	@GetMapping("/name")
	fun getName() = ResponseEntity(nameService.getName(), HttpStatus.OK)
}
