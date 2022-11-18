package RuletaRusa;

import java.util.Random;

public class Revolver {


     Random rnd = new Random();
    private  int posicionBala = rnd.nextInt(6) + 1;
    private  int posicionActual=1;

    Revolver() {
        posicionActual= rnd.nextInt(1,7);
        posicionBala=rnd.nextInt(1,7);
    }

    public boolean disparar() {
        if (this.posicionActual == this.posicionBala) {
            return true;
        } siguienteBala();
        return false;
    }
    public void siguienteBala(){

        if (posicionActual==posicionBala){
            posicionActual=1;
        }posicionActual++;
    }

    @Override
    public String toString() {
        return "RuletaRusa.Revolver{" +
                "posicionActual=" + posicionActual +
                "posicionBala=" + posicionBala +
                '}';
    }
}
