package com.aulaenlanube.gestionempleados;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String apellidos, String dni,
            double salario, int horasTrabajadas, double tarifaXhora) {
        super(nombre, apellidos, dni, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaXhora;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabajadas * this.tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario: " + calcularSalario() ;
    }

}
