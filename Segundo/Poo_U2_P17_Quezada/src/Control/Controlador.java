/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private Vista view;
    private Modelo modelo;

    public Controlador(Vista view, Modelo modelo) {
        this.view = view;
        this.modelo = modelo;
        this.view.btnSumar.addActionListener(this);
        this.view.btnResta.addActionListener(this);
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnDivivir.addActionListener(this);
        
    }
    public void iniciar(){
        view.setTitle("USTED VA A SUMAR POR MEDELO DE VISTA CONTROLADOR");
        view.setLocationRelativeTo(null);
        view.txtN1.setText(String.valueOf(modelo.getValor1()));
        view.txtN2.setText(String.valueOf(modelo.getValor2()));
        view.txtResultado.setText(String.valueOf(modelo.getTotal()));
    }
  @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setValor1(Integer.valueOf(view.txtN1.getText()));
        modelo.setValor2(Integer.valueOf(view.txtN2.getText()));
        if(e.getSource()==view.btnSumar){
            modelo.sumar();
        }
        
        if(e.getSource()==view.btnResta){
            modelo.restar();
        }
        if(e.getSource()==view.btnMultiplicar){
            modelo.multiplicar();
        }
        if(e.getSource()==view.btnDivivir){
            modelo.dividir();
        }
        

        view.txtResultado.setText(String.valueOf(modelo.getTotal()));

    }
}
    
    
