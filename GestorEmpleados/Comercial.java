public class Comercial extends Empleado implements Plus{
    private double comisión;

    public Comercial(String nombre, int edad, int salario, double comisión) {
        super(nombre, edad, salario);
        this.comisión = comisión;
    }

    public double getComisión() {
        return comisión;
    }

    public void setComisión(double comisión) {
        this.comisión = comisión;
    }

    public boolean plus() {
        if (this.edad > 30 && this.comisión > 200){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Comercial{" +
                "comisión=" + comisión +
                "} " + super.toString();
    }
}
