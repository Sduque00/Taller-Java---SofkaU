import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PrecioProducto;

        System.out.println("Ingresa el precio del producto");
        PrecioProducto = scanner.nextDouble();

        System.out.println("El precio final con IVA incluido es: " + (PrecioProducto * 1.21));
    }
}
