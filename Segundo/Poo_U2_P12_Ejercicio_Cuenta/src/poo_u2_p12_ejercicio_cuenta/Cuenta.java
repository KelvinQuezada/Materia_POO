
package poo_u2_p12_ejercicio_cuenta;

import java.util.Scanner;

class Cuenta {
    //Atributos
    private String nombre;
    private String cedula;
    private int numeroCuenta;
//constructores
    public Cuenta(String nombre, String cedula, int numeroCuenta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroCuenta = numeroCuenta;
    }
//metodo para deposito
    public void depositar(double cantidad) {
        // Implementa la lógica para depositar en la cuenta
        System.out.println("Depósito realizado en la cuenta: " + cantidad);
    }
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
