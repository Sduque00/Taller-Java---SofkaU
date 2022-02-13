import java.util.Scanner;

public class Punto1y2 {


    public static void main(String[] args) {
        double Numero1, Numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        Numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número");
        Numero2 = scanner.nextDouble();

        if(Numero1 > Numero2){
            System.out.println("El primer número: " + Numero1 + ", es mayor que el segundo número: " + Numero2);
        }if(Numero1 < Numero2) {
            System.out.println("El segundo número:" + Numero2 + ", es mayor que el primer número: " + Numero1);
        }if(Numero1 == Numero2){
            System.out.println("El primer número: " + Numero1 + ", es igual que el segundo número: " + Numero2);
        }
    }
}
