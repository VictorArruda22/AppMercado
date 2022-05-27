package com.lista.mercado.service

import com.lista.mercado.model.Item
import org.springframework.stereotype.Service

@Service
class ItemService(private val itens: kotlin.collections.List<Item> = ArrayList()) {
    fun listar(): List<Item>{
        return itens
    }

    fun cadastrar(item: Item) {
        itens.plus(item)
    }
}
