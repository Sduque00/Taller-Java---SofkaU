package Punto17;

public class Electrodomestico {

    protected double precioBase = 100;
    protected String color = "blanco";
    protected char consumoEnergetico = 'F';
    protected int peso = 5;


    public Electrodomestico() {

    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }


    private void comprobarConsumoEnergetico(char letra){

        switch (letra){
            case 'A':
                this.consumoEnergetico = 'A';
                break;
            case 'B':
                this.consumoEnergetico = 'B';
                break;
            case 'C':
                this.consumoEnergetico = 'C';
                break;
            case 'D':
                this.consumoEnergetico = 'D';
                break;
            case 'E':
                this.consumoEnergetico = 'E';
                break;
            default:
                this.consumoEnergetico = 'F';
                break;

        }
    }

    private void comprobarColor(String color){

        switch (color){

            case "negro":
                this.color = "negro";
                break;
            case "rojo":
                this.color = "rojo";
                break;
            case "gris":
                this.color = "gris";
                break;
            case "azul":
                this.color = "azul";
                break;
            default:
                this.color = "blanco";
                break;
        }

    }

    public double precioFinal(){

        switch (this.consumoEnergetico){

            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case 'C':
                this.precioBase += 60;
                break;
            case 'D':
                this.precioBase += 50;
                break;
            case 'E':
                this.precioBase += 30;
                break;
            case 'F':
                this.precioBase += 10;
                break;
        }
        if (this.peso <= 19) {
            this.precioBase += 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precioBase += 50;
        } else if (this.precioBase >= 50 && this.precioBase <= 79) {
            this.precioBase += 80;
        } else {
            this.precioBase += 100;
        }

        return this.precioBase;
    }



}
