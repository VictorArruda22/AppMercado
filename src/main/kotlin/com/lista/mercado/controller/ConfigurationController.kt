package com.lista.mercado.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/config")
class ConfigurationController {
    @GetMapping
    fun configuration(): String{
        return "Lorem ipsum"
    }
}