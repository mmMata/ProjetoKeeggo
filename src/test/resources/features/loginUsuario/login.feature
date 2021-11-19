@login
Feature: Acessar no sistema

@loginValido
Scenario: Login valido
Given que eu esteja na pagina de login
Then coloco minhas credenciais validas
When entro com sucesso

@loginInvalido
Scenario: Login invalido
Given que eu esteja na pagina de login
Then coloco minhas credenciais invalidas
When continuo na pagina de login

