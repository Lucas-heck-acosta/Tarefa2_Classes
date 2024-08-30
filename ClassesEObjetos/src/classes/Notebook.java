package classes;

public class Notebook {
    private boolean ligado;
    private String  modelo;
    private boolean aberto;

    public Notebook(boolean ligado, String modelo, boolean aberto) {
        this.ligado = ligado;
        this.modelo = modelo;
        this.aberto = aberto;
    }

    public void ligarDesligar()
    {
        ligado = !ligado;
        System.out.println("Notebook " + (ligado ? "LIGADO!" : "DESLIGADO"));
    }
    public void abrirFechar()
    {
        aberto = !aberto;
        System.out.println("Notebook " + (aberto ? "ABERTO!" : "FECHADO"));
    }
    public void tocarMusica(String musica)
    {
        System.out.println("Tocando a musica: " + musica);
    }
}
