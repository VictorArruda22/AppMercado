package com.lista.mercado.service

import com.lista.mercado.model.Historico
import com.lista.mercado.model.Item
import org.springframework.stereotype.Service

@Service
class HistoricoService(private var historicos: List<Item> = ArrayList()) {
    fun listarHistorico(): List<Item> {
        return historicos
    }

}
