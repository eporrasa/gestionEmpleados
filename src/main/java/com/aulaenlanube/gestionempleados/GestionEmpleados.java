package com.aulaenlanube.gestionempleados;

public class GestionEmpleados {

    public static void main(String[] args) {
        Empresa emp = new Empresa();
        
        emp.agregarEmpleado(new EmpleadoFijo("Edwin", "Porras Angarita", "91495845", 150000, 11500));
        emp.agregarEmpleado(new EmpleadoFijo("Jenny", "Rodriguez", "1032386073", 224000, 20000));
        emp.agregarEmpleado(new EmpleadoPorHoras("Emma", "Porras Rodriguez", "1019914376", 120000, 45, 35));
        
        System.out.println(emp.toString());
        
        emp.eliminarEmpleado("14587");
        

    }
}
