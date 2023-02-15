
import java.util.Scanner;
public class CalculateG {

    public static double multiplication() {
        Scanner multiplicationInput = new Scanner(System.in);
        // method for multiplication
        int integer1;
        int integer2;
        int multi;
        System.out.println("Multiplication Inputs");
        System.out.println("Enter the first number: ");
        integer1 = multiplicationInput.nextInt();
        System.out.println("Enter second number");
        integer2 = multiplicationInput.nextInt();
        multi = integer1 * integer2;
        System.out.println("Multiplication answer is:" + multi);


        return 0;
    }

    public static double square() {
        Scanner squareInput = new Scanner(System.in);
        //method for square computation
        int integer1;
        int square;
        System.out.println("Square Inputs");
        System.out.println("Enter number");
        integer1 = squareInput.nextInt();
        square = integer1 * integer1;
        System.out.println("Square answer is:" +square);


        return 0;
    }

    public static double sum() {
        Scanner multiInput = new Scanner(System.in);
        // method for summation
        int integer1;
        int integer2;
        int sum;
        System.out.println("Summation Inputs");
        System.out.println("Enter the first number: ");
        integer1 = multiInput.nextInt();
        System.out.println("Enter second number");
        integer2 = multiInput.nextInt();
        sum = integer1 + integer2;
        System.out.println("Summation answer is:" +sum);


        return 0;
    }
    public static void outline() {
        // method for printing out a result


    }





    public static void main(String[] args) {
        double gravity =-9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity ;
        double initialPosition = 0.0;
        double finalPosition ;
// Add the formulas for position and velocity
        finalPosition = 0.5 * (gravity*(fallingTime*fallingTime)+ (initialVelocity*fallingTime)+initialPosition)
                              /fallingTime;
        finalVelocity = ((gravity*fallingTime)+initialVelocity)/fallingTime;
        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m.");
// Add output line for velocity (similar to position)
        System.out.println("The object's velocity after " + fallingTime + " seconds is "
                + finalVelocity + " m/s");
       //calling methods to print output on console
        multiplication();
        sum();
        square();

    }
}