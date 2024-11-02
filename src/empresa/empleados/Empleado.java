package empresa.empleados;
import java.io.Serializable;
import empresa.empleados.Nomina;


public abstract class Empleado implements Serializable {
    protected String nif;
    protected String nombre;
    protected String apellidos;
    protected String puesto;
    protected double salarioMensual;
    protected Nomina nomina;

    public Empleado(String nif, String nombre, String apellidos, String puesto, double salarioBase) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.nomina = new Nomina(salarioBase);
        this.salarioMensual = nomina.calcularSalarioNeto();
    }

    public abstract void mostrarDetalles();

    // Getters
    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
}
