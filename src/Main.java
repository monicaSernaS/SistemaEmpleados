import empresa.empleados.Empleado;
import empresa.empleados.EmpleadoEjecutivo; // Asegúrate de importar tus clases
import empresa.empleados.EmpleadoTecnico; // Asegúrate de importar tus clases
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Empleado> empleados = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cargarEmpleados();
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear empleados");
            System.out.println("2. Buscar empleados");
            System.out.println("3. Resumen de empleados");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearEmpleados();
                    break;
                case 2:
                    buscarEmpleados();
                    break;
                case 3:
                    resumenEmpleados();
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    guardarEmpleados(); // Guardar empleados antes de salir
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void crearEmpleados() {
        System.out.print("Introduce el tipo de empleado (1: Técnico, 2: Ejecutivo): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Introduce el NIF: ");
        String nif = scanner.nextLine();
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce los apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Introduce el salario base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        Empleado nuevoEmpleado;

        if (tipo == 1) {
            nuevoEmpleado = new EmpleadoTecnico(nif, nombre, apellidos, salarioBase);
        } else if (tipo == 2) {
            System.out.print("Introduce las comisiones anuales: ");
            double comisionesAnuales = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            nuevoEmpleado = new EmpleadoEjecutivo(nif, nombre, apellidos, salarioBase, comisionesAnuales);
        } else {
            System.out.println("Tipo de empleado no válido. No se puede crear el empleado.");
            return;
        }

        empleados.add(nuevoEmpleado);
        System.out.println("Empleado añadido correctamente.");
    }

    private static void buscarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No se han creado empleados.");
            return;
        }
        System.out.print("Introduce el NIF del empleado a buscar: ");
        String nifBuscado = scanner.nextLine();
        for (Empleado empleado : empleados) {
            if (empleado.getNif().equals(nifBuscado)) {
                empleado.mostrarDetalles();
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    private static void resumenEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No se han creado empleados.");
            return;
        }
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
        }
    }

    private static void cargarEmpleados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleados.dat"))) {
            empleados = (List<Empleado>) ois.readObject();
            System.out.println("Empleados cargados correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void guardarEmpleados() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleados.dat"))) {
            oos.writeObject(empleados);
            System.out.println("Empleados guardados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
