public class Produto {
    //Atributos
    //São as caracteristicas da classe, o que define a classe
    public String nome;
    public double tamanho;
    private double preco;
    public String cor;
    private int estoque;
    public String marca;

    //método
    //metodos são as ações que a classe possui, o que pode fazer
    public void mostrarinformacoes(){
     System.out.println("Nome: " + nome);
     System.out.println("Preço: " + preco);
     System.out.println("Marca: " + marca);
    }

    public void getPreco(){
        System.out.println("Preço do produto: " + preco);
    }
    public void getEstoque(){
        System.out.println("Estoque do produtoÇ " + estoque);
    }

    public void setPreco(double novoPreco){
        if(novoPreco > 0)
            this.preco = preco;
    }


}
