package splitstringintopairs;

import java.util.Arrays;


/**
 *
 * @author d3stroya
 */
public class SplitStringIntoPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "abcde";
        String s1 = "LovePizza";
        
        System.out.println(Arrays.toString(solution(s1)));
        
    }    
    
    public static String[] solution(String s) {              
        String[] result;
        int size = s.length();
        int j = 0;
                
        // Si la longitud es impar, añado un _ al final e incremento la longitud en 1
        if(size % 2 != 0) {
            s = s.concat("_");
            size++;
        }
        
        result = new String[size / 2];
        
        // Recorro el string y añado los caracteres por pares
        for(int i = 0; i < result.length; i++) {                
            result[i] = s.substring(j, j + 2);
            j += 2;
        }
        
        return result;
    }

}
