import java.util.Scanner;
public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu peso en kg:");
        double peso = sc.nextDouble();
        System.out.println("Ingresa tu altura en metros:");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Tu Índice de Masa Corporal (IMC) es: %.2f\n", imc);
        sc.close();
    }
}