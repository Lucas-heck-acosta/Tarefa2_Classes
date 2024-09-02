import classes.*;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args)
    {
        boolean rodando = true;
        Scanner scanner = new Scanner(System.in);


        System.out.println("TESTANDO A TAREFA 2 - CLASSES");

        while (rodando)
        {
            System.out.println("Escolha uma classe para testar:");
            System.out.println("1. Cachorro");
            System.out.println("2. Carro");
            System.out.println("3. Celular");
            System.out.println("4. Fogão");
            System.out.println("5. Gato");
            System.out.println("6. Monitor");
            System.out.println("7. Mouse");
            System.out.println("8. Notebook");
            System.out.println("9. Pessoa");
            System.out.println("10. Videogame");
            System.out.println("11. CALCULADORA");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            switch (escolha)
            {
                case 1:
                    Cachorro Bart = new Cachorro("Bart", "Shihtzu", 6);
                    Bart.correr();
                    Bart.latir();
                    break;
                case 2:
                    Carro civic = new Carro("Honda", "Civic", 2020);
                    civic.acelerar();
                    civic.buzinar();
                    break;
                case 3:
                    Celular iPhone = new Celular("2556x1179", "Iphone 15", "IOS");
                    iPhone.fazerLigacao("922314218");
                    iPhone.acenderLanterna();
                    break;
                case 4:
                    Fogao fogao = new Fogao(false, false, 0);
                    fogao.ligarDesligar();
                    fogao.abrirFecharTampa();
                    fogao.aumentarTemperatura();
                    fogao.abrirFecharTampa();
                    break;
                case 5:
                    Gato gato = new Gato("gatuno", "de botas", 3);
                    gato.miar();
                    gato.correr();
                    gato.dormir();
                    break;
                case 6:
                    Monitor monitor = new Monitor(1920, 1080, "pichau 123");
                    monitor.ligarDesligar(false);
                    monitor.exibir("texto de exibicao teste");
                    monitor.fazerSom();
                    break;
                case 7:
                    Mouse mouse = new Mouse("deathadder", 1080, 100);
                    mouse.alterarDpi(1800);
                    mouse.clicarBotaoDireito();
                    mouse.mover();
                    break;
                case 8:
                    Notebook notebook = new Notebook(false, "Asus zephyrus", false);
                    notebook.abrirFechar();
                    notebook.ligarDesligar();
                    notebook.tocarMusica("Evanescence Imaginary");
                    break;
                case 9:
                    Pessoa pessoa = new Pessoa("Lucas", 191, 95);
                    pessoa.correr();
                    pessoa.falar("eu curso banco de dados na fatec");
                    pessoa.dormir();
                    break;
                case 10:
                    Videogame ps5 = new Videogame(false, 1000, 1000);
                    ps5.fazerDownload(105);
                    ps5.jogar("Black Myth Wukong");
                    ps5.desinstalar(105);
                    break;
                case 11:
                    Calculadora calculadora = new Calculadora();
                    calculadora.exibirMenu();
                    break;
                case 0:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }
        scanner.close();

    }
}
