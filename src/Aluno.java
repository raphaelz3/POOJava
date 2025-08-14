public class Aluno {
    public String nome;
    public double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    public void verificarStatus(double a){
        if (a < 7)
            System.out.println("Aluno " + nome + " foi reprovado.");
        else
            System.out.println("Aluno " + nome + " foi aprovado.");
    }
}
