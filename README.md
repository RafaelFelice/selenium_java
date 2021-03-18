# DesafioPrivado
Desafio Finalizado 
Aqui apliquei todo meu conhecimento em Java até o momento.
Sei que ainda tem muito a melhorar, mas pelo tempo proposto para o teste , fiz o melhor que eu pude.
O README está dentro de uma pasta no próprio projeto.
Obrigado pela oportunidade.

# DESAFIO STEFANINI

Projeto para web/UI contemplando o desafio proposto pela Stefanini.

## ferramentas utilizadas:
- selenium webdriver
- junit
- linguagem java

## cenários em BDD:
```
#language: pt

Funcionalidade: Acessar o site da Stefanini
  Como um QA
  Gostaria de acessar o site da Stefanini
  Para realizar o desafio proposto para automação web

  Cenário: acessar site com sucesso
      
  Cenário: acessar site sem preencher o campo nome
    Dado que acesso o site da stefanini
    Quando realizo um cadastro sem preencher o campo nome
    Então verifico a mensagem de erro "O campo Nome é obrigatório."

  Cenário: acessar site sem preencher o campo email
    Dado que acesso o site da stefanini
    Quando realizo um cadastro sem preencher o campo email
    Então verifico a mensagem de erro "O campo E-mail é obrigatório."

  Cenário: acessar site sem preencher o campo senha
    Dado que acesso o site da stefanini
    Quando realizo um cadastro sem preencher o campo senha
    Então verifico a mensagem de erro "O campo Senha é obrigatório."

  Cenário: acessar site sem preencher os campos obrigatórios
    Dado que acesso o site da stefanini
    Quando realizo um cadastro sem preencher os campos nome, email e senha
    Então verificao as mensagens de erro para os campos não preenchidos    
    
  Cenário: acessar site sem preencher o campo nome completo
    Dado que acesso o site da stefanini
    Quando realizo um cadastrto sem preencher o campo nome completo
    Então verifico a mensagem de erro "Por favor, insira um nome completo."

  Cenário: acessar site sem preencher o campo email corretamente
    Dado que acesso o site da stefanini
    Quando realizo um cadastro sem preencher o campo email com um email válido
    Então verifico a mensagem de erro "Por favor, insira um e-mail válido."

  Cenário: acessar site sem preencher o campo senha corretamente
    Dado que acesso o site da stefanini
    Quando realizo o cadastro sem preencher a senha 
    E não contendo os 8 caracteres 
    Então verifico a mensagem de erro "A senha deve conter ao menos 8 caracteres."

  Cenário: acessar site com sucesso
    Dado que acesso o site da stefanini
    Quando realizo um cadastro válido
    Então verifico que o cadastro foi realizado com sucesso
  
  Cenário: acessar site com sucesso criando um segundo cadastro
    Dado que acesso o site da stefanini
    Quando realizo um outro cadastro válido
    Então verifico que o cadastro foi realizado com sucesso
  
  Cenário: acessar site com sucesso e realizaar a exclusão 
    Dado que acesso o site da stefanini
    Quando realizo uma exclusão de cadastro
    Então verifico que o cadastro foi excluido com sucesso
 ```

## observações:

De acordo com os meus conhecimentos em BDD, como era essa metodologia, os tipos de escritas com boas praticas e etc...

Confesso que, pelo curto espaço de tempo, evitei tentar focar no ferramental (cucumber) e prejudicar minha entrega como um todo, por isso dediquei meu tempo para estudar, aprender e escrever um exemplo de escrita em BDD sem a utilização do auxiliar cucumber na automação.

Espero que entendam.
Obrigado!
