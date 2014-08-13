import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Principal   {
private final String ruta;
Player player;
    public Principal(String f) {
      ruta=f;
      
    }
    /**
     *
     */
    public void sonar(){
        try {
            FileInputStream fis;
            //Player player;
            fis = new FileInputStream(ruta);
            BufferedInputStream bis = new BufferedInputStream(fis);

            player = new Player(bis); // Llamada a constructor de la clase Pla
         //   Thread hilo1=new Proceso2("proceso 2",this);
         //   hilo1.start();
            
            player.play(); // Llamada al método play
            
                                        
        } catch (JavaLayerException | FileNotFoundException e) {
            System.out.println("no sirve");//e.printStackTrace();
        }
     }
     public void detener(){
     try{
         player.close();
         
     }catch(Exception e){
     System.out.println("no sirve");
     }
     }

}


