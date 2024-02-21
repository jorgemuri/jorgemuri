package liga;

public class Partidos {
    //ATRIBUTOS
    private static int numPartidos = -1;
    private int idPartido,idEquipoLocal, idEquipoVisitante, puntosLocal, puntosVisitante, idJornada;

    //MÉTODOS


    public Partidos(int idEquipoLocal, int idEquipoVisitante, int puntosLocal, int puntosVisitante, int idJornada) {
        this.idEquipoLocal = idEquipoLocal;
        this.idEquipoVisitante = idEquipoVisitante;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
        this.idJornada = idJornada;
        numPartidos++;
        idPartido = numPartidos; // le asigno valor a la idPartido.
    }
}
