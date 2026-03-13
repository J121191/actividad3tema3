import java.util.Scanner;

public class CalculoSalarioNeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu salario bruto mensual:");
        double salarioBruto = sc.nextDouble();

System.out.println("Igresa el porcentaje de impuestos (sin el símbolo %):");
        double porcentajeImpuestos = sc.nextDouble();


        System.out.println("Ingresa las deducciones adicionales (si no tienes, ingresa 0):");
        double deduccionesAdicionales = sc.nextDouble();

        double impuesto = salarioBruto * (porcentajeImpuestos / 100);

        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        System.out.println("Tu salario neto mensual es: "+ impuesto);
        System.out.printf("Tu salario neto mensual es: %.2f\n", salarioNeto);


        sc.close();
    }
}