# 🚀 POC Java Spring Boot

Projeto desenvolvido com **Java e Spring Boot** com o objetivo de praticar e demonstrar conceitos utilizados no desenvolvimento de APIs REST, persistência de dados, arquitetura de aplicações e boas práticas no ecossistema Java.

Esta POC será evoluída gradualmente, incorporando novas funcionalidades, tecnologias e conceitos de desenvolvimento backend.

---

## 🎯 Objetivo

O objetivo deste projeto é construir uma aplicação backend utilizando o ecossistema **Spring Boot**, explorando desde a criação de APIs REST até persistência de dados e evolução da arquitetura da aplicação.

A ideia é utilizar o projeto como laboratório prático para desenvolvimento e também como projeto de portfólio profissional.

---

## 🛠️ Tecnologias utilizadas

### ☕ Java

Linguagem principal utilizada no desenvolvimento da aplicação.

Será utilizada para implementação das regras de negócio, entidades, serviços, controllers e demais componentes da aplicação.

### 🌱 Spring Boot

Framework utilizado como base para construção da aplicação backend.

O Spring Boot facilita a configuração e inicialização de aplicações Java utilizando o ecossistema Spring, reduzindo configurações manuais e permitindo criar APIs de forma mais produtiva.

### 🌐 Spring Web

Utilizado para desenvolvimento da **API REST**.

Permite criar endpoints HTTP utilizando métodos como:

- `GET`
- `POST`
- `PUT`
- `PATCH`
- `DELETE`

Também fornece recursos para trabalhar com:

- Controllers
- HTTP Requests
- HTTP Responses
- JSON
- Rotas
- Status HTTP

### 🗄️ Spring Data JPA

Utilizado para realizar a **persistência dos dados**.

O Spring Data JPA simplifica a comunicação entre a aplicação Java e o banco de dados através do padrão **JPA (Java Persistence API)**.

Com ele será possível trabalhar com:

- Entidades
- Repositories
- CRUD
- Consultas
- Relacionamentos
- Persistência de objetos

Uma das principais vantagens é permitir trabalhar com objetos Java sem precisar escrever manualmente todas as operações SQL.

### 💾 H2 Database

Banco de dados relacional utilizado inicialmente nesta POC.

O **H2** é um banco de dados leve, muito utilizado em projetos de desenvolvimento, testes e prototipação.

Nesta etapa inicial, o H2 permite desenvolver e testar a camada de persistência sem a necessidade de instalar ou configurar um banco de dados externo.

---

## 📦 Dependências iniciais

| Dependência | Responsabilidade |
|---|---|
| Spring Web | Construção da API REST |
| Spring Data JPA | Persistência e acesso aos dados |
| H2 Database | Banco de dados relacional |

---

## 🏗️ Arquitetura inicial

A aplicação será organizada seguindo a separação de responsabilidades entre as principais camadas da aplicação.

Fluxo inicial:

```text
Cliente
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
H2 Database
