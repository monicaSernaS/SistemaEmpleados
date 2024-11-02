package empresa.empleados;

import java.io.Serializable;

public class EmpleadoEjecutivo extends Empleado implements Serializable {
    private double comisionesAnuales;

    public EmpleadoEjecutivo(String nif, String nombre, String apellidos, double salarioBase, double comisionesAnuales) {
        super(nif, nombre, apellidos, "Ejecutivo", salarioBase);
        this.comisionesAnuales = comisionesAnuales;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Ejecutivo: " + nombre + " " + apellidos + ", NIF: " + nif + ", Salario Mensual: " + getSalarioMensual());
        System.out.println("Comisiones Anuales: " + comisionesAnuales);
    }

    @Override
    public double getSalarioMensual() {
        // Calcula el salario mensual incluyendo las comisiones anuales divididas entre 12
        return super.getSalarioMensual() + (comisionesAnuales / 12);
    }
}
