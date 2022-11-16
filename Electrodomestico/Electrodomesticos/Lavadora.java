package Electrodomesticos;

public class Lavadora extends Electrodomestico {

    private static final int CARGADEF=5;
    private int carga;


   public Lavadora(){}

   public Lavadora(int precioBase, int peso){

       super(precioBase,peso);
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
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

