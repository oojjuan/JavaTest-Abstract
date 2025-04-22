### JavaTest de fixação sobre Classes Abstratas
O foco deste projeto é para fixar mais o conceito de classes Abstratas e como aplicar em outros projetos.

# Sistema de Monitoramento de Plantas
> Objetivo: criar um sistema que monitore diferentes tipos de **plantas** em um jardim inteligente, onde cada tipo possui necessidades específicas de cuidado (água, luz, nutrientes).

## 1. Classe Abstrata: ``Planta``

- Função: representar qualquer planta genérica, definindo atributos e comportamentos básicos. <br>

- Atributos:
    - ``String nome``
    - ``String tipo``
    - ``int diasDesdeUltimoCuidado``

- Métodos:
    - Construtor
    - Método **abstrato** ``realizarCuidado()``: Cada planta define como é cuidada
    - Método **abstrato** ``precisaDeCuidado``: Define a lógica que determine se a planta necessita de cuidado
    - Método ``exibirStatus()``: Exibe informações da planta e se ela precisa ou não de cuidado


## 2. Classe Concreta: ``Flor``

- Função: representar plantas do tipo flor, que necessitam de cuidado frequente. <br>

- Regras:
    - Precisa de cuidado a cada 2 dias
    - Cuidado: regar e deixar ao sol

- Métodos:
    - implementação de ``realizarCuidado()``: Zera os dias desde o último cuidado e exibe o que foi feito
    - Implementação de ``precisaDeCuidado()``: Exibe se a planta precisa de cuidado ou não

## 3. Classe Concreta: ``Suculenta``

- Função: representar plantas do tipo suculenta, que necessitam de menos cuidado que uma flor. <br>

- Regras:
    - Precisa de cuidado a cada 7 dias
    - Cuidado: borrifar água e manter na sombra

- Métodos:
    - implementação de ``realizarCuidado()``
    - Implementação de ``precisaDeCuidado()``

## 4. Classe Concreta: ``Arvore``

- Função: representar uma árvore do jardim. <br>

- Regras:
    - Precisa de cuidado a cada 5 dias
    - Cuidado: adubar e cuidar de pragas caso haja

- Métodos:
    - implementação de ``realizarCuidado()``
    - Implementação de ``precisaDeCuidado()``