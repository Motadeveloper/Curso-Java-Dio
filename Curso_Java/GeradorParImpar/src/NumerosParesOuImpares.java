import java.util.Scanner;

public class NumerosParesOuImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        int segundoNumero;
        do{
            System.out.print("Digite o segundo número (Maior que o primeiro): ");
            segundoNumero = scanner.nextInt();
            if (segundoNumero <= primeiroNumero){
                System.out.println("O segundo número deve ser maior que o primeiro.");

            }

        } while (segundoNumero <= primeiroNumero);
        System.out.print("Você quer ver os números 'par' ou 'impar'? ");
        String escolha = scanner.next().toLowerCase();

        System.out.println("Números " + escolha + " no inrervalo de " + segundoNumero + " até " + primeiroNumero + ":");
        for (int i = segundoNumero; i >= primeiroNumero; i--){
            if (escolha.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equals("impar") && i % 2 != 0) {
               System.out.println(i); 
            }
        }

        scanner.close();
    }
    
}