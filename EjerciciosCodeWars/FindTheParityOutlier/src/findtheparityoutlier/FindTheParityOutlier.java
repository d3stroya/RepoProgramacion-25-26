/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findtheparityoutlier;

/**
 *
 * @author Vírgula
 */
public class FindTheParityOutlier {

    static int find(int[] integers) {
        int[] aux = new int[integers.length];
        int differentNum;
        int index;

        calcModules(integers, aux);

        if (nIsOdd(aux)) {
            differentNum = 0;
        } else {
            differentNum = 1;
        }

        index = searchNModule(aux, differentNum);

        return integers[index];
    }

    /**
     * Fill an aux array with module of each number
     * @param integers
     * @param aux
     */
    public static void calcModules(int[] integers, int[] aux) {
        for (int i = 0; i < integers.length; i++) {
            aux[i] = Math.abs(integers[i] % 2);
        }
    }

    /**
     * Add every number of aux array. If the result is 1, the array is an array
     * of odd numbers and N is even; else, N es odd.
     *
     * @param aux
     * @return true if add is not 1.
     */
    public static boolean nIsOdd(int[] aux) {
        int add = 0;

        for (int i = 0; i < aux.length; i++) {
            add += aux[i];
        }

        return add != 1;
    }

    /**
     * Search the different number
     *
     * @param aux
     * @param nModule
     * @return the different number index.
     */
    public static int searchNModule(int[] aux, int nModule) {
        int i = 0;
        int index = -1;
        boolean found = false;

        while (i < aux.length && !found) {
            if (aux[i] == nModule) {
                found = true;
                index = i;
            } else {
                i++;
            }
        }

        return index;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] integers1 = {2, 6, 8, -10, 3};
        int[] integers2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] integers3 = {Integer.MAX_VALUE, 0, 1};
        int[] integers4 = {-32, -74, -1580, -3};

        System.out.println(find(integers1));
        System.out.println(find(integers2));
        System.out.println(find(integers3));
        System.out.println(find(integers4));
    }

}
