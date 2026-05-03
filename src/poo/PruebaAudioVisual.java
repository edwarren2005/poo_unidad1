package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Sistema de contenidos audiovisuales\n");

        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington"));
        pelicula.agregarActor(new Actor("Zoe Saldaña"));

        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasia");
        serie.agregarTemporada(new Temporada(1));
        serie.agregarTemporada(new Temporada(2));

        Investigador investigador = new Investigador("Carl Sagan");
        Documental documental = new Documental("Cosmos", 45, "Ciencia", "Astronomia", investigador);

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = pelicula;
        contenidos[1] = serie;
        contenidos[2] = documental;

        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}