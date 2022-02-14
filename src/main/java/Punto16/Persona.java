package Punto16;

public class Persona {

   private String nombre = "";
   private int edad = 0;
   private String DNI;
   private char sexo = 'H';
   private double peso = 0;
   private double altura = 0;

    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){

        double IMC = 0;

        IMC = this.peso/(Math.pow(this.altura,2));
        if(this.altura == 0){
            IMC=0;
        }

        if(IMC < 20){
            return -1;
        }else if(IMC >= 20 && IMC <= 25){
            return 0;
        }else {
            return 1;
        }
    }

    public boolean mayorEdad(){
        if (this.edad >= 18){
            return true;
        }else{
            return false;
        }

    }

    private void comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'H') {
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + "]";
    }

    /*Para conseguir la letra de un DNI utilice el algoritmo 23
    * me guié de esta pagina: https://www.serautonomo.net/como-calcular-la-letra-del-dni.html */

    private void generarDNI() {

        int ran = (int) (Math.random() * 100000000);
        String codigo= "TRWAGMYFPDXBNJZSQVHLCKE";
        int div = ran % 23;
        this.DNI = String.valueOf(ran) + codigo.charAt(div);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

