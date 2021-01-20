# Refatoramento - Sistema de produtividade acadêmica

### Disciplina: Projeto de Software
### Professor: Baldoino Fonseca

Projeto para a disciplina Projeto de Software, sobre orientação do professor Baldoino Fonseca, como requisito à obtenção de nota.

O sistema de gestão de produtividade acadêmica objetiva o gerenciamento da produção acadêmica de um laboratório de pesquisa, incluindo informações sobre projetos de pesquisa e colaboradores.

### 1. Strategy
Empregado na classe Menu e na interface MenuStrategy. Criando o polimofismo do metodo Execute() e a Classe Enum TypeMenu (funciona como uma list) no qual cada posição é uma classe que forma um comando diferente.

### 2. Chain Constructors
Disposto em equipe com o Strategy, na Classe Enum TypeMenu para alcançar a exclusão dos IF's na classe Menu.

### 3.Extrac Class
Colocado na classe Pessoas para retirar os atributos e metodos comuns das suas subclasses (professor, aluno).

### 4. Replace Array With Object
Utilizado na Criação do ArrayList


Desenvolvido no IntelliJ IDEA Ultimate

Java 11.0.8
