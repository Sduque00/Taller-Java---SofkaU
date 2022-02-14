import java.util.Scanner;

public class Punto11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase;
        int contador_a = 0,contador_e = 0,contador_i = 0,contador_o = 0,contador_u = 0;

        System.out.println("Ingrese la frase");
        frase = scanner.nextLine();

        for(int x=0;x<frase.length();x++){

            if(frase.charAt(x) == 'a' || frase.charAt(x) == 'á'){
                contador_a++;
            }
            if(frase.charAt(x) == 'e' || frase.charAt(x) == 'é'){
                contador_e++;
            }
            if(frase.charAt(x) == 'i' || frase.charAt(x) == 'í'){
                contador_i++;
            }
            if(frase.charAt(x) == 'o' || frase.charAt(x) == 'ó'){
                contador_o++;
            }
            if(frase.charAt(x) == 'u' || frase.charAt(x) == 'ú'){
                contador_u++;
            }

        }
        System.out.println("La longitud de la frase es: " + frase.length());
        System.out.println("La frase tiene: " + contador_a + " vocales de a, " + contador_e + " vocales de e, " + contador_i +
                " vocales de i, " + contador_o + " vocales de o y " + contador_u + " vocales de u");

    }
}
