# FactoryPulse — Monitoramento de Produção Industrial

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.2-6DB33F?logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven)
![Database](https://img.shields.io/badge/Database-H2-blue)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-blue)

## Sobre o projeto

O **FactoryPulse** é um projeto de desenvolvimento de software voltado ao monitoramento de produção industrial, com foco em processos de laticínios e no processamento de soro de leite líquido.

A aplicação foi desenvolvida para demonstrar como a tecnologia pode auxiliar no acompanhamento de indicadores produtivos, organização de registros e visualização de informações operacionais em um único painel.

O projeto utiliza uma arquitetura baseada em Java e Spring Boot no backend, com uma interface web desenvolvida em HTML, CSS e JavaScript.

## Objetivos

- Registrar apontamentos de produção industrial.
- Armazenar informações de produto, volume, turno e data.
- Consultar os registros por meio de uma API REST.
- Organizar informações para acompanhamento da produção.
- Apresentar indicadores e informações operacionais em um dashboard.
- Explorar a aplicação de desenvolvimento backend em um cenário industrial.

## Funcionalidades

- Cadastro de registros de produção.
- Consulta de registros cadastrados.
- Integração entre frontend e backend por API REST.
- Persistência de dados utilizando Spring Data JPA.
- Banco de dados H2.
- Dashboard para visualização das informações de produção.
- Organização dos registros por data e turno.

## Tecnologias utilizadas

### Backend
- Java 21
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- Jakarta Validation
- Maven

### Banco de dados
- H2 Database

### Frontend
- HTML5
- CSS3
- JavaScript

### Ferramentas
- IntelliJ IDEA
- Git
- GitHub
- Postman

## Estrutura do projeto

```text
factorypulse/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/giordana/factorypulse/
│   │   │       ├── controller/
│   │   │       │   └── ProducaoController.java
│   │   │       │
│   │   │       ├── model/
│   │   │       │   └── Producao.java
│   │   │       │
│   │   │       ├── repository/
│   │   │       │   └── ProducaoRepository.java
│   │   │       │
│   │   │       └── HealthController.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html
│   │       │
│   │       └── application.properties
│   │
│   └── test/
│
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Modelo de dados

A entidade `Producao` representa os apontamentos de produção registrados na aplicação.

| Campo | Descrição |
|---|---|
| id | Identificador do registro |
| produto | Produto registrado |
| quantidade | Volume de produção em litros |
| turno | Turno de produção |
| data | Data do apontamento |

Os turnos disponíveis no cenário do projeto são:

- Manhã
- Tarde
- Noite
- Madrugada

## API REST

A aplicação disponibiliza os seguintes endpoints:

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/api/producao` | Consulta os registros |
| POST | `/api/producao` | Cadastra um novo registro |
| GET | `/api/status` | Verifica o funcionamento da aplicação |

### Exemplo de cadastro

Requisição:

```http
POST /api/producao
Content-Type: application/json
```

Corpo:

```json
{
  "produto": "Soro de leite líquido",
  "quantidade": 12500,
  "turno": "Manhã",
  "data": "2026-11-11"
}
```

### Exemplo de consulta

```http
GET /api/producao
```

## Como executar o projeto

### Pré-requisitos

- Java JDK 21
- IntelliJ IDEA ou outra IDE compatível
- Git

### 1. Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/factorypulse.git
```

### 2. Acesse a pasta

```bash
cd factorypulse
```

### 3. Execute a aplicação

No Windows, utilize:

```powershell
.\mvnw.cmd spring-boot:run
```

### 4. Acesse o dashboard

Abra no navegador:

```text
http://localhost:8080
```

API:

```text
http://localhost:8080/api/producao
```

## Banco de dados

O projeto utiliza o H2 Database integrado ao Spring Data JPA.

Nesta etapa, o banco está configurado para execução em memória, facilitando o desenvolvimento e os testes da aplicação. Por isso, os registros podem ser perdidos quando a aplicação é encerrada.

## Aprendizados e desenvolvimento

O desenvolvimento do FactoryPulse envolve conceitos importantes de desenvolvimento de software, como:

- Programação orientada a objetos com Java.
- Desenvolvimento de APIs REST.
- Organização em camadas: Controller, Model e Repository.
- Persistência de dados com JPA.
- Integração entre frontend e backend.
- Manipulação de dados com JavaScript.
- Construção de interfaces para visualização de indicadores.

## Próximas evoluções

- Implementação de filtros avançados de produção.
- Persistência de dados em banco relacional definitivo.
- Ampliação dos indicadores operacionais.
- Integração de informações de qualidade do produto.
- Testes automatizados.
- Melhorias na geração de relatórios.

## Autora

**Giordana Stumm**

Estudante de Ciência da Computação | Técnica em Informática | Desenvolvedora de Software

Interesse em desenvolvimento backend, Java, Spring Boot e soluções tecnológicas aplicadas a processos reais.

---

*FactoryPulse — Transformando registros de produção em informação para tomada de decisão.*
