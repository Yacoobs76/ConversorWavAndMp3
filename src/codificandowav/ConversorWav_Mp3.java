package codificandowav;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
/*

Programa echo por Yacoobs Cort. Mart. 11-2-2016
Este programa utiliza librerias externas jave-1.0.2 que es un Encoder Wav.
http://www.sauronsoftware.it/projects/jave/manual.php?PHPSESSID=fhdmi4skole9o1bavo160k7mr2

Y la libreria BasicPlayer 3 que se encarga de reproducir audio Wav y mp3.
http://www.javazoom.net/jlgui/api.html
*/


public class ConversorWav_Mp3 extends javax.swing.JFrame {

    
    public ConversorWav_Mp3() {
        
        initComponents();
        setLocation(100, 100);
        setTitle(titulo);
        jLabel5.setText(titulo);
        
        transparencia(130);
        
        String BitRate[] = {"4 kbit/s","32 kbit/s","96 kbit/s","128 kbit/s","192 kbit/s","320 kbit/s"}; 
        String SampleRate[] = {"11025","16000","22050","32000","44100","48000"};
        for (String bit:BitRate){
            jComboBoxbitRate.addItem(bit);
        }
        for (String bit:SampleRate){
            jComboBoxSampleRate.addItem(bit);
        }
               
        jSlider1.setMinimum(0);
        jSlider1.setMaximum(255);
        jSlider1.setValue(130);
        
        file_Archivo = new File(Ruta_Archivo);

        jScrollPane1.getViewport().setOpaque(false);
        //Este metodo establece el delegado que se utiliza para pintar cada celda de la lista.
        jListLista.setCellRenderer(new jListTransparente());
        
        new Introducir_Datos_JList(exten,exten2, DatosLista, ListaArchivos, Ruta_Archivo, jListLista);
        
        new JBotonesListener(jButtonExplorar, "/ButtonIcons/DirectorioP.png","/ButtonIcons/Directorio.png");
        new JBotonesListener(jButtonDetener, "/ButtonIcons/PararP.png","/ButtonIcons/Parar.png");
        new JBotonesListener(jButtonEliminar, "/ButtonIcons/BorrarP.png", "/ButtonIcons/Borrar.png");
        new JBotonesListener(jButtonConvertir, "/ButtonIcons/ConvertirP.png", "/ButtonIcons/Convertir.png");
        new JBotonesListener(jButtonExplorar_Guardado, "/ButtonIcons/RutaP.png", "/ButtonIcons/Ruta.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxbitRate = new javax.swing.JComboBox<>();
        jComboBoxSampleRate = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLista = new javax.swing.JList<>();
        jButtonExplorar = new javax.swing.JButton();
        jButtonDetener = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonConvertir = new javax.swing.JButton();
        jButtonExplorar_Guardado = new javax.swing.JButton();
        jLabelfondoBotones = new javax.swing.JLabel();
        jTextFieldNombre_Archivo = new javax.swing.JTextField();
        jTextFieldRuta = new javax.swing.JTextField();
        jTextFieldRutaGuardado = new javax.swing.JTextField();
        jLabelTemaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 430));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxbitRate.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jComboBoxbitRate.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxbitRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxbitRateActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxbitRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, -1));

        jComboBoxSampleRate.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jComboBoxSampleRate.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxSampleRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSampleRateActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxSampleRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 100, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("2 Canales");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jSlider1.setPaintTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 46, 360, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre Archivo:");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Archivo Comp.");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 51));
        jLabel3.setText(".mp3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ruta Guardado:");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 153));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 190, 10));

        jScrollPane1.setOpaque(false);

        jListLista.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jListLista.setForeground(new java.awt.Color(255, 204, 102));
        jListLista.setSelectionBackground(new java.awt.Color(255, 204, 255));
        jListLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListLista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 240));

        jButtonExplorar.setBorderPainted(false);
        jButtonExplorar.setContentAreaFilled(false);
        jButtonExplorar.setFocusable(false);
        jButtonExplorar.setPreferredSize(new java.awt.Dimension(40, 40));
        jButtonExplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExplorarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExplorar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jButtonDetener.setBorderPainted(false);
        jButtonDetener.setContentAreaFilled(false);
        jButtonDetener.setFocusable(false);
        jButtonDetener.setPreferredSize(new java.awt.Dimension(40, 40));
        jButtonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetenerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonIcons/BorrarP.png"))); // NOI18N
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.setFocusable(false);
        jButtonEliminar.setPreferredSize(new java.awt.Dimension(40, 40));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jButtonConvertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonIcons/ConvertirP.png"))); // NOI18N
        jButtonConvertir.setBorderPainted(false);
        jButtonConvertir.setContentAreaFilled(false);
        jButtonConvertir.setFocusable(false);
        jButtonConvertir.setPreferredSize(new java.awt.Dimension(136, 59));
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jButtonExplorar_Guardado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonIcons/RutaP.png"))); // NOI18N
        jButtonExplorar_Guardado.setBorderPainted(false);
        jButtonExplorar_Guardado.setContentAreaFilled(false);
        jButtonExplorar_Guardado.setFocusPainted(false);
        jButtonExplorar_Guardado.setPreferredSize(new java.awt.Dimension(40, 40));
        jButtonExplorar_Guardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExplorar_GuardadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExplorar_Guardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        jLabelfondoBotones.setOpaque(true);
        getContentPane().add(jLabelfondoBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 90, 390));

        jTextFieldNombre_Archivo.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextFieldNombre_Archivo.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre_Archivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombre_ArchivoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre_Archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 210, -1));

        jTextFieldRuta.setEditable(false);
        jTextFieldRuta.setFont(new java.awt.Font("Source Code Pro Black", 3, 10)); // NOI18N
        jTextFieldRuta.setForeground(new java.awt.Color(255, 204, 102));
        getContentPane().add(jTextFieldRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 230, -1));

        jTextFieldRutaGuardado.setEditable(false);
        jTextFieldRutaGuardado.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextFieldRutaGuardado.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldRutaGuardado.setFocusable(false);
        getContentPane().add(jTextFieldRutaGuardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 210, -1));

        jLabelTemaFondo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTemaFondo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabelTemaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExplorarActionPerformed
        // TODO add your handling code here:
        
        JFileChooser JF = new JFileChooser(Ruta_Archivo);
        JF.setCurrentDirectory(new File(Ruta_Archivo));
        JF.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        if (JF.showOpenDialog(this)==0){
            String rutaD = JF.getSelectedFile().toString();
            new Introducir_Datos_JList(exten, exten2, DatosLista, ListaArchivos,rutaD , jListLista);
            
        }
        
    }//GEN-LAST:event_jButtonExplorarActionPerformed

    private void jButtonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetenerActionPerformed
        // TODO add your handling code here:
        try{
            
            R_A_B.DetenerAudio();
            
        }catch(NullPointerException ex){
            System.out.println("Error Clase ConversorWav_Mp3 No hay aido en reproduccion... " + ex);
        }
        
        
    }//GEN-LAST:event_jButtonDetenerActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        
        String obtener = jListLista.getSelectedValue();
        try{
        
        File file = new File(obtener);
        
        if (file.exists()){
            int accion = JOptionPane.showConfirmDialog(this, "Estas seguro de Borrar el archivo \n"+file, "Aviso", 2);
            
            if (accion==0){
                file.delete();
                //System.out.println("Borrando.....");
                new Introducir_Datos_JList(exten, exten2, DatosLista, ListaArchivos, Ruta_Archivo, jListLista);
            }
            //System.out.println(accion);
        }
        
        }catch(NullPointerException ex){
            
            System.out.println("Error en la Clase ConversorWav_Mp3: " + ex);     
                    
        }
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        // TODO add your handling code here:
       
        if (!jTextFieldRuta.getText().equals("") & !jTextFieldRutaGuardado.getText().equals("")){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    jButtonConvertir.setEnabled(false);
                    new CodificandoWav(jButtonConvertir,getComponent(0),archivoWav, archivoMp3, bitRate, canal, SampleRate);           
                    new Introducir_Datos_JList(exten, exten2, DatosLista, ListaArchivos, Ruta_Archivo, jListLista); 
                    
                }
            });
            t.start();
        }   
    }//GEN-LAST:event_jButtonConvertirActionPerformed

    private void jListListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListListaMouseClicked
          
        String ruta = jListLista.getSelectedValue();
        String Resultado;
        try{
            
            int Cantidad = ruta.length();
            Resultado = ruta.substring(Cantidad-3,Cantidad);
            
        }catch(NullPointerException ex){
            
            System.out.println("Error en la Clase ConversorWav_Mp3: " + ex);
            
            Resultado = "";
        }
        
        
        
        
        
        if (evt.getClickCount()==1 & !Resultado.equals(exten2)){
            
            jTextFieldRuta.setText(ruta);
            archivoWav = ruta;
            botonConvertir();
        } 
        if (evt.getClickCount()==2 & detener_Audio){
            detener_Audio = false;
            R_A_B = new Reproduce_Audio_BasicPlayer(ruta);
            
            
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    boolean estado_cancion=false;
                    
                    while(!estado_cancion){
                        try {
                            estado_cancion =  R_A_B.isDetener();
                            //System.out.println(estado_cancion);
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ConversorWav_Mp3.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                detener_Audio=true;
                
                }
            });  
            t.start();
        }
    }//GEN-LAST:event_jListListaMouseClicked

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        //System.out.println(jSlider1.getValue());
        transparencia(jSlider1.getValue());      
    }//GEN-LAST:event_jSlider1StateChanged

    private void jTextFieldNombre_ArchivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombre_ArchivoKeyPressed
        // TODO add your handling code here:     
        //System.out.println(evt.getKeyCode());
        String obtener = jTextFieldNombre_Archivo.getText();
        if (evt.getKeyCode()==10 & !obtener.equals("")){
            
            String R_archivo = file_Archivo + "\\"+jTextFieldNombre_Archivo.getText()+".mp3";
            archivoMp3 = R_archivo;
            jTextFieldRutaGuardado.setText(R_archivo);
            botonConvertir();
        }
        
    }//GEN-LAST:event_jTextFieldNombre_ArchivoKeyPressed

    private void jButtonExplorar_GuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExplorar_GuardadoActionPerformed
        // TODO add your handling code here:
        JFileChooser JF = new JFileChooser(Ruta_Archivo);
        JF.setCurrentDirectory(new File(Ruta_Archivo));
        JF.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        String obtenerTexto = jTextFieldNombre_Archivo.getText();
        String asignar;
        if (JF.showOpenDialog(this)==0){
            
            if (obtenerTexto.equals("")){
                asignar = "sinNombre.mp3";
            }else {
                asignar = obtenerTexto+".mp3";               
            }
                file_Archivo = JF.getSelectedFile();
                archivoMp3 = file_Archivo+"\\"+asignar;
                jTextFieldRutaGuardado.setText(archivoMp3);
                botonConvertir();
                       
        }
        
    }//GEN-LAST:event_jButtonExplorar_GuardadoActionPerformed

    private void jComboBoxbitRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxbitRateActionPerformed
        // TODO add your handling code here:
       
        switch(jComboBoxbitRate.getSelectedIndex()){
            case 0:bitRate="4000";
                break;
                case 1:
                bitRate="32000";
                break;
                case 2:
                bitRate="96000";
                break;
                case 3:
                bitRate="128000";
                break;
                case 4:
                bitRate="192000";
                break;
                case 5:
                bitRate="320000";
                break;      
        }
        //System.out.println(bitRate);
    }//GEN-LAST:event_jComboBoxbitRateActionPerformed

    private void jComboBoxSampleRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSampleRateActionPerformed
        // TODO add your handling code here:     
        SampleRate = jComboBoxSampleRate.getSelectedItem().toString();
        //System.out.println(SampleRate);
    }//GEN-LAST:event_jComboBoxSampleRateActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        //System.out.println(jCheckBox1.isSelected());
        if (jCheckBox1.isSelected()){
            canal = "2";
        }else {
            canal = "1";
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    public class jListTransparente extends DefaultListCellRenderer {
        public Component getListCellRendererComponent(JList<?> lista, Object value, int index, 
                boolean isSelected, boolean cellHasFocus) { 
            //http://stackoverflow.com/questions/30339103/transparent-jlist-in-jscrollpane-all-in-one-class
            
            super.getListCellRendererComponent(lista, value, index, isSelected, cellHasFocus);       
            setOpaque(isSelected); 
            transparencia(jSlider1.getValue());
            return this;            
    }       
}
    
    
    public void transparencia(int seleccion){
        jListLista.setBackground(new Color(140,140,140, seleccion));
        
        jTextFieldNombre_Archivo.setBackground(new Color(140,140,140, seleccion));
        jTextFieldRuta.setBackground(new Color(140,140,140, seleccion));
        jTextFieldRutaGuardado.setBackground(new Color(140,140,140, seleccion));
        
        jComboBoxbitRate.setBackground(new Color(140,140,140,seleccion));
        jComboBoxSampleRate.setBackground(new Color(140,140,140,seleccion));
        
        jLabel1.setBackground(new Color(140,140,140, 130));
        jLabel2.setBackground(new Color(140,140,140, 130));
        jLabel4.setBackground(new Color(140,140,140, 130));
        jLabelfondoBotones.setBackground(new Color(140,140,140, seleccion));
        
        repaint();
    }
   
    public void botonConvertir(){
        //System.out.println(archivoWav);
        //System.out.println(archivoMp3);
        //System.out.println("La Ruta archivo es: "+Ruta_Archivo);
        if (archivoMp3!=null & archivoWav!=null){
            new JBotonesListener(jButtonConvertir, "/ButtonIcons/ConvertirAP.png", "/ButtonIcons/ConvertirA.png");
            jButtonConvertir.setIcon(new ImageIcon(getClass().getResource("/ButtonIcons/ConvertirAP.png")));
            //System.out.println("Ejecutando");
        }  
    }
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorWav_Mp3().setVisible(true);
            }
        });
    }
    
    
    
    //Variables privadas del programa...
    private String titulo="Conversor Wav & Mp3 V0.1";
    private boolean detener_Audio=true;
    private Reproduce_Audio_BasicPlayer R_A_B;
    private String archivoWav,archivoMp3,bitRate,canal ="2",SampleRate;
    private File file_Archivo;
    private String [] ListaArchivos;
    private ArrayList<String> DatosLista = new ArrayList();
    private String Ruta_Archivo = "C:/musica";
    private String exten = "wav";
    private String exten2 = "mp3";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JButton jButtonDetener;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonExplorar;
    private javax.swing.JButton jButtonExplorar_Guardado;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBoxSampleRate;
    private javax.swing.JComboBox<String> jComboBoxbitRate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTemaFondo;
    private javax.swing.JLabel jLabelfondoBotones;
    private javax.swing.JList<String> jListLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextFieldNombre_Archivo;
    private javax.swing.JTextField jTextFieldRuta;
    private javax.swing.JTextField jTextFieldRutaGuardado;
    // End of variables declaration//GEN-END:variables
}
