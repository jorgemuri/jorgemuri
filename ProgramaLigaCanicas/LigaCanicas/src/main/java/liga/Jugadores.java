package liga;

public class Jugadores {
    private static int numJugadores = -1;
    private int idEquipo, puntuacion, idJugador;
    private String nombre;

    //MÉTODOS


    public Jugadores(int idEquipo, int puntuacion, String nombre) {
        this.idEquipo = idEquipo;
        this.puntuacion = puntuacion;
        this.nombre = nombre;
        numJugadores++;
        idJugador = numJugadores;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "idJugador=" + idJugador +
                ", puntuacion=" + puntuacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getIdEquipo() {
        return idEquipo;
    }
}
