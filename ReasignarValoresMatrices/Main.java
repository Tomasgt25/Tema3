import java.util.Random;

/* Guardar 5 valores aleatorios en una matriz y mostrarlos.
Intercambiar los valores de las posiciones 2 y 5.
 */
public class Main {
    public static void main(String[] args) {
        Random rnd= new Random(); //Genero número al azar
        int aux; //Creo un int para poder cambiar las posiciones 2 y 5
        int[] matriz = new int[5]; //Creo un matriz de 5 valores
        for (int i = 0; i < 5; i++) { //Leo la matriz
            matriz[i]= rnd.nextInt(10); //Intercambio los valores de la matriz por 5 números generados aleatoriamente hasta el 10
            System.out.println(matriz[i]+" "); //Muestro la nueva matriz
        }
        aux=matriz[1]; //Cambio el valor de la posicion 2 por el auxiliar
        matriz[1]=matriz[4]; // Asigno a la posicion 2 el valor de la posicion 4
        matriz[4]=aux; //Asigno a la posicion el valor de la posicion 2 que está guardada en el auxiliar
        for (int i = 0; i < 5; i++) { //Leo la nueva matriz
            System.out.println(matriz[i]+" ");//Muestro la matriz con los valores 2 y 5 cambiados
        }
    }
}


