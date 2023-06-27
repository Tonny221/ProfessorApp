package components;

public class Disciplina {
    String nome;
    Integer cargaHoraria, codigo, codigoProfessor;

    public Disciplina (String nome, Integer cargaHoraria, Integer codigo, Integer codigoProfessor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.codigo = codigo;
        this.codigoProfessor = codigoProfessor;
    }
}
