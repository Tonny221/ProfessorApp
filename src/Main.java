import components.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Atribuicao atr = new Atribuicao();
        Professor prof = new Professor("Tonny", 1, 30, 2);
        atr.listaProfessores(prof);
    }
}