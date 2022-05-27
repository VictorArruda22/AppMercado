package com.lista.mercado.controller

import com.lista.mercado.model.Item
import com.lista.mercado.service.HistoricoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/historico")
class HistoricoController(private val historicoService: HistoricoService) {
    @GetMapping
    fun listarHistorico(): List<Item>{
        return historicoService.listarHistorico()
    }
}