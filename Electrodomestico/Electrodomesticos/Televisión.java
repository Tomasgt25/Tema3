package Electrodomesticos;

public class Televisión extends Electrodomestico {
    private static final int resolucionDEF=20;
    private boolean sintonizadorTDTDEF=false;
    private int resolucion=resolucionDEF;
    private boolean sintonizadorTDT=sintonizadorTDTDEF;

    public Televisión(){}

    public Televisión(int precioBase, int peso ){
        super(precioBase,peso);
    }

    public Televisión(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    public int precioFinal(){
        int precioFinal=super.precioFinal();
        if (this.resolucion>40){
            precioFinal*=1.3;
        }
        if (this.sintonizadorTDT){
            precioFinal+=50;
        }
        return precioFinal;
    }
}


