
 package donacionesdana;

/**
 *
 * @author d3stroya
 */
public class PuntoRecogida {
    private String calle;
    private int numero;
    private int codigoPostal;
    private int horaApertura;
    private int horaCierre;

    public PuntoRecogida() {
        this.calle = "";
        this.numero = 0;
        this.codigoPostal = 0;
        this.horaApertura = 0;
        this.horaCierre = 0;
    }
    public PuntoRecogida(String calle, int numero, int codigoPostal, int horarioApertura, int horarioCierre) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.horaApertura = horarioApertura;
        this.horaCierre = horarioCierre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getHorarioApertura() {
        return horaApertura;
    }

    public void setHorarioApertura(int horarioApertura) {
        this.horaApertura = horarioApertura;
    }

    public int getHorarioCierre() {
        return horaCierre;
    }

    public void setHorarioCierre(int horarioCierre) {
        this.horaCierre = horarioCierre;
    }        

    @Override
    public String toString() {
        return calle + ", " + numero + ". CP:" + codigoPostal + ". Horario: " + horaApertura + "h - " + horaCierre + "h";
    }
    
    
}
