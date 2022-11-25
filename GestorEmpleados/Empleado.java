public abstract class Empleado implements Plus {
   protected String nombre;
   protected int edad;
   protected int salario;
   protected int PLUS=300;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario ) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getPLUS() {
        return PLUS;
    }

    public void setPLUS(int PLUS) {
        this.PLUS = PLUS;
    }

    @Override
    public boolean plus() {
        return true;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", PLUS=" + PLUS +
                '}';
    }
}
