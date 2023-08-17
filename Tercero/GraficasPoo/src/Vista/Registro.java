/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author petee
 */
public class Registro extends JFrame{
//creamos una ventana grafica con Jframe
    public JPanel panel;
    public Registro(){
        this.setSize(500,500);
        setTitle("Registro");
        
        //sirve para que se cierre el sistema 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Centrar la ventana 
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajaTexto();
        ColocarAreaTexto();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajaTexto();
        ColocarAreaTexto();
    }
    private void colocarPanel(){
        panel=new JPanel();
        
        //damos un color al panel
        panel.setBackground(Color.ORANGE);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    //CREAMOS ETIQUETAS
    public void colocarEtiquetas(){
        JLabel label=new JLabel("Registro", SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(100, 10, 350, 50);
        label.setForeground(Color.BLACK);
        label.setBackground(Color.PINK);
        label.setOpaque(true);
        /// creamos otro objeto
        JLabel label1=new JLabel("");
        label1.setText("Nombre: ");
        //agregamos la etiqueta al panel 
        panel.add(label1);
        //ubicacion 
        label1.setHorizontalAlignment(HEIGHT);
        //cambiar la fuente 
        label1.setFont(new Font("arial", Font.PLAIN,15));
        label1.setBounds(50, 70, 350, 50);
        //poner imagen
        JLabel labelimagen= new JLabel();
        ImageIcon imagen= new ImageIcon("registro.png");
        labelimagen.setBounds(30, 110, 100, 50);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
    }
    public void colocarBotones(){
        JButton boton1=new JButton("CLICK");
        boton1.setBounds(30, 310, 100, 50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        boton1.setBorder(BorderFactory.createLineBorder(Color.BLUE,5,true));
        
        JButton boton2=new JButton("imagen");
        ImageIcon imagen1= new ImageIcon("registro1.png");
        boton2.setBounds(210, 310, 100, 50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('b');
        
        boton2.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));      
        
    }
    public void colocarCajaTexto(){
        JTextField cajatxt=new JTextField();
        cajatxt.setBounds(140, 80, 250, 30);
        panel.add(cajatxt);
        cajatxt.setText("POO");
        System.out.println("el teto de la caja es: " + cajatxt.getText());
        
    }
    public void ColocarAreaTexto(){
        JTextArea txtarea1= new JTextArea();
        txtarea1.setBounds(140, 120, 250, 100);
        panel.add(txtarea1);
        txtarea1.setText("POO");
        txtarea1.append("\n escribir aqui....");
        
        
       JScrollPane barra=new JScrollPane(txtarea1);
       //vertical
       barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
       //horizontal
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(140, 120, 250, 100);
        panel.add(barra);
    }
    
}
