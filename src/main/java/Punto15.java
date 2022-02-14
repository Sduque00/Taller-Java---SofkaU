import java.util.Scanner;

public class Punto15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int select = 0;
        String menu = "****** GESTION CINEMATOGRÁFICA ******** \n"
                + "1-NUEVO ACTOR \n"
                + "2-BUSCAR ACTOR \n"
                + "3-ELIMINAR ACTOR \n"
                + "4-MODIFICAR ACTOR \n"
                + "5-VER TODOS LOS ACTORES \n"
                + "6- VER PELICULAS DE LOS ACTORES \n"
                + "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n"
                + "8-SALIR";

        do {
            System.out.println(menu);
            System.out.println("Selecciona una opcion");
            select = scanner.nextInt();

            while (select < 1 || select>8){
                System.out.println("Opcion incorrecta, por favor ingrese una opcion valida");
                System.out.println(menu);
                select = scanner.nextInt();

            }

            switch (select){

                case 1:
                    System.out.println("Seleccionó la opcion " + select);
                    break;
                case 2:
                    System.out.println("Seleccionó la opcion " + select);
                    break;
                case 3:
                    System.out.println("Seleccionó la opcion " + select);
                    break;
                case 4:
                    System.out.println("Seleccionó la opcion " + select);
                    break;
                case 5:
                    System.out.println("Seleccionó la opcion " + select);
                    break;
                case 6:
                    System.out.println("Seleccionó la opcion " + select);
                    break;
                case 7:
                    System.out.println("Seleccionó la opcion " + select);
                    break;
                case 8:
                    System.out.println("Seleccionó la opcion salir ");
                    break;

            }

        }while (select != 8);
    }
}
