package com.aulaenlanube.gestionempleados;

public class EmpleadoFijo extends Empleado{
    private double salarioMensual;
    

    public EmpleadoFijo(String nombre, String apellidos, String dni, 
            double salario, double salarioMes) {
        super(nombre, apellidos, dni, salario);
        this.salarioMensual = salarioMes;
    }

    @Override
    public double calcularSalario() {
        return this.salarioMensual;
    }
    
}
