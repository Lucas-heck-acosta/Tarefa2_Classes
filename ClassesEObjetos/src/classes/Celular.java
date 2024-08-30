package classes;

public class Celular {
    private String resolucao;
    private String modelo;
    private String sistemaOperacional;

    public Celular(String resolucao, String modelo, String sistemaOperacional) {
        this.resolucao = resolucao;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void tirarFoto()
    {
        System.out.println("Tirando foto com celular: " + modelo);
    }
    public void fazerLigacao(String numero)
    {
        System.out.println("Fazendo ligação para o número: " + numero);
    }
    public void acenderLanterna()
    {
        System.out.println("Ligando a lanterna do celular: " + modelo);
    }
}
