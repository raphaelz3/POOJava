public class Produto {
    //Atributos
    //São as caracteristicas da classe, o que define a classe
    public String nome;
    public double tamanho;
    public double preco;
    public String cor;
    public int unidade;
    public String marca;

    //método
    //metodos são as ações que a classe possui, o que pode fazer
    public void mostrarinformacoes(){
     System.out.println("Nome: " + nome);
     System.out.println("Preço: " + preco);
     System.out.println("Marca: " + marca);

    }
}
