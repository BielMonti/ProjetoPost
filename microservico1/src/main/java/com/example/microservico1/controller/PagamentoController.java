package com.example.microservico1.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/pagar")
    public String pagar(@RequestBody Pedido pedido) {
        // Lógica para processar o pagamento

        // Enviar mensagem para o RabbitMQ
        rabbitTemplate.convertAndSend("fila_pagamentos", pedido);

        return "Pagamento recebido com sucesso!";
    }
}
