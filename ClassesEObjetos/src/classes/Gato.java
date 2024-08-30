package classes;

public class Gato {
    private String nome;
    private String raca;
    private double peso;

    public Gato(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public void miar()
    {
        System.out.println("Gato " + nome + ": MIAU!");
    }
    public void  dormir()
    {
        System.out.println("Gato " + nome + ": dormindo zzz");
    }
    public void  correr()
    {
        System.out.println("Gato " + nome + ": Correndo!");
    }
}
