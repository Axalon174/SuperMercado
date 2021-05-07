
import java.util.ArrayList;


public class Cliente {
    private String nombre;
    private String RFC;
    //estructuras dinamicas
    private ArrayList <Historial> historial = new ArrayList <Historial>();

    public Cliente(String nombre, String RFC) {
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
        return "Cliente{" + "nombre=" + nombre + ", RFC=" + RFC + ", historial=" + historial + '}';
    }
    
    
    
    
}
