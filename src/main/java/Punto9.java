import java.util.Scanner;

public class Punto9 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase;

        System.out.println(frase.replace("a","e"));

        System.out.println("Ingrese la nueva frase");
        nuevaFrase = scanner.nextLine();

        System.out.println("\n\"" + frase.replace("a","e") + ", " + nuevaFrase + "\"");

    }
}
