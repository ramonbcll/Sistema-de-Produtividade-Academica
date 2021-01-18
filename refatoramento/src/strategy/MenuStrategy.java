package strategy;

import entidades.Pessoas;
import entidades.Projetos;

import java.util.ArrayList;

public interface MenuStrategy {
    public void execute(ArrayList<Pessoas>pessoas, ArrayList<Projetos>projetos);
}
