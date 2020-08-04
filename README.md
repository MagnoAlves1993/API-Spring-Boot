# Api com Sring Boot + Docker

## Requisitos
-docker
-clone desse projeto
-Postman (ou qualquer serviço de consulta de API)

## Alteração

Para utilizar o host do seu computador, utilize de acordo com seu sistema operacional

##### Windows
Abra o cmd e use o comando:
```ipconfig```
Verifique seu IP e insira na linha 30 do arquivo ```docker-compose.yml``` na raiz do projeto

##### Linux e MacOS
Abra o cmd e use o comando:
```ifconfig```
Verifique seu IP e insira na linha 30 do arquivo ```docker-compose.yml``` na raiz do projeto

## Iniciar
Para iniciar, na pasta raiz do projeto clonado, utilize o comando: 
```sh
$ docker-compose up --build
```

## Consulta geral

Para realizar uma consulta na api, utilize abra o postman, utilize o tipo de serviço com ```GET``` e acesse o caminho:

``` localhost:8080/cargos ```

## Consulta por id

``` localhost:8080/cargos/{ID} ```

