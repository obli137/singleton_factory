import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleadoList = new ArrayList<>();
    }

    public Double calcularSueldosTotal(Integer diasTrabajados){
        Double sueldosTotales = 0.0;
        for (Empleado empleado : empleadoList) {
            sueldosTotales += empleado.calcularSueldo(diasTrabajados);
        }
        return sueldosTotales;
    }

    public void agregarEmpleados(Empleado empleado){
        empleadoList.add(empleado);
    }
}
