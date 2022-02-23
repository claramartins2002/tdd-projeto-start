# Desafio TDD

Objetivo: Aplicar os conceitos de **testes** aprendidos durante a semana de 
estudo.


# Testes Unitários

 Aplicar testes unitários nos métodos dos exercícios 1,2,3 e 7 realizados durante a semana de POO.

## Exercício 1
 Seguindo o diagrama UML a seguir, implemente a classe Veiculo e seus métodos. Após a implementação, testar cada um dos métodos via console.
  - acelerar(): este método acrescenta um valor de 20 no atributo velocidade. 
  - abastecer(int combustivel): recebe como parâmetro uma quantidade de combustível e atribui a listrosCombustivel. OBS: O limite do tanque de combustível é de 60 litros, **validar para não ultrapassar.**
  - frear(): a cada chamada do método diminui a velocidade em 20. **Não aceitar a chamada do método se o veiculo estiver parado**. 
  - pintar(String cor): recebe uma cor como parâmetro e altera o atributo. 
  - ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro. 
  - desligar(): Verifica se o veículo já se encontra desligado, caso não, desliga o carro. **Não permitir que desligue o veículo com (velocidade > 0)**.

## Exercício 2
Seguindo o diagrama UML a seguir, implemente as classes, interfaces e as saídas do programa. Após a implementação, testar cada um dos métodos via console. 

- **calculaImposto( )**: método para calcular imposto sobre um produto com a seguinte regra: 
	 - Livros:  Se o livro for de tema = “educativo” não se deve cobrar imposto. Caso seja de qualquer outro tema, calcular imposto de 10% sobre o preço do livro.
	 -  Video Game: Se o vídeo game for usado, calcular imposto de 25% sobre o preço do videogame.  Se o vídeo game não for usado, calcular imposto de 45% sobre o preço do videogame.
- **listaLivros( )**: lista todos os livros que uma loja tem, caso a lista de livros seja vazia, mostrar no console "A loja não tem livros no seu estoque.".
-   **listaVideoGames ( )**: lista todos os vídeo games que uma loja tem, caso a lista de vídeo games seja vazia, mostrar no console "A loja não tem video-games no seu estoque."
-  **calculaPatrimonio( )**: Soma os preços de todos produtos da loja e retorna este valor como double.

## Exercício 3
Seguindo o diagrama UML, implemente as classes e exiba no console conforme a imagem a seguir: 
-  Usando o conceito de polimorfismo, implemente o método lvlUp(), de forma que o Mago ao subir de nível possua um aumento maior nos atributos Mana e Inteligência e o Guerreiro possua um aumento maior nos atributos Vida e Força. 
-  Implemente o método attack() de forma que siga a seguinte regra: Mago 🧹 : ( Inteligência * Level ) + numeroRandomico( 0 até 300 ). Guerreiro ⚔: ( Força * Level ) + numeroRandomico( 0 até 300 ).
- Exiba a quantidade de Personagens criados, utilize atributo static para implementar a solução.

## Exercício 7
Considerando os conceitos de Orientação a Objetos, crie uma classe Pai de nome Funcionário com os seguintes atributos (nome, idade e salário) e mais três classes Filhas (Gerente, Supervisor e Vendedor). Na classe Funcionário deve existir um método de nome bonificação que retorna o salário, nas classes filhas deve existir o mesmo método bonificação porem com as seguintes regras:
- Para Gerente, o método bonificação deve retornar o salário + 10000.00;
 - Para Supervisor, o método bonificação deve retornar o salário + 5000.00; 
 - Para Vendedor, o método bonificação deve retornar o salário + 3000.00; 
 - Por fim, criar uma classe principal que instancie objetos de Gerente, Supervisor e Vendedor e adicione no mínimo um valor para cada atributo e imprima cada funcionário (Gerente, Supervisor e Vendedor) com suas devidas bonificações.
 
# Desafio bônus 
Problemas lógicos escolhidos no site DojoPuzzles:
## Entre letras
Faça um programa que receba duas letras, e diga quantas letras há entre elas. As letras passadas devem estar em ordem alfabética. Se não estiverem o programa deve avisar o usuário. Exemplo: 'a', 'b' = 0 'a', 'c' = 1 'a', 'z' = 24 'w', 'e' = Não está na ordem alfabética.

## FizzBuzz
Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:

-   Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
-   Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
-   Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.

Parte 2: 
Após resolver o problema do FizzBuzz acrescente a seguintes regra: - Números contendo o algarismo 3 devem aparecer como 'Fizz'. - Números contendo o algarismo 5 devem aparecer como 'Buzz'. - Números contendo ambos os algarismos devem aparecer como 'FizzBuzz', se o 3 vier antes do 5 ou 'BuzzFizz' caso contrário. Obs.: Vale lembrar que as 3 regras do primeiro problema continuam valendo.

________________
# Ferramentas Utilizadas:
- Java
- JUnit
- Dependência Lombok para refatoração de código
- Maven, como gerenciador de dependências

____
