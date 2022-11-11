package Electrodomesticos;

public class Lavadora extends Electrodomestico {

    private static final int CARGADEF=5;
    private int carga;


   public Lavadora(){}

   public Lavadora(int precio, int peso){
        super(precio,peso);
    }

   public Lavadora (int precio, int peso, char consumoEnergetico, String color, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }


    @Override
    public int precioFinal() {
        int precioFinal= super.precioFinal();
        if(this.carga>30) {
            precioFinal+=50;
        }
        return precioFinal;
    }

}

