# AV_2_ARQUITETURA_DE_APLICACOES

## Documentação da API JWT Ecommerce

### Visão Geral

A API JWT User suporta autenticação com JSON Web Tokens (JWT). Isso facilita a autenticação de usuários e a emissão de tokens JWT para acessar endpoints seguros.

### APIs Disponíveis

POST /login: Endpoint de autenticação para obter um token JWT.

Endpoint: https://api.exemplo.com/login


GET /username/{token}: Rota que obtém o nome de usuário a partir de um token JWT.

Endpoint: https://api.exemplo.com/username/{token}


GET /user: Rota que obtém informações sobre o usuário autenticado.

Endpoint: https://api.exemplo.com/user


GET /admin: Rota protegida acessível apenas por usuários com a função ADMIN.

Endpoint: https://api.exemplo.com/admin


GET /manager/products: Rota protegida acessível apenas por usuários com a função GERENTE.

Endpoint: http://localhost:8080/manager/products


GET /seller/orders : Rota acessível por usuários VENDEDOR.

Endpoint: http://localhost:8080/seller/orders


GET /seller/orders : Rota acessível por usuários CLIENTE.

Endpoint: http://localhost:8080/customer/products


### Guia de Introdução
Para começar a usar a API JWT User, siga estes passos:

1. Obtenha uma chave de API ativa para autenticar suas solicitações.
2. Certifique-se de que a chave de API esteja incluída em cada solicitação para os endpoints da API.
3. Todas as solicitações devem ser feitas por HTTPS.
4. As respostas da API estão no formato JSON.
 
### Autenticação
A API autentica as chamadas usando um token JWT.

#### Para autenticar uma solicitação:

1. Obtenha um token JWT no endpoint POST /login.
2. Passe o token JWT no cabeçalho da solicitação para chamadas subsequentes (Authorization: Bearer {token}).
   
### Resposta de Erro de Autenticação:

Se uma chave de API estiver ausente ou inválida/malformada, a resposta retornará um código de status HTTP 401 Não Autorizado.

### Testes com Insomnia
A API JWT User foi testada usando o Insomnia. Você pode baixar a coleção de testes e importá-la diretamente no Insomnia para testar os endpoints e o comportamento da API.

### Limites de Taxa e Uso

Os limites de taxa e uso da API JWT User são os seguintes:

- Limite de Taxa: 300 solicitações por minuto por chave de API.
- Código de Status: Você receberá uma resposta HTTP 429 Too Many Requests se exceder o limite de taxa.
  
### Cabeçalhos de Resposta:
- X-RateLimit-Limit: O número máximo de solicitações permitidas por minuto.
- X-RateLimit-Remaining: O número de solicitações restantes na janela de limite de taxa atual.
- X-RateLimit-Reset: O timestamp de quando a janela de limite de taxa atual será redefinida, em segundos do éon UTC.
  
## Conclusão
A API JWT User oferece autenticação segura com JSON Web Tokens (JWT), permitindo acesso a endpoints protegidos por diferentes níveis de permissão (ADMIN, MODERADO, comum). Para começar, obtenha uma chave de API, inclua-a em solicitações HTTPS e utilize tokens JWT para autenticação. A API possui limites de taxa de 300 solicitações por minuto por chave de API, com respostas detalhadas sobre o status da taxa de solicitações.

### Diagrama - JWT

<img width="843" alt="image" src="https://github.com/jadebrandao/AV_2_ARQUITETURA_DE_APLICACOES/assets/108814737/d4649ff5-25ef-4003-8e71-82a079149229">

(https://bit.ly/3XpgaHr)

### Imagens do Insomnia em execusão: 
![image](https://github.com/jadebrandao/AV_2_ARQUITETURA_DE_APLICACOES/assets/108814737/78ba6770-7385-458e-a167-dd4dee99093a)
![image](https://github.com/jadebrandao/AV_2_ARQUITETURA_DE_APLICACOES/assets/108814737/bbde9aee-8a67-4a7f-8a96-badcaeb16938)
![image](https://github.com/jadebrandao/AV_2_ARQUITETURA_DE_APLICACOES/assets/108814737/33f64630-053e-45ee-8a7e-08f2918ed693)
![image](https://github.com/jadebrandao/AV_2_ARQUITETURA_DE_APLICACOES/assets/108814737/51a41589-03b3-445b-98c2-fb75820545e2)
![image](https://github.com/jadebrandao/AV_2_ARQUITETURA_DE_APLICACOES/assets/108814737/d1099e81-a289-46f6-b5f3-9154442f4478)






### Print de teste unitário realizado: 

<img width="937" alt="image" src="https://github.com/jadebrandao/AV_2_ARQUITETURA_DE_APLICACOES/assets/108814737/89ed930d-09a9-445b-8296-ee97c270d1eb">

