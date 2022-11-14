import java.util.Scanner;
import static java.lang.Math.PI;


public class CircumferenceOfCircle {

    //Declaration of method for text command

    public static void text ( String txt ) { System.out.println ( txt ); }



    //Declaration of main method

    public static void main ( String[] args ) {

        //Declaration of Scanner

        Scanner scanner = new Scanner ( System.in );

        //Declaration of gathering input

        text ( "Input radius of the circle (cm or inches): " );

        double radius = scanner.nextDouble ( );

        //Calculation

        double circumfence = 2 * radius * PI;

        //Print

            System.out.println ( "Circumference of the circle with radius " + radius + " is " + circumfence + " cm" );

    }
}
