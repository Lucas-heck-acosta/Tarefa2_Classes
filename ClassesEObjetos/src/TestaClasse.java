import classes.Cachorro;
import classes.Carro;
import classes.Celular;
import classes.Fogao;

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
            System.out.println("5. Classe5");
            System.out.println("6. Classe6");
            System.out.println("7. Classe7");
            System.out.println("8. Classe8");
            System.out.println("9. Classe9");
            System.out.println("10. Classe10");
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
