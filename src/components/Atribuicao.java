package components;

import java.util.*;

public class Atribuicao {
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Disciplina> disciplinas = new ArrayList<>();
    public Atribuicao () {

    }

    public void listaProfessores (Professor professor) {
        professores.add(professor);
    }

    public void listaDisciplinas (Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}
