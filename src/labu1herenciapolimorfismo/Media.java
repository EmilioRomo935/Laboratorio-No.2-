/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author alopezorozco
 */
public class Media {
    
    // TODO 1: Crea los campos titulo y autor de tipo String
    // y privados
    private String title;
    private String creator;

    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    // TODO 2: Crea los getter y setter para los campos
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }  
    
    // TODO 4: Crea un método llamado play(), público de tipo void
    // este método tiene la siguiente instrucción.
    // System.out.println("Playing: " + title + " by " + creator);  
    public void play(){
        System.out.println("Playing: " + title + " by " + creator);  
    } 
}
