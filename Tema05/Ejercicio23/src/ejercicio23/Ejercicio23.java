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
        // 1.1. Creo un taxi con el constructor parametrizado
        Taxi taxiParametrizado = new Taxi("1234AAA", "Polo", 90, 23541425);
        System.out.println(taxiParametrizado);
        
        // 2.1. Creo un autobús con el constructor parametriado
        Autobus autobusParametrizado = new Autobus("8765TTT", "Citaro", 130, 50);
        System.out.println(autobusParametrizado);
                
        // 1.2. Creo un taxi con el constructor por defecto 
        // y establezco los valores de los atributos con los setters
        Taxi taxiPordefecto = new Taxi();
        taxiPordefecto.setModelo("Megane");
        taxiPordefecto.setMatricula("1111VVV");
        taxiPordefecto.setPotencia(130);
        taxiPordefecto.setNumeroLicencia(24524525);
        System.out.println(taxiPordefecto);
        
        // 2.2. Creo un autobús con el constructor por defecto 
        // y establezco los valores de los atributos con los setters
        Autobus autobusPorDefecto = new Autobus();
        autobusPorDefecto.setMatricula("4957AGB");
        autobusPorDefecto.setModelo("Tourismo");
        autobusPorDefecto.setPotencia(150);
        autobusPorDefecto.setNumeroPlazas(43);
        System.out.println(autobusPorDefecto);
    }    

}
