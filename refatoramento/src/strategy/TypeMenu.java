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
    },
    CADASTRARPROJETO {
        @Override
        public MenuStrategy obterMenu() {
            return new CriarProjeto();
        }
    },
    ALTERARSTATUS {
        @Override
        public MenuStrategy obterMenu() {
            return new AlterarStatus();
        }
    },
    ADDPUBLICACAO {
        @Override
        public MenuStrategy obterMenu() {
            return new AddPublicacao();
        }
    },
    RELATORIOLAB {
        @Override
        public MenuStrategy obterMenu() {
            return new Relatorio();
        }
    },
    SAIR {
        @Override
        public MenuStrategy obterMenu() {
            return new Exit();
        }
    };
    public abstract MenuStrategy obterMenu();
}
