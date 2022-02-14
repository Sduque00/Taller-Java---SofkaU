import java.util.Scanner;

public class Punto14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Ingresa un número");
        numero = scanner.nextInt();

        do {

            System.out.println(numero);
            numero += 2;

        }while (numero <= 1000);

    }
}
