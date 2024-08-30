package classes;

public class Cachorro {
    private String nome;
    private String raca;
    private double peso;

    public Cachorro(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public void latir()
    {
        System.out.println("Cachorro " + nome + ": AU AU AU!");
    }
    public void  dormir()
    {
        System.out.println("Cachorro " + nome + ": dormindo zzz");
    }
    public void  correr()
    {
        System.out.println("Cachorro " + nome + ": Correndo!");
    }
}
