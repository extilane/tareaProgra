/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guillermo
 */
public class Proceso extends Thread {
   Principal p;
   boolean i=true;
    public Proceso(String msg){
   super(msg);
   } 
   @Override
   public void run(){
       Principal p =new Principal("/mnt/hgfs/Ubunto/03 Obsesionario en LA Mayor.mp3");
        //Thread hilo1=new Proceso2("proceso 2");
        //hilo1.start();
        i=false;
        p.sonar();
        
        
        
        //p.detener();
   }
   
   public class Proceso2 extends Thread {

    public Proceso2(String msg){
   super(msg);
   
   } 
   @Override
   public void run(){
       try {
              //Principal p =new Principal("/mnt/hgfs/Ubunto/03 Obsesionario en LA Mayor.mp3");
           //sleep(20000);
           while(i){
           System.out.println("Hola");
         //  sleep(3);
           }
           p.detener();
           
           
       } catch (Exception e) {
           //hilo.stop();
           System.out.println("No sirve");
          // Logger.getLogger(Proceso2.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}

}
