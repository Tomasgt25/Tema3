package RuletaRusa;

public class Jugador {

    private static int id=1;
    private String Nombre;
    protected boolean vivo;
    public Jugador(){}

    public Jugador(int id, String nombre, boolean vivo) {
        this.id = id++;
        this.Nombre = "Jugador " + this.id;
        this.vivo = true;
    }

    public boolean disparar(Revolver revolver){
        if (revolver.disparar()){
            this.vivo= false;
            System.out.println("El jugador ha muerto");
        }
            System.out.println("El jugador sigue vivo");
            return this.vivo;
    }
    public boolean isVivo(){
        return vivo;
    }
}
