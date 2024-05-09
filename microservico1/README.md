# Microserviço 1 - Cliente

Este é o Microserviço 1, que atua como cliente e recebe requisições HTTP em "/pagar".

## Como Executar

1. Construa o projeto:
./mvnw clean package


2. Construa a imagem Docker:
docker build -t microservico1


3. Execute o contêiner Docker:
docker run -d -p 8080:8080 microservico1


O serviço estará disponível em http://localhost:8080/pagar.
