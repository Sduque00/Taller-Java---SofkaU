package Punto18;

public class Serie implements Entregable {

    private String titulo;
    private int numeroDeTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {
        super();
    }

    public Serie(String titulo, String creador) {
        super();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        super();
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }



    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie [titulo=" + titulo + ", numeroDeTemporadas=" + numeroDeTemporadas + ", entregado=" + entregado
                + ", genero=" + genero + ", creador=" + creador + "]";
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

    public int compareTo(Object a) {

        Serie serie = (Serie) a;

        if (serie.numeroDeTemporadas < this.numeroDeTemporadas) {
            return 1;
        } else if (serie.numeroDeTemporadas == this.numeroDeTemporadas) {
            return 0;
        } else {
            return -1;
        }

    }

}
