import java.util.Scanner;
import static java.lang.Math.sqrt;
public class PerimeterOfTriangle {

    //Declaration of method for text command

    public static void text ( String txt ) { System.out.println ( txt ); }

    //Declaration of main method

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        while ( true ) {
            text ( "Input the type of triangle.\n(A) for Equilateral triangle\n(B) for Isosceles Triangle \n(C) for Scalene Triangle\n(D) for Right Triangle\n(S) for stop" );
            String command = scanner.next ( );
            if ( command.equals ( "S" ) ) break;

            switch ( command ) {

                case "A": {
                    text ( "Input the side a of Equilateral triangle: " );
                    //Instances
                    double side = scanner.nextDouble ( );
                    //Calculation
                    double perimeter1 = 3 * side;
                    text ( "Perimeter of Equilateral triangle with side: " + side + " is: " + perimeter1 );
                    break;
                }
                case "B": {
                    text ( "Input the one equal side l and the bottom side a of Isosceles Triangle: " );

                    //Instances
                    text ( "Input side l: ");
                    double equalSide = scanner.nextDouble ( );
                    text ( "Input side a: ");
                    double bottomSide = scanner.nextDouble ( );
                    //Calculation
                    double perimeter2 = 2 * equalSide + bottomSide;
                    text ( "Perimeter of Isosceles Triangle with side l: " + equalSide + " and bottom side a: " + bottomSide + " is: " + perimeter2 );
                    break;
                }
                case "C": {
                    text ( "Input the there sides a, b and c of Scalene Triangle: " );

                    //Instances
                    text ( "Input side a: ");
                    double sideA = scanner.nextDouble ( );
                    text ( "Input side b: ");
                    double sideB = scanner.nextDouble ( );
                    text ( "Input side c: ");
                    double sideC = scanner.nextDouble ( );
                    //Calculation
                    double perimeter3 = sideA + sideB + sideC;
                    text ( "Perimeter of Scalene Triangle with sides a: " + sideA + " side b: " + sideB + "and side c: " + sideC + " is: " + perimeter3 );
                    break;
                }
                case "D": {
                    text ( "Input the cathetus a and cathetus b of Right Triangle : " );

                    //Instances
                    text ( "Input cathetus a: ");
                    double cathetusA = scanner.nextDouble ( );
                    text ( "Input chatetus b: ");
                    double cathetusB = scanner.nextDouble ( );
                    //Calculation
                    double hypotenuse = sqrt ( ( cathetusA * cathetusA ) + ( cathetusB * cathetusB ) );
                    double perimeter4 = cathetusA + cathetusB + hypotenuse;
                    text ( "Perimeter of Right Triangle with cathetus a: " + cathetusA + " and cathetus b " + cathetusB + "and hypotenuse c " + hypotenuse + " is: " + perimeter4 );
                    break;
                }
                default:
                    System.out.println ( "You input a choice that not exist" );

            }

        }

    }

}















