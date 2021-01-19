package util;

import entidades.Pessoas;

import java.util.ArrayList;

public class Verificador {

    public boolean projetosPessoa(String nome, ArrayList<Pessoas> pessoas) {
        int x = 0;
        for (Pessoas p : pessoas) {
            if (nome.equalsIgnoreCase(p.getNome())) {
                if(p.getProjeto1() == null || p.getProjeto2() == null) {
                    x += 1;
                }
            }
        }
        if(x > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verificarDados(String nome, ArrayList<Pessoas> pessoas) {
        int j = 0;
        for (Pessoas p : pessoas) {
            if (nome.equalsIgnoreCase(p.getNome())) {
                j += 1;
            }
        }
        if (j > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
