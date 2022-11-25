public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[8];
        empleados[0]  = new Repartidor("repartidor1", 24, 300, "3");
        empleados[1]  = new Repartidor("repartidor2", 26, 300, "3");
        empleados[2]  = new Repartidor("repartidor3", 24, 300, "2");
        empleados[3]  = new Repartidor("repartidor4", 26, 300, "2");
        empleados[4]  = new Comercial("comercial1", 31, 300, 201);
        empleados [5] = new Comercial("comercial2", 31, 300, 200);
        empleados[6]  = new Comercial("comercial3", 30, 300, 201);
        empleados [7] = new Comercial("comercial4", 30, 300, 200);

        for (Empleado empleado : empleados) {
            System.out.println(empleado.plus());
        }


    }
}
