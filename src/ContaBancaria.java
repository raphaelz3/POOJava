public class ContaBancaria {
    public String nome;
    public double saldo;

    public void depositar(double depositarValor){
        saldo += depositarValor;
        System.out.println("Valor atual: R$" + saldo);
    }

    public void sacar(double sacarValor){
        saldo -= sacarValor;
        System.out.println("Valor sacado: R$" + sacarValor + "\nSaldo Atual: R$" + saldo);

    }
}
