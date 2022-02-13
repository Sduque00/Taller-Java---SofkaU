import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;

        do {
            System.out.println("ingresa un número");
            numero = scanner.nextDouble();

            if(numero < 0 ){
                System.out.println("El número ingresado es incorrecto");
            }

        }while (numero < 0 );

        System.out.println("El numero ingresado fue: " + numero);
    }
}
