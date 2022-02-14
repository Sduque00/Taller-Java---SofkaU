package Punto17;

public class Lavadora extends Electrodomestico {

    private int carga = 5;

    public Lavadora() {
        super();
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public double precioFinal(){
        super.precioFinal();

        if (this.carga > 30){
            this.precioBase += 50;
        }
        return precioBase;
    }




}
