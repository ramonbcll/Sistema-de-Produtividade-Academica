package strategy;

import entidades.Pessoas;
import entidades.Projetos;

import java.util.ArrayList;

public class Exit implements MenuStrategy {
    @Override
    public void execute(ArrayList<Pessoas> pessoas, ArrayList<Projetos> projetos) {
        System.exit(0);
    }
}
