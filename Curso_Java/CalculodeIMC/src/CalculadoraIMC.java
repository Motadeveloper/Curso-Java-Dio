import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura ( em metros ): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite seu peso ( em kg ): ");
        double peso = scanner.nextDouble();
    
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau 2 ( Severa )");
        } else {
            System.out.println("Obesidade Grau 3 ( Mórbida)");
        }

        scanner.close();
    }
    
}