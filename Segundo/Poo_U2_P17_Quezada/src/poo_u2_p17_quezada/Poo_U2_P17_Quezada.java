/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_u2_p17_quezada;

import Control.Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Poo_U2_P17_Quezada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo mode=new Modelo();
        Vista vist=new Vista();
        Controlador cont=new Controlador(vist,mode);
        cont.iniciar();
        vist.setVisible(true);
        
    }
    
}
