# Design Pattern
## Factory Method

O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

### Vantagem
- O Factory Method Pattern permite que as subclasses escolham o tipo de objetos a serem criados.

- Ele promove o acoplamento fraco , eliminando a necessidade de vincular classes específicas do aplicativo ao código. Isso significa que o código interage somente com a interface resultante ou classe abstrata, de modo que funcionará com quaisquer classes que implementem essa interface ou que estenda essa classe abstrata.

## Conclusão
Oferecendo um método para criação de objetos, os demais métodos operam em cima das subclasses de Creator, ou seja, os ConcreteCreator, fabricados pelo factoryMethod.

### Bibliografia
- Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra. Head First Design Patterns. O'Reilly Media, 2004.

- Gamma, E., Helm, R., Johnson, R., Vlissides, J. Design Patterns: Elements of Reusable Object-Oriented Software. Addison Wesley, 2010 