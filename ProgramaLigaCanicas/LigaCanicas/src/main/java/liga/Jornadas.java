package liga;

public class Jornadas {
    private static int numJornadas = -1;
    private int temporada, idJornada;
    private String fecha;

    //MÉTODOS


    public Jornadas(int temporada, String fecha) {
        this.temporada = temporada;
        this.fecha = fecha;
        numJornadas++;
        idJornada = numJornadas;
    }

    @Override
    public String toString() {
        return "Jornadas{" +
                "idJornada=" + idJornada +
                ", temporada=" + temporada +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
