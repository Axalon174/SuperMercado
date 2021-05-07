
import java.util.Date;


public class Historial {
    private int cantidadCompra;
    private int codigoProducto;
    // date es una clase
    private Date fechaCompra = new Date();
    
    
    private int numCompra;

    
    
    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    @Override
    public String toString() {
        return "Hiistorial{" + "cantidadCompra=" + cantidadCompra + ", codigoProducto=" + codigoProducto + ", fechaCompra=" + fechaCompra + ", numCompra=" + numCompra + '}';
    }
    
    
    
    
}
