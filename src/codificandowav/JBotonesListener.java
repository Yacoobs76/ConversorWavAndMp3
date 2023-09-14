
package codificandowav;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class JBotonesListener {

    public JBotonesListener(JButton Boton,String image1, String image2)  {
      
        Boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                
                Boton.setIcon(new ImageIcon(getClass().getResource(image1)));
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
               Boton.setIcon(new ImageIcon(getClass().getResource(image2)));         
            }
            
            
        });
                     
    }
}
