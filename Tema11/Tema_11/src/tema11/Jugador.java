package tema11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author d3stroya
 */
public class Jugador {
    // ATRIBUTOS
    private int id;
    private String nickname;
    private int edad;
    private Set<String> juegosFav;

    // CONSTRUCTORES
    public Jugador() {
        this.id = 0;
        this.nickname = "";
        this.edad = 0;
        this.juegosFav = new HashSet<>();
    }
    
    public Jugador(int id, String nickname, int edad) {
        this.id = id;
        this.nickname = nickname;
        this.edad = edad;
        this.juegosFav = new HashSet<>();
    }
    
    public Jugador(int id, String nickname, int edad, Set<String> juegosFav) {
        this.id = id;
        this.nickname = nickname;
        this.edad = edad;
        this.juegosFav = juegosFav;
    }

    // GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Set<String> getJuegosFav() {
        return juegosFav;
    }

    public void setJuegosFav(Set<String> juegosFav) {
        this.juegosFav = juegosFav;
    }


    // MÉTODOS
    private String pedirJuego() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del juego: ");
        return entrada.nextLine();
    }
    
    public void insertarJuegoFav() {
        juegosFav.add(pedirJuego());
    }

    // TO STRING
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nickname=" + nickname + ", edad=" + edad + ", juegosFav=" + juegosFav + '}';
    }


}
