# Funcionamento do projeto

O projeto consiste no consumo do web service descrito no WSDL fornecido, o qual fornece uma lista de solicitações de viagens, as quais serão exibidas
em uma página web e simultaneamente persistidas em um banco de dados.

A informação obtida no response do web service é validada, disponibilizada na tela através de componentes do JSF e persistida no banco
através de outros componentes que implementam a JPA.


# Arquitetura do projeto

A arquitetura do projeto foi baseada em JSF com primefaces e hibernate para persistência dos dados em um banco PostgreSQL, bem como maven para o gerenciamento 
de dependências e utilização do Tomcat 8 como container da aplicação.

As classes do projeto foram organizadas em pacotes conforme a seguir:

* **Client gerado pelo eclipse:** Contém as classes geradas automaticamente pelo eclipse a partir do WSDL fornecido.
* **beans:** Contém o ManagedBean da tela que exibirá as informações retornadas pelo web service, e também responsável pelo request.
* **dao:** Contém o DAO do objeto que será persistido no banco, com seus métodos de inserção e a classe genérica que controla a EntityManager.
* **model:** Contém o model do objeto que será persistido no banco, com seus atributos e getters/setters.
* **controller:** Contém a classe client que faz a validação do response do web service, chama o DAO para persistência e retorna os dados para exibição na tela.

# Executando o projeto

Para a execução do projeto:

* Instale o banco de dados PostgreSQL, com usuario e senha 'postgres' e crie uma database chamada lemontech
* Execute o arquivo TABLE_VIAGEM localizado na raiz do projeto para criar a tabela
* Configure o Tomcat 8 na sua máquina
* Faça o pull do projeto e o deploy no Tomcat
