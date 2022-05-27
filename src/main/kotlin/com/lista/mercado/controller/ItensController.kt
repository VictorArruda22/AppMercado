package com.lista.mercado.controller

import com.lista.mercado.model.Item
import com.lista.mercado.service.ItemService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Provider.Service

@RestController
@RequestMapping("/item")
class ItensController(private val service: ItemService) {
    @GetMapping
    fun listarItem(): List<Item>{
        return service.listar()
    }

    @PostMapping
    fun cadastrarItem(@RequestBody item: Item){
        service.cadastrar(item)
    }
}