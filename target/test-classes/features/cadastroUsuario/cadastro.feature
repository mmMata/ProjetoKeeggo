@cadastro
Feature: Cadastro


@realizarCadastro
Scenario: Realizar cadastro

When clico no botao entrar na homePage
And digito um email valido
And clico para criar uma conta
And preencho o primeiro nome
And preencho o segundo nome 
And preencho a senha 
And seleciono dia de nascimento
And seleciono mes de nascimento
And selecino ano de nascimento
And preencho o campo empresa
And preencho o campo endereco 
And preencho o campo cidade
And seleciono estado
And preencho o campo CEP
And preencho o campo telefone celular
Then clico no campo registrar
