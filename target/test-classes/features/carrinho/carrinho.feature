@carrinho
Feature: Carrinho

@adicionarERemoverItensDoCarrinho
Scenario: Adicionar e remover item do carrinho
Given que eu esteja na pagina login
And coloco minhas credenciais
And entro no sistema com sucesso
And procuro por um tipo de vestimenta
And clico em pesquisar
And seleciono uma roupa
And adiciono uma peca no carrinho
And faco o check out
And removo uma peca do carrinho
Then vou para pagina com carrinho vazio