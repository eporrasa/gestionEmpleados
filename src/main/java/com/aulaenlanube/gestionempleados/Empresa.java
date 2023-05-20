package com.aulaenlanube.gestionempleados;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empresa {

    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void eliminarEmpleado(String dni) {
        try {
            for (Empleado empleado : empleados) {
                if (empleado.getDni().equals(dni)) {
                    empleados.remove(empleado);
                    System.out.println("El Empleado con DNI: " + dni + " ha sido eliminado.");
                    return;
                }
            }
            throw new EmpleadoNoEncontradoException("Error al eliminar - Empleado con DNI: " + dni + " no encontrado.");
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
