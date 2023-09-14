
package codificandowav;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JList;


public class Introducir_Datos_JList {

/*
    Esta Clase se encarga de introducir y filtrar los datos obtenidos por un 
    Array String y finalmente imprimir los en el JList
 */
    
    public Introducir_Datos_JList(String exten, String exten2, ArrayList<String> datos_lista,
            String[]list_audio,String Ruta_archivo, JList<String> jListlista) {
    
        //System.out.println("La Ruta archivo es: "+Ruta_archivo);
        File archivos = new File(Ruta_archivo);
        list_audio = new String[0];
        datos_lista.clear();

        list_audio = archivos.list();

        try{
            
            for (String objeto : list_audio) {
                
                String extension = objeto.substring(objeto.length()-3,objeto.length());
                
                if (extension.equals(exten) | extension.equals(exten2)) {
                    
                    datos_lista.add(Ruta_archivo+"/"+objeto);
        
                }              
            }
        }catch(NullPointerException ex){
            System.out.println("Error en la clase Introducir_Datos_JList " + ex);
        }
        
        
    list_audio = new String[datos_lista.size()];
    int x=0;
     for (String anade:datos_lista){
         File file = new File(anade);		
         list_audio[x]=file.toString();
         x++;      
     }      
     jListlista.setListData(list_audio);
    }
}
