import java.util.Scanner;

public class Matriz {

    private int[][] matriz = new int[3][3];
    Scanner sc = new Scanner(System.in);

    public Matriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduzca el elemento de matriz: [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }

        }
    }

    public Matriz(int[][] matriz) {
        this.matriz = matriz;

    }

    public void mostrarMatriz() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.matriz[i][j] + " ");

            }
            System.out.print("\n");
        }
    }

    public void calcularDeterminante() {
        int num1, num2, num3, num4, num5, num6;


                num1 = this.matriz[0][0] * this.matriz[1][1] * this.matriz[2][2];
                num2 = this.matriz[0][1] * this.matriz[1][2] * this.matriz[2][0];
                num3 = this.matriz[1][0] * this.matriz[2][1] * this.matriz[0][2];
                num4 = this.matriz[0][2] * this.matriz[1][1] * this.matriz[2][0];
                num5 = this.matriz[0][1] * this.matriz[1][0] * this.matriz[2][2];
                num6 = this.matriz[1][2] * this.matriz[2][1] * this.matriz[0][0];
                System.out.println(num1+num2+num3-num4-num5-num6);
            }
}
