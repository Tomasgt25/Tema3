package Electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos;
        electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora(100, 10);
        electrodomesticos[1] = new Lavadora(120, 9);
        electrodomesticos[2] = new Lavadora(130, 8);
        electrodomesticos[3] = new Lavadora(80, 15);
        electrodomesticos[4] = new Lavadora(90, 12);
        electrodomesticos[5] = new Televisión(200, 15);
        electrodomesticos[6] = new Electrodomestico(90, "azul", 'A', 50);
        electrodomesticos[7] = new Electrodomestico();
        electrodomesticos[8] = new Televisión();
        electrodomesticos[9] = new Televisión();

        double precioElectro = 0, precioTV = 0, precioLavadora = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Precio final: " + electrodomesticos[i].precioFinal());
            if (electrodomesticos[i] instanceof Televisión) {
                precioTV += electrodomesticos[i].precioFinal();
            } else if (electrodomesticos[i] instanceof Lavadora) {
                precioLavadora += electrodomesticos[i].precioFinal();
            }
            precioElectro += electrodomesticos[i].precioFinal();
        }
        System.out.println("Precio de las lavadoras: " + precioLavadora);
        System.out.println("Precio de las TV: " + precioTV);
        System.out.println("Precio de los electrodomésticos: " + precioElectro);
    }
}

