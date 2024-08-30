package classes;

public class Monitor {
    private int largura;
    private int altura;
    private String modelo;


    public Monitor(int largura, int altura, String modelo) {
        this.largura = largura;
        this.altura = altura;
        this.modelo = modelo;
    }

    public void exibir(String vista)
    {
        System.out.println("Monitor " + modelo + ": " + vista);
    }
    public void ligarDesligar(boolean jaLigado)
    {
        System.out.println("Monitor " + (jaLigado ? "desligado" : "ligado"));
    }
    public void fazerSom()
    {
        System.out.println("Transmitindo sons!");
    }
}
