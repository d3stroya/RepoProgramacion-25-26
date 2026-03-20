package tresenraya;


/**
 *
 * @author d3stroya
 */
public class TresEnRaya {
    
    // 1. Comprobar 3 en raya de x (1) o O (2)
    // 1.1. Comprobar filas
    /**
     * Método que comprueba si hay 3 en raya en una fila.
     * 
     * @param matriz
     * @return el número que ha hecho 3 en raya (1 o 2) o -1 si no hay 3 en raya.
     */
    public static int comprobarFilas(int[][] matriz) {
        int i = 0;
        boolean enc = false;
        int resultado = -1;
        
        // Recorro cada fila
        while(i < matriz.length && !enc) {
            if(matriz[i][0] != 0 && matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2]) {
                resultado = matriz[i][0];
                enc = true;                
            } else {
                i++;
            }
            
        }
            
        return resultado;
    }
    
    // 1.2. Comprobar columnas
    /**
     * Método que comprueba si hay 3 en raya en una collumna.
     * 
     * @param matriz
     * @return el número que ha hecho 3 en raya (1 o 2) o -1 si no hay 3 en raya.
     */
    public static int comprobarColumnas(int[][] matriz) {
        int j = 0;
        boolean enc = false;
        int resultado = -1;
        
        // Recorro cada fila
        while(j < matriz[0].length && !enc) {
            if(matriz[0][j] != 0 && matriz[0][j] == matriz[1][j] && matriz[1][j] == matriz[2][j]) {
                resultado = matriz[0][j];
                enc = true;                
            } else {
                j++;
            }
            
        }
            
        return resultado;
    }
    
    // 1.3. Comprobar diagonales
    /**
     * Método que comprueba si hay 3 en raya en la diagonal
     * que va de izquierda a derecha.
     * 
     * @param matriz
     * @return el número que ha hecho 3 en raya (1 o 2) o -1 si no hay 3 en raya.
     */
    public static int comprobarDiagonal1(int[][] matriz) {
        int resultado = -1;
        if(matriz[0][0] != 0 && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]){
            resultado = matriz[0][0];
        }
        
        return resultado;
    }
    
    /**
     * Método que comprueba si hay 3 en raya
     * en la diagona que va de derecha a izquierda.
     * 
     * @param matriz
     * @return el número que ha hecho 3 en raya (1 o 2) o -1 si no hay 3 en raya.
     */
    public static int comprobarDiagonal2(int[][] matriz) {
        int resultado = -1;
        if(matriz[0][2] != 0 && matriz[0][2] == matriz[1][1] && matriz[1][1]  == matriz[2][0]){            
            resultado = matriz[0][2];
        }
        
        return resultado;
    }
    
    // 1.4. Comprobar ganador
    /**
     * Método que comprueba si hay 3 en raya.
     * 
     * @param matriz
     * @return el número ganador (1 o 2) o -1 si no hay 3 en raya.
     */
    public static int comprobarGanador(int[][] matriz) {
        int filas = comprobarFilas(matriz);
        int columnas = comprobarColumnas(matriz);
        int diagonal1 = comprobarDiagonal1(matriz);
        int diagonal2 = comprobarDiagonal2(matriz);
        int resultado = -1;
        
        if(filas != -1) {
            resultado = filas;
        } else if(columnas != -1) {
            resultado = columnas;
        } else if(diagonal1 != -1) {
            resultado = diagonal1;
        } else if(diagonal2 != -1) {
            resultado = diagonal2;
        }
        
        return resultado;
    }
    
    // 2. Comprobar si hay celdas vacías (0)
    /**
     * Método que busca un 0 en la matriz,
     * es decir, busca si hay alguna celda vacía.
     * 
     * @param matriz 
     * @return true si hay alguna celda vacía y false en caso contrario
     */
    public static boolean hayCeldaVacia(int[][] matriz) {
        int i = 0, j = 0;
        boolean enc = false;
        
        while(i < matriz.length && !enc) {
            j = 0;
            
            while (j < matriz[i].length && !enc) {                                
                if(matriz[i][j] == 0) {
                    enc = true;
                } else {
                    j++;
                }
            }
            
            if(!enc) {
                i++;                
            }
        }
        
        return enc;
    }
    
    // Comprobar si hay empate (no hay 0 pero tampoco ganador)
    public static int comprobarTablero(int[][] matriz) {
        int resultado = -1;
        
        if(!hayCeldaVacia(matriz) && comprobarGanador(matriz) == -1) {
            resultado = 0;
        } else if(comprobarGanador(matriz) != -1) {
            resultado = comprobarGanador(matriz);
        }
         
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matriz1 = {
                            {1, 2, 2},
                            {1, 1, 2},
                            {0, 1, 0}
        };
        
//        System.out.println(comprobarFila(matriz1));
//        System.out.println(comprobarColumna(matriz1));
//        System.out.println(comprobarDiagonal1(matriz1));
//        System.out.println(comprobarDiagonal2(matriz1));
        System.out.println(comprobarTablero(matriz1));
    }    

}
