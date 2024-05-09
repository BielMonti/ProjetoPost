import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoListener {

    @RabbitListener(queues = "fila_pagamentos")
    public void receberMensagem(Pedido pedido) {
        // Lógica para processar o pedido recebido
        
        System.out.println("Pedido recebido: " + pedido);
    }
}
