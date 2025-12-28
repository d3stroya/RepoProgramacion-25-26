package jadensmithstweets;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author d3stroya
 */
public class JadenSmithTweets {

    public static String toJadenCase(String phrase) {
        String newPhrase;

        if (phrase == null) {
            newPhrase = null;
        } else if (phrase.equals("")) {
            newPhrase = null;
        } else {
            
            newPhrase = "";
            String[] subPhrases = phrase.split(" ");
            
            for (int i = 0; i < subPhrases.length; i++) {
                int indexFirstChar = findFirstChar(subPhrases[i]);
                
                newPhrase = addWorddWithCase(subPhrases, i, indexFirstChar, newPhrase);               
                
                if(i < subPhrases.length - 1) {
                    newPhrase += " ";
                }                    
            }
                        
        }

        return newPhrase;
    }

    /**
     * Create a newPhrase with first letter capitalized
     * @param subPhrases
     * @param i
     * @param indexFirstChar
     * @param newPhrase
     * @return the new String
     */
    public static String addWorddWithCase(String[] subPhrases, int i, int indexFirstChar, String newPhrase) {
        for(int j = 0; j < subPhrases[i].length(); j++) {
            if(j != indexFirstChar) {
                newPhrase += subPhrases[i].charAt(j);
            } else {
                newPhrase += (char)((int)(subPhrases[i].charAt(j)) - 32);
            }
            
        }
        return newPhrase;
    }

    /**
     * Is the char a letter?
     * Lower case ascii code is between 97 and 122.
     * 
     * @param letter
     * @return true if yes and false if no.
     */
    public static boolean isLetter(char letter) {        
        return (int) letter >= 97 && (int) letter <= 122;
    }

    /**
     * Finds the first letter and return its index
     * @param subPhrase
     * @return index of first letter
     */
    public static int findFirstChar(String subPhrase) {
        int index = 0;
        boolean found = false;

        while (index < subPhrase.length() && !found) {
            if (isLetter(subPhrase.charAt(index))) {
                found = true;
            } else {
                index++;
            }
        }

        return index;
    }

    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println(toJadenCase("[most trees are b]lue"));
    }

    
}
