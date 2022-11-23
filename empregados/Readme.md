## Instruções do exercício

📝 Implementar as classes em Java para realizar cálculos de Folha de Pagamento
(FP) baseados nos tipos de empregados da empresa. Utilizar polimorfismo com
classes abstratas e métodos abstratos. Interface de implementação: utilizar uma
superclasse abstract Empregado. Esta classe possui dentre os seus
métodos um método abstrato chamado calcularGanho. As subclasses de
Empregado são:

▪ **Chefe**: empregado pago com um salário fixo semanal independentemente do
número de horas trabalhadas. O retorno do método ganho desta classe é o
próprio valor atribuído ao atributo salarioMensal;
▪ **TrabalhadorComissionado**: empregado pago com um salário fixo mais
uma porcentagem sobre as vendas. O retorno do método ganho desta classe é o
resultado da operação sobre os valores atribuídos aos atributos desta classe da
seguinte forma: salario + (comissao * quantidade);
▪ **TrabalhadorPecaProduzida**: empregado pago pelo número de itens
produzidos. O retorno do método ganho desta classe é o resultado da operação
sobre os valores atribuídos aos atributos desta classe da seguinte forma:
remuneracão * quantidade;
▪ **TralhadorHora**: empregado que é pago por hora e que recebe um adicional
por hora extra trabalhada. O retorno do método ganho desta classe é o resultado
da operação sobre os valores atribuídos aos atributos desta classe da seguinte
forma: salarioHora * horas.

A chamada de método ganho pode ser aplicada genericamente a todos os tipos de
empregados. Mas a maneira como os rendimentos de cada pessoa é calculada
depende da classe do empregado, e essas classes derivam-se da superclasse
Empregado. Então o método calcularGanho é declarado abstract na
superclasse Empregado e as implementações apropriadas deste método são
preparadas para cada uma das subclasses. 
Portanto, para calcular os rendimentos
de qualquer empregado, o programa pode utilizar uma referência de superclasse
para o objeto desse empregado invocar o método calcularGanho.

**OBSERVAÇÃO**: A classe Empregado deve ter o seguinte construtor:

`public Empregado(String primeiroNome, String ultimoNome);`