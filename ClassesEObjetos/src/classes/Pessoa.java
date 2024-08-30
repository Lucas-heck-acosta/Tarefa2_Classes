package classes;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;

    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public void falar(String frase)
    {
        System.out.println(nome + ": " + frase);
    }
    public void  dormir()
    {
        System.out.println(nome + ": dormindo zzz");
    }
    public void  correr()
    {
        System.out.println(nome + ": Correndo!");
    }
}
