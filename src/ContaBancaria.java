public class ContaBancaria {
    public String nome;
    private double saldo;

    public ContaBancaria(){

    }

    public void depositar(double depositarValor){
        saldo += depositarValor;
        System.out.println("Valor atual: R$" + saldo);
    }

    public void sacar(double sacarValor){
       if(sacarValor <= saldo) {
           saldo -= sacarValor;
           System.out.println("Valor sacado: R$" + sacarValor + "\nSaldo Atual: R$" + saldo);
       }
       else
           System.out.println("Sem Saldo");
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: R$ " + saldo);
    }


}
