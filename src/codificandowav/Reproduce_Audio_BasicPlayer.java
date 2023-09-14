
package codificandowav;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/*
Esta clase se encargara de la reproduccion de archivos en mp3 o wav, utiliza la libreria Basic Player
*/

public class Reproduce_Audio_BasicPlayer {

    public Reproduce_Audio_BasicPlayer(String ruta) {

        try {
            ReproducirPlayer.open(new File(ruta));
            ReproducirPlayer.play();
            Detener=false;
            
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                  
                    while (ReproducirPlayer.getStatus()!=2) {
                        //System.out.println(ReproducirPlayer.getStatus());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException | NullPointerException ex) {
                            Logger.getLogger(Reproduce_Audio_BasicPlayer.class.getName()).log(Level.SEVERE, null, ex);
                        }                                              
                    }
                   //System.out.println("Cancion finalizada...."); 
                    Detener=true;
                    
                }
            });
            t.start();  
        } catch (BasicPlayerException | NullPointerException ex) {
            //Logger.getLogger(Reproduce_Audio_BasicPlayer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en la clase Reproduce_Audio... No hay audio en la lista que reproducir : " + ex);
        }  
    }
    public void DetenerAudio(){
        try {
            ReproducirPlayer.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Reproduce_Audio_BasicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private boolean Detener;

    public boolean isDetener() {
        return Detener;
    }
    private BasicPlayer ReproducirPlayer = new BasicPlayer();
    
}
