
# Exercícios de herança e polimorfismo

Aqui estaram alguns exercícios de POO focados nos pilares de herança e polimorfismo.

## Objetivo:
- No processo de estudo dos pilares da POO esses exercícios tem o intuito de massificar, praticar e aplicar os conceitos aplicando em exemplos reais.

### Exercicio 01 - Ingressos de cinema
- Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família. Cada ingresso deve ter um método que retorna o seu valor real ( baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor deve ser de metade do valor, para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.

**Solução:**
- O código inicia com uma recepção seguido de um pedido de entrada de nome do usuário.
- Em seguida apresenta as opções de tipos de ingresso e pede para que o usuário insira o número correspondente a opção desejada que possui tratamento de erro caso o usuário escolha uma opção inválida.
- Então solicita o número de ingressos desejado.
- Por seguinte finaliza apresentando o valor total dos ingresso sbaseado no tipo e na quantidade de ingressos escolhidos.
