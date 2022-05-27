package com.lista.mercado.model

import java.time.LocalDate

data class Item (
    val id: Long? = null,
    val nome: String,
    val categoria: String,
    val marca: String,
    val validade: LocalDate
)
