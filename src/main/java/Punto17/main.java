package Punto17;

public class main {
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora(10,20);
        Lavadora lavadora3 = new Lavadora(120,60);
        Lavadora lavadora4 = new Lavadora(200,"gris",'A',32,10);
        Lavadora lavadora5 = new Lavadora(300,"azul",'E',70,42);

        Television television1 = new Television();
        Television television2 = new Television(100,8);
        Television television3 = new Television(150,15);
        Television television4 = new Television(200,"azul",'D',19,20,true);
        Television television5 = new Television(100,"azul",'D',5,41,true);

        electrodomesticos[0]=lavadora1;
        electrodomesticos[1]=lavadora2;
        electrodomesticos[2]=lavadora3;
        electrodomesticos[3]=lavadora4;
        electrodomesticos[4]=lavadora5;
        electrodomesticos[5]=television1;
        electrodomesticos[6]=television2;
        electrodomesticos[7]=television3;
        electrodomesticos[8]=television4;
        electrodomesticos[9]=television5;

        double precioTotalLavadoras=0;
        double precioTotalTelevisores =0;
        double precioTotal=0;

        for(Electrodomestico electrodomestico: electrodomesticos) {
            double precioActual = electrodomestico.precioFinal();
            precioTotal+=precioActual;

            if(electrodomestico instanceof Television) {
                precioTotalTelevisores+=precioActual;
            }else if(electrodomestico instanceof Lavadora) {
                precioTotalLavadoras+=precioActual;
            }
        }

        String form = "%11s %12s";
        System.out.printf(form,"Artículos","valor(euros)");
        System.out.printf(form,"Televisores",precioTotalTelevisores);
        System.out.printf(form,"Lavadoras",precioTotalLavadoras);
        System.out.printf(form,"TOTAL",precioTotal);

    }
}
