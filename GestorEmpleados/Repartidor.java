public class Repartidor extends Empleado implements Plus{

    private String zona;

    public Repartidor(String nombre, int edad, int salario, String zona) {
        super(nombre, edad, salario);
        this.zona=zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public boolean plus() {
            if (this.edad<25 && this.zona.equals("3")){
                return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "Repartidor{" +
                "zona='" + zona + '\'' +
                "} " + super.toString();
    }
}

