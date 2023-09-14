
package codificandowav;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;
import java.awt.Component;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class CodificandoWav {

    public CodificandoWav(JButton boton,Component componente, String archivoWav,String archivoMp3,String bitRate,
            String canal,String SampleRate) {
        
        System.out.println("ArchivoWav: "+archivoWav+"\n"+"ArchivoMp3: "+ archivoMp3+"\n"+"BitRate: "+bitRate+"\n"+"Canal: "+canal
        +"\n"+"SampleRate: "+SampleRate);
        File source = new File(archivoWav); //Aqui va el nombre del archivo wav
        File target = new File(archivoMp3); //Aqui va el nombre del archivo mp3
        
        //Una clase para encapsular una colección de atributos que describen información sobre un flujo de audio.
        //http://jcs.mobile-utopia.com/jcs/31336_AudioAttributes.html
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(bitRate));             //BitRate  92000
        audio.setChannels(new Integer(canal));              //Canales de Audio
        audio.setSamplingRate(new Integer(SampleRate));     //SampleRate 44100
        
        //Clase Atributos que controlan el proceso de codificación.
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        
        //Esta clase se encargara de codificar el audio de Wav a mp3.....       
        Encoder encoder = new Encoder();
        try {
            
            encoder.encode(source, target, attrs);
            boton.setEnabled(true);
            JOptionPane.showMessageDialog(componente, "Conversion a Wav Finalizada \n "+ archivoMp3);            
    
        } catch (InputFormatException ex){
            System.out.println("El archivo no existe");
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(CodificandoWav.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EncoderException ex) {
            Logger.getLogger(CodificandoWav.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

