package Punto18;

public class Videojuego implements Entregable {

    private String titulo;
    private double horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compañia;

    public Videojuego() {
        super();
    }

    public Videojuego(String titulo, double horasEstimadas) {
        super();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
        super();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }



    public String getTitulo() {
        return titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compañia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compañia = compania;
    }

    @Override
    public String toString() {
        return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
                + ", genero=" + genero + ", compania=" + compañia + "]";
    }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public int compareTo(Object v) {
        Videojuego videojuego = (Videojuego) v;
        if (videojuego.horasEstimadas < this.horasEstimadas) {
            return 1;
        } else if (videojuego.horasEstimadas == this.horasEstimadas) {
            return 0;
        } else {
            return -1;
        }
    }
}
