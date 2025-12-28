package eureka;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d3stroya
 */
public class Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Long> eurekas = sumDigPow(1, 10);    // {1, 2, 3, 4, 5, 6, 7, 8, 9}     
        System.out.println(eurekas.toString());
        
        eurekas = sumDigPow(1, 100);              // {1, 2, 3, 4, 5, 6, 7, 8, 9, 89}
        System.out.println(eurekas.toString());
        
        eurekas = sumDigPow(10, 100);           // {89}
        System.out.println(eurekas.toString());
        
        eurekas = sumDigPow(90, 100);           // {}
        System.out.println(eurekas.toString());
        
        eurekas = sumDigPow(90, 150);           // {135}
        System.out.println(eurekas.toString());
        
        eurekas = sumDigPow(50, 150);           // {89, 135}
        System.out.println(eurekas.toString());
        
        eurekas = sumDigPow(10, 150);           // {89, 135}
        System.out.println(eurekas.toString());
  
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();

        for (long i = a; i <= b; i++) {
            if (isEureka(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static boolean isEureka(long n) {
        long[] aN = splitN(n);
        long sum = 0;

        // Traverse the array and add each num rised to its index + 1
        for (int i = 0; i < aN.length; i++) {
            sum += Math.pow(aN[i], (i + 1));
        }

        return sum == n;
    }

    public static long[] splitN(long n) {
        int size = (int) (Math.log10(n) + 1);
        long[] aN = new long[size];
        int i = size - 1;

        while (n > 0) {
            aN[i] = n % 10;
            n /= 10;
            i--;
        }

        return aN;
    }

}
