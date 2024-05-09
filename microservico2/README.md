# Microserviço 2 - Servidor

Este é o Microserviço 2, que atua como servidor e recebe requisições HTTP do Microserviço 1 no endpoint "/notificar". Além disso, este microserviço posta mensagens em um tópico de mensageria RabbitMQ.

## Como Executar

1. Construir o Projeto:
mvn clean package


2. Configurar o RabbitMQ (se necessário):
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management

Isso iniciará um contêiner RabbitMQ com a interface de gerenciamento acessível em http://localhost:15672.


3. Executar o Microserviço 2:
java -jar target/microservico2.jar


Isso iniciará o Microserviço 2 e ele estará disponível para receber requisições HTTP em http://localhost:8080/notificar.