import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificacaoController {

    @PostMapping("/notificar")
    public String notificar() {
        // Lógica para processar a notificação
        
        return "Notificação recebida com sucesso!";
    }
}
