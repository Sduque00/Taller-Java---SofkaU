import java.util.Scanner;

public class Punto10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese una frase");
        frase = scanner.nextLine();

        System.out.println("Sin espacios: " + frase.replaceAll("\\s", ""));


    }
}
