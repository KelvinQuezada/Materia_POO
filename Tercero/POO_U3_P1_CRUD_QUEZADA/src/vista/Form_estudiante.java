/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import controller.Conexion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Form_estudiante extends javax.swing.JInternalFrame {
    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    
    public Form_estudiante() {
        initComponents();
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtPromedio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        cboAsignatura = new javax.swing.JComboBox<>();
        cboEstado = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiante = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ESTUDIANTE");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Asignatura:");

        jLabel5.setText("Promedio:");

        jLabel6.setText("Estado:");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE ESTUDIANTES");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cboAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POO", "Fisica", "Calculo Vectorial", "EDO" }));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Reprobado", "" }));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellidos)
                            .addComponent(txtPromedio)
                            .addComponent(cboAsignatura, 0, 130, Short.MAX_VALUE)
                            .addComponent(cboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar)
                            .addComponent(Actualizar)
                            .addComponent(btnEliminar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Actualizar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        tablaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tablaEstudiante);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();      
    }//GEN-LAST:event_btnLimpiarActionPerformed

       public void limpiarDatos(){
        txtNombre.setText("");
        txtApellidos.setText("");
        cboAsignatura.setSelectedItem(null);
        txtPromedio.setText("");
        cboEstado.setSelectedItem(null);    
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarDatos();
        limpiarDatos();
        mostrarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

        public void guardarDatos(){
        try {
            String SQL="insert into estudiante(estu_nombre,estu_apellido,estu_asignatura,estu_promedio,estu_estado)values(?,?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtApellidos.getText());
            
            int seleccion=cboAsignatura.getSelectedIndex();
            pst.setString(3,cboAsignatura.getItemAt(seleccion));
            
            pst.setString(4,txtPromedio.getText());
            
            int seleccion2=cboEstado.getSelectedIndex();
            pst.setString(5,cboEstado.getItemAt(seleccion2));
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
                 
        } catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error de inserción: " + e.getMessage());
}   
     
}
      
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    eliminarRegistro();  
    mostrarDatos();
    limpiarDatos();
// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
    actualizarDatos();
    mostrarDatos();
// TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed
   
    public void actualizarDatos(){
         try {
        int filaSeleccionada = tablaEstudiante.getSelectedRow();
        if (filaSeleccionada >= 0 && filaSeleccionada < tablaEstudiante.getRowCount()) {
            String dao = (String) tablaEstudiante.getValueAt(filaSeleccionada, 0);
            String SQL = "update estudiante set estu_nombre=?,estu_apellido=?,estu_asignatura=?,estu_promedio=?,estu_estado=? where estu_codigo=?";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtApellidos.getText());

            int seleccion = cboAsignatura.getSelectedIndex();
            pst.setString(3, cboAsignatura.getItemAt(seleccion));

            pst.setString(4, txtPromedio.getText());

            int seleccion2 = cboEstado.getSelectedIndex();
            pst.setString(5, cboEstado.getItemAt(seleccion2));
            
            //Ejecutamos la consulta/
            pst.setString(6, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila válida para actualizar.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en la actualización: " + e.getMessage());
    }
    }
    public void eliminarRegistro(){
         int filaSeleccionada=tablaEstudiante.getSelectedRow();
        try {
            String SQL="delete from estudiante where estu_codigo="+tablaEstudiante.getValueAt(filaSeleccionada, 0);
            Statement st=(Statement) con.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en eliminar registro"+e.getMessage());
        }
        
    }
   
   

 
  //creamos un metodo para mostrar datos 
    public void mostrarDatos(){
        //utilizamos un titulo para llamar a nuestro arreglo en una tabla
        String titulos[]={"Codigo","Apellido","Nombre","Asignatura","Promedio","Estado"};
        //colocamos la dimencion del arreglo que es [6];
        String registro[]=new String[6];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        String SQL="SELECT * FROM `estudiante`";
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                //llamamos a nuestros atributos que tenemos en nuestra base de datos de localhost
                registro[0]=rs.getString("estu_codigo");
                registro[1]=rs.getString("estu_nombre");
                registro[2]=rs.getString("estu_apellido");
                registro[3]=rs.getString("estu_asignatura");
                registro[4]=rs.getString("estu_promedio");
                registro[5]=rs.getString("estu_estado");
                modelo.addRow(registro);
            }
            //llamamos a nuestra tabla que seba a registar todo los ingresos 
            tablaEstudiante.setModel(modelo);         
        }catch( Exception e){
            //si la informacion es incorrecta saldra que hay un error de los datos
            JOptionPane.showMessageDialog(null,"error mostrar datos"+e.getMessage());
        }
    }
    
   
    
    
    
    

       
       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboAsignatura;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEstudiante;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
