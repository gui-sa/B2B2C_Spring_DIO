# B2B2C_Spring_DIO
Sistema B2B2C que interconecta Negócios - Entregadores - Usuários Usando Java Spring Boot Framework.

## Padrões de Projeto Utilizado:
- Singleton utilizado internamente no Spring @Bean e @Autowired
- Strategy utilizado internamente no Spring @Service e @Repository
- 

## Regras de Negocio:

 - Usuario:
   - Cliente (Entity)
     - credit_card
   - Entregador (Entity)
     - cnh
   - Dono: (Entity)
     - conta_corrente
     - banco
   - Props Superclass: 
     - nome
     - cpf
     - id_usuario (PRIMARY KEY)
 - Negocio (Entity)
   - id_negocio (PRIMARY KEY)
   - fk_dono
   - cnpj
   - nome
 - Produto (Entity)
   - id_produto (PRIMARY KEY)
   - fk_negocio 
   - nome
   - preco
> Por questoes de simplicidade essa implementação o cliente so pode ter um cartão de credito

Ciclo de negocio:
1. cliente fazerPedido()
2. negocio aceitarPedido()
3. restaurante solicitaEntrega()
4. entregador aceitaEntrega()
5. cliente confirmaEntrega()

## Informações Construtivas:
 - Arquitetura em três Camadas
> Cliente >> {Controladores >> Serviços >> Persistencia} >> BancoDeDados
 - Linguagem Java v17
 - Empacotamento em JAR apesar do TommCat
 - Spring na versão 3.1.0
 - gradle as builder

## Modulos Utilizados:
 - Spring Web
> Para construção de APIs REST, TommCat e outros do SPRING WEB
 - Spring Data JPA
> Lidar com a camada de Persistencia e o ORM Hibernate
 - MySQL Driver
> Lidar com o JPA e connectar com MySQL Application 
 - Spring Security
> Lidar com a Segurança - autenticação e autorização dos diferentes autores
>> Na implementação desse exemplo esta parte sera a ultima a ser implementada.

## Como Rodar o Projeto Spring:
~~~
./gradlew bootRun
~~~