import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Ingrese un numero: ");
        int n2 = scanner.nextInt();

        String resultado = n1 > n2 ? "El mayor es: "+ n1 + " y el menor es:"+ n2 : "El mayor es: "+ n2 + " y el menor es: "+ n1;

        System.out.println(resultado);
    }
}
