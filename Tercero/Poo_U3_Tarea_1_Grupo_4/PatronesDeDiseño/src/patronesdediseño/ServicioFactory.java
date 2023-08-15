/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdediseño;

//factoria abstracto 
public interface ServicioFactory {
// define un método público llamado crearServicio que no acepta 
//ningún argumento y devuelve un objeto del tipo "ServicioInformatico".
    public ServicioInformatico crearServicio();
}
