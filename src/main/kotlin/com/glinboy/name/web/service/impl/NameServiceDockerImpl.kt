package com.glinboy.name.web.service.impl

import com.glinboy.name.web.service.NameService
import org.springframework.stereotype.Service

@Service
class NameServiceDockerImpl : NameService {

	override fun getName(): String = "Docker Name"

}
