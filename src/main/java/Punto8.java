import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dia;

        System.out.println("ingrese un día de la semana");
        dia = scanner.next();

        switch (dia){

            case "lunes":

                System.out.println("El lunes es un dia laboral ");
                break;

            case "martes":

                System.out.println("El martes es un dia laboral ");
                break;

            case "miercoles":

                System.out.println("El miercoles es un dia laboral ");
                break;

            case "jueves":

                System.out.println("El jueves es un dia laboral ");
                break;

            case "viernes":

                System.out.println("El viernes es un dia laboral ");
                break;

            case "sabado":

                System.out.println("El sabado no es un dia laboral ");
                break;

            case "domingo":
                System.out.println("El domingo no es un dia laboral ");
                break;

        }

    }
}
