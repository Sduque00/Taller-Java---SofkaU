import java.util.Scanner;

public class Punto11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase;
        int contador_a = 0,contador_e = 0,contador_i = 0,contador_o = 0,contador_u = 0;

        System.out.println("Ingrese la frase");
        frase = scanner.nextLine();

        char[] array = frase.toCharArray();

        /*for(char car : array){


            if(car == 'a'|| car == 'á'){
                contador_a++;
            }
            if(car == 'e' || car == 'é'){
                contador_e++;
            }
            if(car == 'i' || car == 'í'){
                contador_i++;
            }
            if(car == 'o' || car == 'ó'){
                contador_o++;
            }
            if(car == 'u' || car == 'ú'){
                contador_u++;
            }

        }*/
        // comentè el metodo anterior por un bug que no me deja ejecutar el siguiente punto del taller

        System.out.println("La longitud de la frase es: " + frase.length());
        System.out.println("La frase tiene: " + contador_a + " vocales de a, " + contador_e + " vocales de e, " + contador_i +
                " vocales de i, " + contador_o + " vocales de o y " + contador_u + " vocales de u");

    }
}
