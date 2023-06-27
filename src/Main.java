public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("DH");
        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        empresa.agregarEmpleados(empleadoFactory.crearEmpleado(EmpleadoFactory.CLAVE_EMP_PH));
        empresa.agregarEmpleados(empleadoFactory.crearEmpleado(EmpleadoFactory.CLAVE_EMP_RD));

        System.out.println("El total de los sueldos a pagar son: $"+empresa.calcularSueldosTotal(30));


    }
}