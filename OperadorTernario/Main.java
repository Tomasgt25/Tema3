import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd= new Random(); //Genero aleatorio
        int num=rnd.nextInt(99);//El aleatorio está entre 0 y 99
        System.out.println(((num%2==0)?"Es par":"Es impar"));  // Si el número generado es par, muestra por pantalla "es par"; si es impar, muestra por pantalla "es impar"
       /* if (num%2==0) { //La condición hace lo mismo que el ternario.
            mensaje="Es par";
        }else {
            mensaje="Es impar";
        }

        */
    }
}
