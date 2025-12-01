package tema06;

/**
 * Subclase que extiende la funcionalidad de Superheroe.
 * Está obligada a sobreescribir el método entrenar(), que es abstracto.
 * No puede sobreescribir el método presentarse(), que es final.
 * 
 * Sus características (atributos) son: nombre (heredada) y velocidadMaxima (propia).
 * Por defecto, su velocidad máxima será de 1000km/h.
 * Entrena corriendo 100km a 20km/h.
 * 
 * Además, implementa la interfaz SuperVelocidad,
 * por lo que está obligada a implementar los métodos
 * declarados en la interfaz (correrRapido y atravesarObjetos).
 * 
 * Para implementar una interfaz, usamos la palabra reservada 'implements'.
 * 
 * Podemos implementar varias interfaces separándolas por comas.
 * 
 * @author d3stroya
 */
public class Flash extends Superheroe implements SuperVelocidad, Defensa {
    // ATRIBUTOS
    private int velocidadMaxima;

    // CONSTRUCTORES
    public Flash() {
        super();
        this.velocidadMaxima = 1000;
    }
    
    public Flash(String nombre, int velocidadMaxima) {
        super(nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    // GETTERS Y SETTERS
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // MÉTODOS
    // Método abstraco de su superclase implementado
    @Override
    public void entrenar() {
        System.out.println("\n - ENTRENAMIENTO DE " + super.getNombre() + " -");
        System.out.println("Correr 100km a 20km/h");
    }
    
    // Método propio
    public void dejarEstela() {
        System.out.println("               __");
        System.out.println("          _.-'  '--._");
        System.out.println("       .-'  ⚡ FLASH  '-.");
        System.out.println("-----/  SPEED TRAIL ----====================>>>");
        System.out.println("       '-.        .-'");
        System.out.println("          '--.__.--'");
    }
    
    
    
    
    // Métodos de la interfaz SuperVelocidad implementados
    @Override
    public void correrRapido(int velocidad) {
        if(velocidad < velocidadMaxima) {
            System.out.println("Flash: Estoy corriendo a " + velocidad + "km/h.");            
        } else {
            System.out.println("Flash: No puedo correr tan rápido.");
            System.out.println("Mi velocidad máxima es " + velocidadMaxima);
        }
    }
    
    @Override
    public void atravesarObjetos(String objeto) {
        System.out.println("Flash: Estoy atravesando " + objeto + "...");
    }
    
    
    
    
    
    // Método de la interfaz Defensa implementado
    @Override
    public void defenderse() {
        System.out.println("Flash: ¡Esquivo ataques a la velocidad del rayo!");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Superhéroe Flash" +
                "\n · Nombre: " + super.getNombre() +
                "\n · Velocidad Máxima:" + velocidadMaxima;
    }
    
}
