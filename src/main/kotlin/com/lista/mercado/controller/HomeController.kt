package com.lista.mercado.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {

    @GetMapping
    fun home(): String{
        return "Hora de fazer mercado !"
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long){

    }
}