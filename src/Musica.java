public class Musica {
    public String titulo;
    public String artista;
    public double duracaoEmSegundos;

    public Musica(String titulo, String artista, double duracaoEmSegundos){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public void exibirFichaTecnica(){
        System.out.println("titulo: " + titulo + "\nArtista: " + artista +"\nduracao: " + duracaoEmSegundos/60);
    }
}

