public class Punto5 {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 100){

            if (i % 2 == 0){
                System.out.println("El número "+ i + " es par");
            }if(i % 2 != 0){
                System.out.println("El número "+ i + " es impar" );
            }
            i++;
        }
    }
}
