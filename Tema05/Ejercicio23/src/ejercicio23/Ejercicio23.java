package ejercicio23;


/**
 *
 * @author d3stroya
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("44444RRRR", "Golf", 120);
        System.out.println(vehiculo);
        
        Taxi taxiParametrizado = new Taxi("1234AAA", "Polo", 90, 23541425);
        System.out.println(taxiParametrizado);
        
        Taxi taxiPordefecto = new Taxi();
        System.out.println(taxiPordefecto);
        taxiPordefecto.setModelo("Megane");
        taxiPordefecto.setMatricula("1111VVV");
        taxiPordefecto.setPotencia(130);
        taxiPordefecto.setNumeroLicencia(24524525);
        System.out.println(taxiPordefecto);
        
    }    

}
