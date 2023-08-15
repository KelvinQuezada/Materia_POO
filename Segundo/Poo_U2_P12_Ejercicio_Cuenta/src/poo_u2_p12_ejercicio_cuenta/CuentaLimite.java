
package poo_u2_p12_ejercicio_cuenta;

import java.util.Scanner;
//la CuentaLimite va heredar de la clase cuenta
class CuentaLimite extends Cuenta {
    //atributo
    private double limiteDeposito;
//constructor
    public CuentaLimite(String nombre, String cedula, int numeroCuenta, double limiteDeposito) {
        super(nombre, cedula, numeroCuenta);
        this.limiteDeposito = limiteDeposito;
    }
//metodo donde realizaremos la cantida del deposito 
    @Override
    public void depositar(double cantidad) {
        if (cantidad <= limiteDeposito) {
            // Llamamos al método depositar de la clase padre
            super.depositar(cantidad);
        } else {
            System.out.println("El depósito excede el límite permitido.");
        }
    }
    // Getter y setter
    public double getLimiteDeposito() {
        return limiteDeposito;
    }

    public void setLimiteDeposito(double limiteDeposito) {
        this.limiteDeposito = limiteDeposito;
    }
}
