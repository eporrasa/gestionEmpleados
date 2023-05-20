package com.aulaenlanube.gestionempleados;

import java.util.List;

public class Empresa {

    private List<Empleado> empleados;

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void eliminarEmpleado(String dni) {
        try {
            empleados.stream()
                    .filter(e -> e.getDni().equals(dni))
                    .forEach(System.out::println);
        } catch (Exception e) {
        }
    }

}
