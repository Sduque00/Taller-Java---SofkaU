import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Punto13 {


    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("(yyyy/MM/DD HH:mm:ss)");

        System.out.println("La fecha y la hora actual son: "+dtf.format(LocalDateTime.now()));

    }
}
