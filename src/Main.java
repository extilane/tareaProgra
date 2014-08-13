/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guillermo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Principal p =new Principal("/mnt/hgfs/Ubunto/03 Obsesionario en LA Mayor.mp3");
       // p.sonar();
        Principal Objeto =new Principal("/mnt/hgfs/Ubunto/03 Obsesionario en LA Mayor.mp3");
        Thread hilo=new Proceso("proceso 1");
        //Thread hilo1=new Proceso2("proceso 2");
        
        hilo.start();
        //hilo1.start(); 
       
    }
    
}
