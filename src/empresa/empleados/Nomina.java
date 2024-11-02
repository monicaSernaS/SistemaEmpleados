package empresa.empleados;
import java.io.Serializable;
import java.util.Random;

public class Nomina implements Serializable {
    private double salarioBase;
    private double plusConvenio;
    private double complementos;
    private double descuentoIRPF;

    public Nomina(double salarioBase) {
        this.salarioBase = salarioBase;
        this.plusConvenio = 200; // Un ejemplo de plus fijo
        this.complementos = 150;  // Un ejemplo de complementos fijos
        calcularDescuentoIRPF();
    }

    private void calcularDescuentoIRPF() {
        Random rand = new Random();
        double porcentajeIRPF = 0.1 + (0.08 * rand.nextDouble()); // Entre 10% y 18%
        this.descuentoIRPF = salarioBase * porcentajeIRPF;
    }

    public double calcularSalarioNeto() {
        return salarioBase + plusConvenio + complementos - descuentoIRPF;
    }

    // Getters
    public double getSalarioBase() {
        return salarioBase;
    }
}
