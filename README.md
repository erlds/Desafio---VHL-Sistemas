# Desafio VHL Sistemas - Pessoa Desenvolvedora Java Pleno

O projeto implementado aqui visa a obtenção e apresentação dos dados de retorno do método getEntesDeclaradosUtilidadePublicaEstadual presente na classe SeloService do sistema do TJSC.

Todo o projeto foi implemetado no pacote com.desafioVHL.api, o conjunto de pastas/pacotes br.jus.tjsc.selo serve apenas para o projeto principal poder fazer uso dessas classes nas aplicações (SeloService e EnteDeclaradoUtilidadePublicaEstadual).
Existem teste unitários no diretorio src/test para todas as camadas da aplicação, que podem ser facilmente verificadas em uma IDE como o IntellJ

O projeto foi inteiramente criado no Java 11, utilizando a IDE IntelliJ, e uma outra parte foi feita no VSCode, utilizando gerenciador de projetos Maven e framework Spring, o sistema operacional usado foi o Linux Debian 11.

## Executando a aplicação

---
### 1. Adição de Certificado

O projeto já tem o arquivo de certificado da página do TJSC, o certificate.crt

Use o seguinte comando no java 11 para adicionar o certificado diretamente ao truststore:

```bash
sudo keytool -import -alias [alias_name] -file [certificate_file] -keystore /usr/lib/jvm/java-11-openjdk-amd64/lib/security/cacerts
```

- `[alias_name]` é um apelido basicamente (ex: certificado)
- `[certificate_file]` é o caminho para o arquivo de certificado (nesse caso certificate.crt).
- `/usr/lib/jvm/java-11-openjdk-amd64/lib/security/cacerts` é o caminho para o truststore padrão

---

### 2. Execução do projeto

Com o certificado adicionado basta abrir a aplicação no junit, ou pode-se gerar o .jar no terminal com o comando usando o comando (importante ter o maven instalado na máquina)

```bash
mvn clean install
```

e logo após rodar o java na máquina usando:

```bash
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -jar desafio-vhlsistemas-1.0-SNAPSHOT.jar
```

Se o certificado não estiver no java, um log de erro apareça no console, e a aplicação estará com o banco de dados vazio

## Testando a implementação

Existem 3 maneiras de se testar o funcionamento dessa aplicação:

---

### 1. Swagger UI

Esse projeto possui uma documentação swagger, disponível no endereço: http://localhost:8080/swagger-ui/, a qual pode ser usada para realizar as requisições.

Ex: no endpoint entes/{id} ao clicar-se em try it out, ele libera a edição dos campos de texto, colocando o id com valor 1, e clicando em execute, ele primeiro irá pedir o usuário que é **cartorio** e a senha **selodigital**, e depois irá fazer a requisição, sendo que  os valores do ente selecionado estarão no campo response body.

---

### 2. Navegador

Pode-se testar o projeto também no navegador digitando no campo

Ao colocar a requisição http://localhost:8080/entes/1, diretamente no navegador, ele irá pedir as credenciais na página (que são as mesmas), e irá devolver em um JSON na página os valores do ente.

---

### 3. Postman (ou insomnia)

Usando uma aplicação postman, basta criar um novo request, passar o link http://localhost:8080/entes/1, escolher GET como método http.

Na aba auth, escolha a opção ***Basic Auth*** preenchendo as credenciais com os valores descritos acima.

Logo após, ao clicar em Send, ele irá devolver as informações do ente.

Obs: Para o segundo endpoint, responsável por buscar pelo nomeDaEntidade, deve-se adicionar os parametros no campo de texto ou na aba params, um exemplo de requisição, buscando na página 0 de tamanho 5 seria: 

http://localhost:8080/entes?page=0&nomeDaEntidade=GRUPO CONDOR&size=5

---

## Endpoints do projeto

### Buscar o Ente pelo Nome da Entidade:

**URL** : `entes`

**Method** : `GET`

**Parâmetros Query** : 
- *nomeDaEntidade* -> nome da entidade do ente (String).
- *page* -> especifica o número da página, comecando por 0.
- *size* -> especifica o tamanho da página;
- *sort* -> especifica o sorteamento dos resultado usando o formato `property,asc` onde property é o valor(por exemplo codigo) e asc signica ordem ascendente (tambem existe descendente (desc))

**Resposta com sucesso**: 
``` json
[
    {...},
    {
        "codigo": 1565,
        "lei": "5.133",
        "nomeDaEntidade": "ASSOCIAÇÃO ATLÉTICA BEIRA RIO"
    },
    {...}
]
```

### Buscar o Ente pelo id:

**URL** : `entes/{id}`

**Method** : `GET`

**Parâmetros de Path** : 
- *{id}* -> id do ente.

**Resposta com sucesso**: 
``` json
{
    "codigo": 1565,
    "lei": "5.133",
    "nomeDaEntidade": "ASSOCIAÇÃO ATLÉTICA BEIRA RIO"
}
```

## Pacotes da aplicação

- **config**: Possui configurações da documentação swagger e da restrições de seguranças
- **controller**: Possui os endpoints para acesso da API.
- **converter**: Operações de conversão entre os três tipos de objetos presentes na aplicação (Ente,EnteDTO e EnteDeclaradoUtilidadePublicaEstadual).
- **DTO**: Contém o objeto que será devolvido pela api (EnteDTO).
- **entity**: Modelo da entidade ;
- **repository**: Interface para implementação definição dos métodos que geram as queries com o Banco de Dados.
- **service**: Utiliza os métodos no Repository e converter para construir a resposta;
- **utils**: Possui a classe responsável por obter os dados de getEnteDeclaradoUtilidadePublicaEstadual;
