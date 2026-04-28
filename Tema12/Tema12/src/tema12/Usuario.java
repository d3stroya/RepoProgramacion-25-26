package tema12;

import java.io.Serializable;

/**
 *
 * @author d3stroya
 */
public class Usuario implements Serializable {  // implementamos Serializable para poder escribir los objetos en el fichero
    // ATRIBUTOS
    private String nombre;
    private String email;
    private transient String clave; // Este atributo no se escribirá en el fichero

    // CONSTRUCTORES
    public Usuario() {
        this.nombre = "";
        this.email = "";
        this.clave = "";
    }

    public Usuario(String nombre, String email, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return "Usuario:\n · Nombre: " + nombre + "\n · Email: " + email + "\n · Clave: " + clave;
    }

}
