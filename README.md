# Big Game Survey 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MurilloMorgado/people-sync/blob/main/LICENSE) 

# Sobre o projeto


People-sync é uma API desenvolvida com o objetivo de gerenciar cadastros de usuários, permitindo a consulta e o gerenciamento de informações como nome, endereço e profissão. A aplicação foi construída para consolidar o conhecimento em arquitetura Hexagonal e em REST APIs.

## Objetivos do Projeto

* Gestão de Cadastros de Usuários: A API permite adicionar, editar e consultar usuários, armazenando dados essenciais como nome, endereço e profissão.

* Arquitetura Hexagonal: A aplicação adota a arquitetura hexagonal (também conhecida como arquitetura de portas e adaptadores), visando separar as preocupações de negócio das interfaces externas (como bancos de dados e APIs).

* RESTful API: A comunicação entre o cliente e o servidor é feita através de uma API RESTful, garantindo simplicidade, escalabilidade e independência entre os componentes do sistema.

## Funcionalidades

A API oferece diversos endpoints que permitem:

* Cadastro de Usuários: Adiciona novos usuários ao sistema com informações como nome, idade, e-mail, cpf, data de nascimento endereço e profissão.
  
* Consulta de Usuários: Permite buscar informações dos usuários cadastrados, filtrando por nome ou ID.

* Atualização de Dados: Atualiza informações específicas de um usuário já cadastrado.

* Remoção de Usuários: Exclui usuários do sistema conforme a necessidade.

## CRUD e Banco de Dados
* Funcionalidades CRUD: A API suporta operações CRUD (Create, Read, Update, Delete), permitindo a inclusão, atualização, consulta e remoção de informações.
  
* Banco de Dados H2: Para facilitar o desenvolvimento e testes, a API utiliza o banco de dados H2. Esse banco de dados em memória é ideal para testes rápidos e integrações durante o desenvolvimento. 

# Tecnologias utilizadas
## Back end
- Java: Linguagem de programação utilizada para construir a API.
- Spring Boot: Framework para simplificar a criação de aplicações Java, com foco em REST APIs.
- JPA (Java Persistence API): API para manipulação e persistência de dados em banco de dados relacional.
- Hibernate: Framework de mapeamento objeto-relacional (ORM) utilizado para realizar a integração entre a aplicação Java e o banco de dados.
- Maven: Ferramenta de gerenciamento de dependências e build para projetos Java.
- Arquitetura Hexagonal: Estrutura modular que separa a lógica de negócios da comunicação externa.
- MySQL: Banco de dados relacional utilizado para persistência dos dados.

## Back end
- Pré-requisitos: Java 17

# Como executar o projeto
-Cone o repositório:

```bash
# clonar repositório
git clone https://github.com/seu-usuario/people-sync.git
```

- Crie um banco de dados no MySQL com o nome people_sync (ou outro nome de sua preferência).
- Atualize as credenciais de acesso ao banco de dados no arquivo de configuração application.properties ou application.yml (localizado em src/main/resources).

# Autor

Murillo Morgado

https://www.linkedin.com/in/murillo-morgado

