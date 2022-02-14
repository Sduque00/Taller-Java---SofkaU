import java.text.Collator;
import java.util.Scanner;

public class Punto12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collator comparador = Collator.getInstance();

        String palabra1,palabra2;

        System.out.println("Ingresa la primera palabra");
        palabra1 = scanner.next();
        System.out.println("Ingresa la segunda palabra");
        palabra2 = scanner.next();

        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("Las palabras son iguales");
        }if(palabra1.length() > palabra2.length()){
            System.out.println("La palabra: " + palabra1 + " es mas larga que la palabra: " + palabra2);
        }if(palabra1.length() < palabra2.length()){
            System.out.println("La palabra: " + palabra1 + " es mas corta que la palabra: " + palabra2);
        }

        comparador.setStrength(Collator.SECONDARY);
        // Ahora son distitnas por el acento
        System.out.println(comparador.compare(palabra1,palabra2));
    }
}
