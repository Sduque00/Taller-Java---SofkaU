package Punto17;

public class Television extends Electrodomestico{

    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Television() {
        super();
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal(){
        super.precioFinal();

        if(this.resolucion >40){
            this.precioBase = this.precioBase * 1.3;
        }
        if(isSintonizadorTDT()){
            this.precioBase += 50;
        }
        return precioBase;

    }


}
