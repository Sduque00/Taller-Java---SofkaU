package Punto18;

public class main {
    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        Serie serie1 = new Serie("Breaking bad", "Vince Gilligan");
        Serie serie2 = new Serie("Daredevil", 3, "Ficción de superhéroes", "Drew Goddard");
        Serie serie3 = new Serie("Better call saul", 5, "Comedia negra", "Vince Gilligan");
        Serie serie4 = new Serie("The boys", 2, "Superhéroe", " Eric Kripke,");
        Serie serie5 = new Serie("The witcher", 2, "Fantasía oscura", "Andrzej Sapkowski");

        Videojuego videojuego1 = new Videojuego("Fortnite", 80);
        Videojuego videojuego2 = new Videojuego("CoD: Warzone", 130);
        Videojuego videojuego3 = new Videojuego("Valorant", 100, "Shooter","Riot Games");
        Videojuego videojuego4 = new Videojuego("FIFA22", 90,"Deportes", "Electronic Arts");
        Videojuego videojuego5 = new Videojuego("Assasins Creed", 180,"accion y aventura","Ubisoft");

        series[0] = serie1;
        series[1] = serie2;
        series[2] = serie3;
        series[3] = serie4;
        series[4] = serie5;

        videojuegos[0] = videojuego1;
        videojuegos[1] = videojuego2;
        videojuegos[2] = videojuego3;
        videojuegos[3] = videojuego4;
        videojuegos[4] = videojuego5;

        serie1.entregar();
        serie3.entregar();
        serie5.entregar();

        videojuego2.entregar();
        videojuego3.entregar();
        videojuego5.entregar();

        int seriesEntregadas = 0;
        int VideoJuegosEntregados = 0;

        Serie serieConMasTemporadas = series[0];
        Videojuego VideoJuegoMasLargo=videojuegos[0];

        for (Serie s : series) {
            if (s.isEntregado()) {
                seriesEntregadas++;
                s.devolver();
            }

            if (s.compareTo(serieConMasTemporadas) > 0) {
                serieConMasTemporadas = s;
            }
        }

        for(Videojuego v: videojuegos) {
            if(v.isEntregado()) {
                VideoJuegosEntregados++;
                v.devolver();
            }

            if (v.compareTo(VideoJuegoMasLargo)>0) {
                VideoJuegoMasLargo=v;
            }
        }

        System.out.println("Series entregadas = "+seriesEntregadas);
        System.out.println("La serie con más temporadas es: " + serieConMasTemporadas.toString());
        System.out.println("Videojuego entregrados = "+VideoJuegosEntregados);
        System.out.println("El videojuego con más horas estimadas es: " + VideoJuegoMasLargo.toString());
    }


}

