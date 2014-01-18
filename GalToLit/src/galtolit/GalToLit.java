/*
 * Try This 1-1
 * This program converts a the number
 * of gallons into the number of liters
 */

package galtolit;

/**
 *Call this program GalToLit.java
 * @author Janis
 */
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double gallons; // contains number of gallons
        double liters; // contains number of liters
        
         gallons = 10; //initializes gallons
        liters = gallons * 3.8754; // initiallizes liters with converted amount
        
        // output conversion results to the screen
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
    
}


