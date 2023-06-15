# Projeto Spring Boot Java

Este projeto teve como objetivo implementar um aplicativo utilizando o framework Spring Boot em Java. O projeto visou criar um modelo de domínio e estruturar as camadas lógicas de acordo com as melhores práticas, como resource, service e repository. Além disso, foram configurados um banco de dados de teste utilizando o H2, populado com dados iniciais. O aplicativo também forneceu operações CRUD (Create, Retrieve, Update, Delete) para manipulação dos dados do banco. Além disso, foram implementados mecanismos de tratamento de exceções para garantir a robustez e a segurança do aplicativo.

## Estrutura do Projeto

O projeto seguiu uma estrutura de camadas lógicas para separação de responsabilidades e facilitar a manutenção e extensibilidade do código. As principais camadas incluídas no projeto são:

- **Resource**: Essa camada é responsável por receber as requisições HTTP e manipular os dados de entrada e saída. Aqui, serão implementados os controladores (controllers) que receberão as requisições e direcionarão para os serviços apropriados.

- **Service**: A camada de serviço contém a lógica de negócio do aplicativo. Aqui serão implementadas as regras de negócio e a manipulação dos dados. Os serviços serão chamados pelos controladores para realizar as operações solicitadas.

- **Repository**: Essa camada é responsável pela comunicação com o banco de dados. Aqui serão implementadas as consultas e operações de persistência dos dados. Os serviços utilizarão os repositórios para realizar as operações no banco.

## Banco de Dados de Teste (H2)

Para fins de teste e desenvolvimento, foi utilizado o banco de dados H2, um banco de dados em memória. Isso permitirá que o aplicativo seja executado sem a necessidade de configuração adicional de um banco de dados externo. O H2 é amplamente utilizado com o Spring Boot e fornece um ambiente conveniente para desenvolvimento e teste.

## Povoando o Banco de Dados

O banco de dados de teste foi inicialmente populado com alguns dados iniciais. Esses dados podem ser usados para testar as funcionalidades do aplicativo sem a necessidade de inserir manualmente os dados a cada execução. Essa população inicial do banco de dados pode ser feita durante a inicialização do aplicativo ou através de scripts de inicialização.

## Operações CRUD

O aplicativo implementa as operações básicas de CRUD (Create, Retrieve, Update, Delete) para manipulação dos dados do banco. Isso significa que será possível criar novos registros, recuperar registros existentes, atualizar informações em registros existentes e excluir registros.

## Tratamento de Exceções

Foram implementados mecanismos de tratamento de exceções para lidar com possíveis erros e exceções que possam ocorrer durante a execução do aplicativo. Isso garantirá que o aplicativo seja robusto e capaz de lidar com situações inesperadas de forma adequada, fornecendo mensagens de erro adequadas e garantindo a integridade dos dados.

## Conclusão

Este projeto Spring Boot em Java visou criar um aplicativo com um modelo de domínio bem estruturado, camadas lógicas organizadas, um banco de dados de teste configurado, operações CRUD implementadas e tratamento adequado

 de exceções. Esses objetivos fornecem uma base sólida para o desenvolvimento de um aplicativo Java escalável, seguro e fácil de manter.
