package com.aulaenlanube.gestionempleados;

public class GestionEmpleados {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(new EmpleadoFijo("Edwin", "Porras Angarita", "91495845", 150000, 11500));
        empresa.agregarEmpleado(new EmpleadoFijo("Jenny", "Rodriguez", "1032386073", 224000, 20000));
        empresa.agregarEmpleado(new EmpleadoPorHoras("Emma", "Porras Rodriguez", "1019914376", 120000, 45, 35));

        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println(empleado.toString());
        }

        empresa.eliminarEmpleado("91495845");
        empresa.eliminarEmpleado("18568");

        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println(empleado.toString());
        }

    }
}
