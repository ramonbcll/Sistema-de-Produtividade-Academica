package strategy;



public enum TypeMenu {
    CADASTRARPESSOA {
        @Override
        public MenuStrategy obterMenu() {
            return new CriarPessoas();
        }
    },
    PESQUISARPESSOA {
        @Override
        public MenuStrategy obterMenu() {
            return new PesquisarPessoas();
        }
    };/*
    CADASTRARPROJETO {
        @Override
        public MenuStrategy obterMenu() {
            return;
        }
    },
    PESQUISARPROJETO {
        @Override
        public MenuStrategy obterMenu() {
            return;
        }
    },
    ADDPUBLICACAO {
        @Override
        public MenuStrategy obterMenu() {
            return;
        }
    },
    RELATORIOLAB {
        @Override
        public MenuStrategy obterMenu() {
            return;
        }
    };*/
    public abstract MenuStrategy obterMenu();
}
