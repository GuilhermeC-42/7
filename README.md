# Design Pattern Facade em Java <img src="https://cdn-icons-png.flaticon.com/512/1778/1778568.png" width=25px>

### Objetivo
Aplicativo simples criado como implementação prática do padrão de projeto "Facade". O objetivo por trás do padrão é fornecer uma interface unificada de "alto nível", que serve de *template* para as classes de uma hierarquia maior. <br>
O exemplo realizado foi com base em uma empresa, onde se podem encontrar dois tipos de funcionários:
- TechEmployee
- HrEmployee

Ambos são manipulados por uma interface orquestradora (EmployeeFacade) e possuem suas particulares.

### Contribuindo para o projeto
O projeto pode ser clonado diretamente através do projeto no [Github](https://github.com/GuilhermeC-42/facade-design-java), com o comando `git clone <url>`.
Após realizar as alterações consideradas necessárias no código, pode-se abrir um *pull request* para a análise das alterações propostas e a possível implementação no projeto.

### Melhorias
Como forma de melhorar a qualidade do código, pode-se utilizar o [Lombok](https://projectlombok.org/) para a simplificação de funções integradas.
Outros tipos de funcionários podem ser aplicados a fim de escalar o projeto.

### Tecnologias utilizadas
- Java v.8
- JDK v.1.8

### Referências
- [Exemplos de *Design Patterns* em Java](https://github.com/iluwatar/java-design-patterns.git)