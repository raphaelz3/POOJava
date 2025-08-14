
public class Main {
    public static void main(String[] args){
//      Carro meuCarro = new Carro();
//      Carro meuCarro2 = new Carro();
//      Produto prod1 = new Produto();
//
//       prod1.nome = "Monitor";
//       prod1.preco = 650.00;
//       prod1.marca = "Dell";
//      prod1.mostrarinformacoes();
//
//       meuCarro.modelo = "Uno";
//       meuCarro.marca = "Fiat";
//       meuCarro.descricao = "com escada no teto";
//       meuCarro.mostrarInformacoes();
//
//       meuCarro2.marca = "Ford";
//      meuCarro2.modelo = "Mustang";
//      meuCarro2.descricao = "Entrada de ar externa";
//      meuCarro2.mostrarInformacoes();

    //Exercicios
    //Musica
        Musica minhaMusica = new Musica("Bohemian Rhapsody","Queen", 355 );

        minhaMusica.exibirFichaTecnica();

    //CARRO
        Carro meuCarro2 = new Carro("Ford","Mustang", 1982);
       // meuCarro2.descricao = "Entrada de ar externa";
        meuCarro2.mostrarInformacoes();

        //Media maior que 7
        Aluno aluno1 = new Aluno("Fulano da Silva", 7.5);

        aluno1.verificarStatus(aluno1.nota);

        Aluno aluno2 = new Aluno("Cicrano Santos", 4.3);

        aluno2.verificarStatus(aluno2.nota);
//
//        //Conta Bancaria
//        ContaBancaria conta = new ContaBancaria();
//
//        conta.nome = "Fulado da Silva";
//       // conta.saldo = 100;
//
//        System.out.println(conta.nome);
//       // System.out.println(conta.saldo);
//
//        conta.depositar(100);
//        conta.sacar(50);
//        conta.exibirSaldo();
//
    }
}
