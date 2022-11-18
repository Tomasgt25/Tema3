import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Libro libro1= new Libro(10,"titulo1","autor1",30); //Creo un objeto de la clase libro usando el constructor
        Libro libro2= new Libro(20,"titulo2","autor2",60); //Creo otro objeto de la clase libro usando el constructor
        System.out.println(libro1.toString()); //Muestro por pantalla el objeto libro1
        System.out.println(libro2.toString()); //Muestro por pantalla el objeto libro2
        if (libro1.getNumPaginas()>libro2.getNumPaginas()){ //Si libro 1 tiene más páginas
            System.out.println(libro1.getTitulo() +" tiene más páginas"); //Muestro que libro 1 tiene más páginas
        } else if (libro1.getNumPaginas()<libro2.getNumPaginas()){ //Si no
            System.out.println(libro2.getTitulo() +" tiene más páginas"); //Muestro que libro 2 tiene má páginas
        } else {
            System.out.println(libro1.getTitulo() + "  tiene las mismas páginas que " +libro2.getTitulo());
        }
    }
}
