package com.mycompany.condicionescompetencias;
import javax.swing.*;

public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    
    Hilo(JTextArea area, RCompartido rc){
        this.area =area;
        this.rc=rc;
    }
    
    public void run(){
        while(true){
            try{
                rc.setDatoCompartido(this.getName());
                area.append(rc.getDatoCompartido()+"\n");
                sleep(1500);
             }catch(Exception e){
                 e.printStackTrace();
             }
        }
    }    
}
