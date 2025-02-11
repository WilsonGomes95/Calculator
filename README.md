# Shape Area Calculator

Este projeto implementa um sistema simples para calcular as áreas de diferentes formas geométricas, como retângulos e círculos, utilizando conceitos de programação orientada a objetos, como herança e polimorfismo.

## Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- Programação Orientada a Objetos (OOP)

## Funcionalidade

O programa permite ao usuário inserir informações sobre formas geométricas (retângulos e círculos), incluindo suas cores e dimensões. O cálculo da área é feito de forma polimórfica, de acordo com a forma escolhida.

### Como Funciona

1. O programa solicita ao usuário o número de formas geométricas a serem inseridas.
2. O usuário escolhe entre um **Retângulo** ou um **Círculo**.
3. Para o retângulo, o programa solicita a largura e a altura.
4. Para o círculo, o programa solicita o raio.
5. O programa calcula a área de cada forma e exibe o resultado.

### Diagrama de Classes

- **Shape (classe abstrata)**: 
  - Contém um atributo `Color` e um método abstrato `area()`.
  - Métodos: `getColor()`, `setColor(String color)` e `area()`.
  
- **Rectangle (subclasse de Shape)**:
  - Contém os atributos `width` e `height`.
  - Sobrescreve o método `area()` para calcular a área do retângulo.

- **Circle (subclasse de Shape)**:
  - Contém o atributo `radius`.
  - Sobrescreve o método `area()` para calcular a área do círculo.

### Exemplo de Execução

```plaintext
Enter the number of shapes: 2
Shape #0 data: 
Rectangle or Circle (r/c)? r
Color (BLACK/BLUE/RED): BLUE
Width: 5.0
Height: 10.0
Shape #1 data: 
Rectangle or Circle (r/c)? c
Color (BLACK/BLUE/RED): RED
Radius: 3.0

SHAPE AREAS: 
50.00
28.27
