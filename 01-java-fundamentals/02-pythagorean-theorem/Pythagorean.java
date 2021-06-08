import java.util.Scanner;
/* Figure out how to do a user-inputted values */
public class Pythagorean {
    public double calculateHypotenuse(double legA, double legB) {
        // double c = Math.sqrt(legA^2+legB^2);
        double legC = Math.sqrt(legA*legA+legB*legB);
        return legC;
    }
}