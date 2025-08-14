public class Carro {
    //atributos
    public String descricao;
    public String marca;
    public String modelo;
    public int ano;

    //metodo construtor
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    //metodos
    public void mostrarInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Descrição " + descricao);
        System.out.println("Ano: " + ano);
    }
}
