import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] matriz = new int [10]; //Creo una matriz
        for (int i = 0; i < 10; i++) { //Recorro la matriz


            System.out.println("Introduzca un número"); //Pido que se introduzca un número



            matriz[i]=sc.nextInt();
           // System.out.println(matriz[i]); //Muestro los valores de la matriz de inicio a fin
        }
        for (int i = 0; i <10; i++) {
            System.out.println(matriz[9-i]); //Muestro los valores de la matriz de fin a inicio
        }
    }
}