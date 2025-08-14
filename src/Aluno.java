public class Aluno {
    public String nome;
    public double nota;

    public void verificarStatus(double a){
        if (a < 7)
            System.out.println("Aluno " + nome + " foi reprovado.");
        else
            System.out.println("Aluno " + nome + " foi aprovado.");
    }
}
