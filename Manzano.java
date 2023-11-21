package QA;
import java.util.Scanner;

public class Manzano {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            
            System.out.print("Digite um valor para X: ");
            int x = scanner.nextInt();

           
            int r = x * 3;

           
            System.out.println("O resultado da multiplicação por 3 é: " + r);

            
            System.out.print("Deseja continuar? sim/não: ");
            resposta = scanner.next().toLowerCase();

        } while (resposta.equals("sim"));

       
        System.out.println("Programa encerrado.");
        scanner.close();
    }

}
