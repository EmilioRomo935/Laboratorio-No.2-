/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author Emiro
 */
public class VideoGames extends Media{
    private String ambientacion;

    public VideoGames(String ambientacion, String title, String creator) {
        super(title, creator);
        setAmbientacion(ambientacion);   
    }

    public String getAmbientacion() {
        return ambientacion;
    }

    public void setAmbientacion(String Ambientacion) {
        this.ambientacion = Ambientacion;
    }
    
    @Override
    public void play() {
        System.out.println("Play " + getTitle() + " from the developer " + getCreator() + " with a setting of " + ambientacion +".");
    }
}
