package classes;

public class Mouse {
    private String modelo;
    private int dpi;
    private int bateria;

    public Mouse(String modelo, int dpi, int bateria) {
        this.modelo = modelo;
        this.dpi = dpi;
        this.bateria = bateria;
    }

    public void clicarBotaoDireito()
    {
        System.out.println("Botao direito CLICADO!");
    }
    public void mover()
    {
        System.out.println("Mouse movido");
    }
    public void alterarDpi(int novoDpi)
    {
        System.out.println("DPI antigo: " + dpi);
        this.dpi = novoDpi;
        System.out.println("DPI atual: " + dpi);

    }
}
