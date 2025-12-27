
 package donacionesdana;

/**
 *
 * @author d3stroya
 */
public class Entrega {
    private String producto;
    private int hora;
    private PuntoRecogida puntoEntrega;

    public Entrega() {
        this.producto = "";
        this.hora = 0;
        this.puntoEntrega = new PuntoRecogida();
    }
    
    public Entrega(String producto, int hora, String email, PuntoRecogida puntoEntrega) {
        this.producto = producto;
        this.hora = hora;
        this.puntoEntrega = puntoEntrega;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public PuntoRecogida getPuntoEntrega() {
        return puntoEntrega;
    }

    public void setPuntoEntrega(PuntoRecogida puntoEntrega) {
        this.puntoEntrega = puntoEntrega;
    }        

    @Override
    public String toString() {
        return "Entrega:\n  · Producto: " + producto + "\n  · Hora: " + hora + "h\n  · Punto de Entrega: " + puntoEntrega;
    }           
    
}
