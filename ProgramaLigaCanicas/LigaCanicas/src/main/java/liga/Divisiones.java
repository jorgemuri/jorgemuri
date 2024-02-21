package liga;

public class Divisiones {
    private static int numDivision = -1;
    private String nombreDivision;
    private int  idDivision;

    //MÉTODOS

    public Divisiones(String nombreDivision) {
        this.nombreDivision = nombreDivision;
        numDivision++;
        idDivision = numDivision;
    }

    public String getNombreDivision() {
        return nombreDivision;
    }
}
