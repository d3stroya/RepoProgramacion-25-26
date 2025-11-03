package tema4;

/**
 *
 * @author d3stroya
 */
public class Calculadora {
    /**
     * Método que devuelve la suma de dos números
     * pasados por parámetro.
     * @param num1
     * @param num2
     * @return la suma de los dos números
     */
    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
    
    /**
     * Método que resta dos números pasados por parámetro     
     * @param num1
     * @param num2     
     * @return la resta de los dos números
     */
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
    
    /**
     * Método que multiplica los dos números pasados por parámetro
     * 
     * @param num1
     * @param num2
     * 
     * @return el producto de los dos números
     */
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    
    /**
     * Método que divide los dos números pasados por parámetro
     * 
     * @param num1
     * @param num2
     * 
     * @return la división de los dos números
     */
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
    
    // MÉTODOS ESTÁTICOS DE LA CASE MATH
    /**
     * Método que calcula la raíz cuadrada 
     * del número pasado por parámetro
     * 
     * @param num
     * @return la raíz cuadrada
     */
    public static double raizCuadrada(int num) {
        return Math.sqrt(num);
    }
    
    /**
     * Métood que deuvelve el cuadrado
     * del número pasado por parámetro.
     * 
     * @param num
     * @return el cuadrado
     */
    public static double cuadrado(int num) {
        return Math.pow(num, 2);
    }
    
    /**
     * Método que devuelve el cubo
     * del número pasado por parámetro.
     * 
     * @param num
     * @return el cubo
     */
    public static double cubo(int num) {
        return Math.pow(num, 3);
    }
    
    /**
     * Método que devuelve el número pasado por parámetro
     * redondeado a la baja.
     * 
     * @param num
     * @return el número redodeado a la baja
     */
    public static double redondeoBajo(double num) {
        return Math.floor(num);
    }
    
    /**
     * Método que devuelve el número pasado por parámetro
     * redondeado al alza.
     * 
     * @param num
     * @return el número redodeado al alza
     */
    public static double redondeoAlto(double num) {
        return Math.ceil(num);
    }
    
    /**
     * Método que devuelve el logaritmo
     * del número pasado por parámetro.
     * 
     * @param num
     * @return el resultado del logaritmo del número
     */
    public static double logaritmo(int num) {
        return Math.log(num);
    }
    
    /**
     * Método que devuelve el valor máximo
     * de los dos pasados por parámetro.
     * 
     * @param num1
     * @param num2    
     * @return el valor mayor
     */
    public static int valorMaximo(int num1, int num2) {
        return Math.max(num1, num2);
    }
    
    /**
     * Método que devuelve el valor mínimo
     * de los dos pasados por parámetro.
     * 
     * @param num1
     * @param num2
     * @return el valor menor
     */
    public static int valorMinimo(int num1, int num2) {
        return Math.min(num1, num2);
    }
        
}
