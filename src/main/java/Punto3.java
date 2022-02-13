import java.util.Scanner;

public class Punto3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area, radio;

        System.out.println("Ingrese el valor del radio para hallar el area del circulo");
        radio = Double.parseDouble(scanner.next());

        area = (Math.PI * Math.pow(radio,2));

        System.out.println("El area del circulo es: " + area);


    }
}
