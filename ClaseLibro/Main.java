import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Libro libro1= new Libro(10,"titulo1","autor1",30);
        Libro libro2= new Libro(20,"titulo2","autor2",60);;
        System.out.println(libro1);
        System.out.println(libro2);
        if (libro1.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println(libro1.getTitulo() +" tiene más páginas");
        } else {
            System.out.println(libro2.getNumPaginas() +"tiene más páginas");
        }
    }
}
