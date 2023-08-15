/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ESPE
 */
public class Modelo {
    private int valor1=28;
    private int valor2=69;
    private int total=sumar();
    
    public Modelo(){}

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    

    public int sumar() {
        this.total = (+valor1+valor2);
        return total;
    }
    
    public void restar() {
        this.total = (valor1-valor2);

    }
    public void dividir() {
        this.total = (valor1/valor2);

    }
    public void multiplicar() {
        this.total = (valor1*valor2);
    }
    
    
    
}
