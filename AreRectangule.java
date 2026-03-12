import java.util.Scanner;

public class AreRectangule {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);

        double base, altura, area;

        System.out.println("Digite la base del rectangunlo");
        base = entrada.nextDouble();

        System.out.println("Digite la altuta del rectangulo");
         altura = entrada.nextDouble();

         area = base * altura;

         System.out.println("El area del rectangulo es");
         System.out.println(area);



    }
}
