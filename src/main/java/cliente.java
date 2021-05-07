
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user01
 */
public class cliente {
    private String nombre;
    private String RFC;
    private ArrayList <Historial> historial = new ArrayList<Historial>();

    public cliente(String nombre, String RFC){
    this.nombre = nombre;
    this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public ArrayList<Historial> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Historial> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", RFC=" + RFC + ", historial=" + historial + '}';
    }
    
}
