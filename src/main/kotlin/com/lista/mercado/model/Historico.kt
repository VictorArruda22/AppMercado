package com.lista.mercado.model

import java.time.LocalDateTime

data class Historico(
    val id: Long? = null,
    val titulo: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val itens: List<Item> = ArrayList()
)