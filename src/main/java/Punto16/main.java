package Punto16;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona 1");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona 1");
        int edad1 = scanner.nextInt();
        System.out.println("Ingrese el sexo de la persona 1");
        char sexo1 = scanner.next().charAt(0);
        System.out.println("Ingrese el peso de la persona 1");
        double peso1 = scanner.nextDouble();
        System.out.println("Ingrese la altura de la persona 1");
        double altura1 = scanner.nextDouble();

        Persona persona1 = new Persona(nombre1,edad1,sexo1,peso1,altura1);

        System.out.println("Ingrese el nombre de la persona 2");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona 2");
        int edad2 = scanner.nextInt();
        System.out.println("Ingrese el sexo de la persona 2");
        char sexo2= scanner.next().charAt(0);

        Persona persona2 = new Persona(nombre2,edad2,sexo2);

        Persona persona3 = new Persona();

        persona3.setNombre("carlos");
        persona3.setEdad(20);
        persona3.setSexo('H');
        persona3.setPeso(60);
        persona3.setAltura(1.80);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        for (Persona persona : personas) {
            if (persona.calcularIMC() <0) {
                System.out.println(persona.getNombre() + " está por debajo de su peso ideal");
            } else if (persona.calcularIMC() == 0) {
                System.out.println(persona.getNombre() + " está en su peso ideal");
            } else{
                System.out.println(persona.getNombre() + " está por encima de su peso ideal");
            }

            if (persona.mayorEdad()) {
                System.out.println(persona.getNombre()+" es mayor de edad");
            }else {
                System.out.println(persona.getNombre()+" es menor de edad");
            }

            System.out.println(persona.toString());
        }


    }
}
