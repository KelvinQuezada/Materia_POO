/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_u2_p12_ejercicio_cuenta;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Poo_U2_P12_Ejercicio_Cuenta {
    
    public static void main(String[] args) {
        // El Scanner es para pedir los datos por consola
        Scanner leer = new Scanner(System.in);   
        System.out.print("Ingrese el nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese la cédula: ");
        String cedula = leer.nextLine();
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.print("Ingrese el límite de depósito: ");
        double limiteDeposito = leer.nextDouble();
        // Crear una instancia de la clase CuentaLimite y llamamos los atributos de la clase Cuenta y la clase CuentaLimite
        CuentaLimite cuentaLimite = new CuentaLimite(nombre, cedula, numeroCuenta, limiteDeposito);
        // Realizar un depósito
        System.out.print("Ingrese la cantidad a depositar: ");
        double cantidadDeposito = leer.nextDouble();
        cuentaLimite.depositar(cantidadDeposito);
        leer.close();
    }
}

