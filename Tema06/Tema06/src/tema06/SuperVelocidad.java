package tema06;

/**
 * Las interfaces estableces QUÉ hacen los objetos
 * pero NO CÓMO lo hacen. 
 * 
 * En una interfaz, todos los métodos son abstractos, 
 * es decir, se declaran (public [tipo de dato] [nombre] ([parámetros]), 
 * pero no tienen cuerpo ( { código entre las llaves } ).
 * 
 * En nuestro ejemplo, cada interfaz es un súperpoder
 * que los héroes pueden adoptar. Si adoptan el súperpoder,
 * obtienen las habilidades establecidas en ese súperpoder.
 * 
 * @author d3stroya
 */
public interface SuperVelocidad {
    public void correrRapido(int velocidad);
    public void atravesarObjetos(String objeto);
}
