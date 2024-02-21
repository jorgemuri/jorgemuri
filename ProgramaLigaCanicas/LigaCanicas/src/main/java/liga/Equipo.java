package liga;

public class Equipo {
    private static int numEquipos = -1;
    private int puntuacionActual, idDivision, idEquipo;
    private String nombreEquipo, ciudad;

    //MÉTODOS


    public Equipo(int puntuacionActual, int idDivision, String nombreEquipo, String ciudad) {
        this.puntuacionActual = puntuacionActual;
        this.idDivision = idDivision;
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        numEquipos++;
        idEquipo = numEquipos;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo=" + idEquipo +
                ", puntuacionActual=" + puntuacionActual +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    public int getIdDivision() {
        return idDivision;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }
}
