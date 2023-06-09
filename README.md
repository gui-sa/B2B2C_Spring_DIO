# B2B2C_Spring_DIO
Sistema B2B2C que interconecta Negócios - Entregadores - Usuários Usando Java Spring Boot Framework.

## Padrões de Projeto Utilizado:
- Singleton utilizado internamente no Spring @Bean e @Autowired
- Strategy utilizado internamente no Spring @Service e @Repository
  - O service instancia e altera as estrategias internamente ao Spring. Nesse caso chamamos somente a interface e quem instancia a implementação é o proprio String.
- Socket utilizado para adaptar uma classe em outra classe.

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

## MySQL server:
Para configurar o MySQL voce precisa ir ao arquivo *application.properties* <br>
Lá, altere o URL, o nome do banco de dados, seu usuario e sua senha.

## Mais:
![image](https://github.com/gui-sa/B2B2C_Spring_DIO/assets/58073678/4963ed53-3e12-4288-8e75-27cbc0654644)
![image](https://github.com/gui-sa/B2B2C_Spring_DIO/assets/58073678/3ed6ac6c-935f-4311-9a32-c5831bad6352)

