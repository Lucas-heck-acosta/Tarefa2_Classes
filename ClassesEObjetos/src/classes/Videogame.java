package classes;

public class Videogame {
    private boolean jogando;
    private int memoriaTotal;
    private int memoriaAtual;

    public Videogame(boolean jogando, int memoriaTotal, int memoriaAtual) {
        this.jogando = jogando;
        this.memoriaTotal = memoriaTotal;
        this.memoriaAtual = memoriaAtual;
    }

    public void fazerDownload(int tamanhoDoDownload)
    {
        if (memoriaTotal - memoriaAtual > tamanhoDoDownload)
        {
            memoriaAtual -= tamanhoDoDownload;
            System.out.println("Download realizado");
        }
        else
        {
            System.out.println("espaco insuficiente");
        }
    }
    public void desinstalar(int tamanhoDoJogo)
    {
        if (memoriaAtual + tamanhoDoJogo < memoriaTotal)
        {
            memoriaAtual += tamanhoDoJogo;
        }
        else
        {
            memoriaAtual = memoriaTotal;
        }
    }
}
