package liga;

import liga.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaro algunos objetos

        Partidos[] partidos = new Partidos[8];
        Jornadas[] jornadas = new Jornadas[10];
        Divisiones[] divisiones = new  Divisiones[3];
        Equipo[] equipos = new Equipo[10];
        Jugadores[] jugadores = new Jugadores[30];

        int numPartidos = 3, numJornadas = 5, numEquipos = 5, numJugadores = 10;
        final int numDivisiones = 3;

        //añado algunos objetos:
        divisiones[0] = new Divisiones("Primera división");
        divisiones[1] = new Divisiones("Segunda división");
        divisiones[2] = new Divisiones("Tercera división.");

        equipos[0] = new Equipo(2,0,"AbuelosPacenses","Badajoz");
        equipos[1] = new Equipo(1,0,"Porrinos","Merida");
        equipos[2] = new Equipo(0,2,"FriendZone","Caceres");
        equipos[3] = new Equipo(3,1,"EquipoA","Don Benito");
        equipos[4] = new Equipo(0,1,"Arrasadores","Badajoz");

        jugadores[0] = new Jugadores(0,4,"Pedro");
        jugadores[1] = new Jugadores(0,3,"Cubano");
        jugadores[2] = new Jugadores(1,2,"Adrian");
        jugadores[3] = new Jugadores(1,1,"Blas");
        jugadores[4] = new Jugadores(2,0,"Jorge");
        jugadores[5] = new Jugadores(2,2,"Alberto");
        jugadores[6] = new Jugadores(3,3,"Juan");
        jugadores[7] = new Jugadores(3,0,"Roberto");
        jugadores[8] = new Jugadores(4,1,"Soledad");
        jugadores[9] = new Jugadores(4,3,"Maria");

        jornadas[0] = new Jornadas(1,"01/01/2024");
        jornadas[1] = new Jornadas(2,"01/06/2024");
        jornadas[2] = new Jornadas(3,"01/09/2024");
        jornadas[3] = new Jornadas(2,"10/06/2024");
        jornadas[4] = new Jornadas(1,"10/01/2024");

        partidos[0] = new Partidos(0,1,5,3,0);
        partidos[1] = new Partidos(1,0,3,0,4);
        partidos[2] = new Partidos(3,4,2,6,1);

        //inicio del programa

        System.out.println("BIENVENIDO A LA LIGA DE CANICAS");
        System.out.println("---------------------------------");
        boolean salir = false;
        while (!salir){
            switch (mostrarMenu()){ // muestro menu y a la vez consigo la respuesta
                case 1 ->{
                    mostrarEquipos(numEquipos,equipos,divisiones);
                }
                case 2 ->{
                    mostrarJornadas(numJornadas,jornadas);
                }
                case 3 ->{
                    mostrarJugadores(numJugadores,jugadores,equipos);
                }
                case 4 ->{
                    System.out.println("¿Qué quieres añadir?: ");
                    System.out.println("""
                            1. Partidos.
                            2. Jornadas.
                            3. Equipo.
                            4. Jugadores.
                            """);
                    int respuesta = sc.nextInt();
                    switch (respuesta){
                        case 1 ->{ // añado partidos
                            System.out.println("El maximo de partidos que puedes crear es 8, actualmente hay "+ numPartidos);
                            numPartidos++;
                            mostrarEquipos(numEquipos,equipos,divisiones);
                            System.out.println("||||||||");
                            System.out.print("Dime la id del equipo que quieres que sea visitante: ");
                            int visitante = sc.nextInt();
                            System.out.print("Ahora dime la id del equipo que quieres que sea local: ");
                            int local = sc.nextInt();
                            System.out.println("Ahora los puntos del equipo local: ");
                            int puntosLocal = sc.nextInt();
                            System.out.println("Y por último los del equipo visitante: ");
                            int puntosVisitante = sc.nextInt();
                            System.out.println("----");
                            mostrarJornadas(numJornadas,jornadas);
                            System.out.println("----");
                            System.out.println("Ahora dime la id de la jornada: ");
                            int jornada = sc.nextInt();

                            partidos[numPartidos - 1] = new Partidos(local,visitante,puntosLocal,puntosVisitante,jornada); // añado el partido
                            System.out.println("Partido añadido correctamente");
                        }
                        case 2 ->{ // añado jornadas
                            System.out.println("El maximo de jornadas que puedes crear es 10, actualmente hay "+ numJornadas);
                            System.out.print("Dime la temporada: ");
                            int temporada = sc.nextInt();
                            System.out.print("Dime la fecha (DD/MM/AAAA): ");
                            String fecha = sc.next();
                            numJornadas++;

                            jornadas[numJornadas - 1] = new Jornadas(temporada,fecha); // añado la jornada
                            System.out.println("Se ha añadido la jornada exitosamente");
                        }
                        case 3 ->{ // añado Equipos
                            System.out.println("El máximo de equipos que puedes crear es 10, actualmente hay " + numEquipos);
                            System.out.print("Dime la puntuación actual del equipo: ");
                            int puntuacionActual = sc.nextInt();
                            System.out.print("Numero de la división en la que está (1,2 o 3): ");
                            int division = sc.nextInt() - 1;
                            System.out.print("Nombre equipo (1 palabra): ");
                            String nombreEquipos = sc.next();
                            System.out.print("Ciudad (1 palabra): ");
                            String ciudad = sc.next();
                            numEquipos++;

                            equipos[numEquipos - 1] = new Equipo(puntuacionActual,division,nombreEquipos,ciudad);
                            System.out.println("Se ha creado correctamente el equipo");
                        }
                        case 4 ->{ // añado Jugadores
                            System.out.println("Puedes añadir hasta 30 jugadores, actualmente hay "+numJugadores);
                            mostrarEquipos(numEquipos,equipos,divisiones);
                            System.out.print("Id del equipo: ");
                            int idEquipo = sc.nextInt();
                            System.out.print("Puntuación: ");
                            int puntuacion = sc.nextInt();
                            System.out.print("Nombre (1 palabra): ");
                            String nombre = sc.next();

                            numJugadores++;
                            jugadores[numJugadores - 1] = new Jugadores(idEquipo,puntuacion,nombre);
                            System.out.println("Se ha añadido correctamente al jugador");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Gracias por usar el programa.");
                    salir = true; // salgo del bucle
                }
            }
        }

    }
    private static int mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1. VER EQUIPOS.
                2. VER JORNADAS.
                3. VER JUGADORES.
                4. AÑADIR.
                5. SALIR.
                """);

        return sc.nextInt(); // devuelvo la respuesta.
    }
    private static void mostrarEquipos(int numEquipos, Equipo[] equipos, Divisiones[] divisiones){
        System.out.println("Estos son los equipos que hay");
        System.out.println("|||||||||||||");
        for (int i = 0; i < numEquipos; i++){
            System.out.println(equipos[i]);
            System.out.println("La division del equipo es: "+ divisiones[equipos[i].getIdDivision()].getNombreDivision());
            System.out.println("----");
        }
    }
    private static void mostrarJornadas(int numJornadas, Jornadas[] jornadas){
        System.out.println("Estas son las jornadas que hay");
        System.out.println("|||||||||||||");
        for (int i = 0; i < numJornadas; i++){
            System.out.println(jornadas[i]);
        }
    }
    private static void mostrarJugadores(int numJugadores, Jugadores[] jugadores, Equipo[] equipos){
        System.out.println("Estas son las jornadas que hay");
        System.out.println("|||||||||||||");
        for (int i = 0; i < numJugadores; i++){
            System.out.println(jugadores[i]);
            System.out.println("El equipo de este jugador es: "+ equipos[jugadores[i].getIdEquipo()].getNombreEquipo()); // muestro el nombre del equipo
        }
    }
}
