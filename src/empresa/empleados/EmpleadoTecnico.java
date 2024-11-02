package empresa.empleados;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoTecnico extends Empleado {
    private List<String> cualificaciones;

    public EmpleadoTecnico(String nif, String nombre, String apellidos, double salarioBase) {
        super(nif, nombre, apellidos, "Técnico", salarioBase); // Llama al constructor de Empleado
        this.cualificaciones = new ArrayList<>();
        agregarCualificaciones();
    }

    private void agregarCualificaciones() {
        // Agrega cualificaciones específicas
        cualificaciones.add("Programación en Java");
        cualificaciones.add("Desarrollo web");
        cualificaciones.add("Base de datos SQL");
        cualificaciones.add("Cloud Computing");
        cualificaciones.add("Metodologías Ágiles");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Técnico: " + nombre + " " + apellidos + ", NIF: " + nif + ", Salario Mensual: " + salarioMensual);
        System.out.println("Cualificaciones: " + cualificaciones);
    }
}