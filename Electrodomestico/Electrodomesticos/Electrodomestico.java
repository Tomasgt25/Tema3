// https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
package Electrodomesticos;

public  class Electrodomestico {
    protected final static int PRECIODEF = 100;
    protected final static String COLORDEF = "blanco";
    protected final static char CONSUMOENERGETICODEF = 'F';
    protected final static int PESODEF = 5;
    protected int precioBase=PRECIODEF;
    protected String color=COLORDEF;
    protected char consumoEnergetico=CONSUMOENERGETICODEF;
    protected int peso=PESODEF;

    public Electrodomestico() {
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase=precioBase;
        this.peso=peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=color;
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private boolean comprobarConsumoEnergetico(char consumoEnergetico) {
        if (this.consumoEnergetico != 'A' && this.consumoEnergetico != 'B' && this.consumoEnergetico != 'C' && this.consumoEnergetico != 'D' && this.consumoEnergetico != 'E' && this.consumoEnergetico != 'F') {
            this.consumoEnergetico=CONSUMOENERGETICODEF;
            return false;
        } else {
            this.consumoEnergetico=consumoEnergetico;
            return true;
        }

    }

    private boolean comprobarColor() {
        if (this.color != "blanco" && this.color != "rojo" && this.color != "negro" && this.color != "azul" && this.color != "gris") {
            this.color = COLORDEF;
            return false;
        } else {
            this.color = color;
            return true;
        }
    }

        public int precioFinal() {
            int preciofinal=0;
            switch(this.consumoEnergetico){
                case 'A': preciofinal+=100;
                break;
                case 'B': preciofinal+=80;
                    break;
                case 'C': preciofinal+=60;
                    break;
                case 'D': preciofinal+=50;
                    break;
                case 'E': preciofinal+=30;
                    break;
                case 'F': preciofinal+=10;
                    break;
            }

        if (this.peso >=0 && this.peso<=19) {
            preciofinal += 10;
        } else if (this.peso >=20 && this.peso <=49) {
            preciofinal += 50;
        } else if (this.peso >=50 && this.peso <=79) {
            preciofinal += 80;
        } else {
            preciofinal += 100;
        } return preciofinal;
    }
}



