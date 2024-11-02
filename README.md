# Sistema de Gestión de Empleados para Recursos Humanos 👥✨

Este proyecto implementa un sistema de gestión de empleados destinado al departamento de Recursos Humanos. El programa permite registrar, buscar y resumir empleados, manteniendo la información de manera persistente a través de archivos en disco. 🗂️💼

## Tecnología Utilizada 🖥️🔧
- **Lenguaje de Programación**: Java ☕
- **Entorno de Desarrollo**: IntelliJ IDEA 🛠️

## Requisitos del Sistema 📝🔍

### Información del Empleado
Cada empleado tiene los siguientes atributos:
- **NIF**: Número de Identificación Fiscal. 🆔
- **Nombre**: Nombre del empleado. 🧑‍💼
- **Apellidos**: Apellidos del empleado. 👨‍👩‍👦
- **Puesto**: Tipo de empleado (Técnico o Ejecutivo). ⚙️💼
- **Salario Mensual**: Salario que recibe mensualmente. 💰

### Datos de la Nómina 💵📊
Los datos de la nómina incluyen:
- **Salario Base**: Cantidad fija que se utilizará para calcular el salario neto. 💵
- **Plus de Convenio**: Compensación adicional. 📈
- **Complementos**: Cantidades adicionales asignadas. 🎁
- **Descuento de IRPF**: Calculado aleatoriamente entre el 10% y el 18% del salario base. 📉🎲

### Tipos de Empleados
- **Empleado Técnico**: Además de los atributos comunes, este tipo de empleado tiene un listado de hasta 5 cualificaciones. 🛠️📜
- **Empleado Ejecutivo**: Este tipo incluye las comisiones anuales que percibe por objetivos, afectando el cálculo de su salario neto mensual. 💼💸

## Funcionalidades del Menú 📋💻
El sistema presenta un menú con las siguientes opciones:
1. **Crear empleados**: Permite añadir empleados de distintos tipos mediante la entrada de datos por consola. ✍️👥
2. **Buscar empleados**: Permite buscar un empleado por su NIF. 🔎
3. **Resumen de empleados**: Muestra todos los empleados registrados. 📑
4. **Salir**: Termina el programa mostrando un mensaje de despedida. 👋✨

Las opciones de búsqueda y resumen muestran un mensaje si no se han creado empleados. 🚫

## Persistencia de Datos 💾🗃️
Los empleados se guardan en un archivo en disco (ej. `empleados.dat`), lo que permite que la información persista entre diferentes ejecuciones del programa. Los datos se cargan en una colección de Java (como `ArrayList`) al iniciar el programa, y se actualizan al agregar nuevos empleados. 🔄

## Cómo Ejecutar el Proyecto 🚀💻

1. **Requisitos Previos**:
   - Tener instalado Java Development Kit (JDK). ☕
   - Tener un entorno de desarrollo como IntelliJ IDEA. 🛠️

2. **Clonar el Repositorio**:
   ```bash
   git clone <URL-del-repositorio>
   cd SistemaEmpleados
