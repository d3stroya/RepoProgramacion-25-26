/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08arraysdeobjetos;

/**
 *
 * @author d3stroya
 */
public class Marcador implements Comparable<Marcador> {
    // ATRIBUTOS
    private String color;
    private float precio;
    
    // CONSTRUCTORES
    public Marcador() {
        this.color = "";
        this.precio = 0.0f;
    }
    
    public Marcador(String color, float precio) {
        this.color = color;
        this.precio = precio;
    }

    // GETTERS Y SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    // MÉTODO
    /**
     * Método que permite ordenar un array de marcadores
     * de menor a mayor en función de su precio
     * @param m
     * @return -1 si el precio del marcador actual es menor
     * que el marcador con el que comparamos,
     * 0 si los precios son iguales
     * y 1 si el marcador con el que comparamos
     * tiene un precio mayor.
     */
    @Override
    public int compareTo(Marcador m) {
        if(this.precio < m.precio) {
            return -1;
        } else if(this.precio == m.precio) {
            return 0;
        } else {
            return 1;
        }
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Marcador{" + "color=" + color + ", precio=" + precio + '}';
    }
    
}
