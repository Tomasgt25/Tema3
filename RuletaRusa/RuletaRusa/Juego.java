package RuletaRusa;

import java.util.Random;

public class Juego {
    Random rnd = new Random();
    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego() {
        int numJugadores = rnd.nextInt(2, 7);
        jugadores = new Jugador[numJugadores];
        for (int i = 0; i < numJugadores; i++) {
            jugadores[i] = new Jugador();
        }
    }


    public void añadirJugador(Jugador jugador) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) ;
            jugadores[i] = jugador;
            break;
        }
    }

    public int comprobarJugadores(int numJugadores) {
        if (!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
        }
        return numJugadores;
    }

    public boolean finJuego() {
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                return true;
            }
        }
        return false;
    }

    private void crearJugador() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador();
        }
    }

    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("El jugador " + i + 1 + "se va a disparar.");
            jugadores[i].disparar(revolver);
            if (jugadores[i].isVivo()) {
                System.out.println("El jugador " + i + 1 + "sigue vivo.");
            } else {
                System.out.println("El jugador " + i + 1 + "se ha muerto.");
                System.out.println("Ronda terminada");
                break;
            }
        }

    }
}

