
import java.util.Scanner;
public class CalculateG {

    public static int multiplication(int num1,int num2) {

        // method for multiplication
        return num1 * num2;
    }

    public static int square(double digit) {



        return (int) Math.pow(digit,2);
    }

    public static int summation(int integer1,int integer2) {

        return integer1+integer2;
    }
    public static int outline(String message , double result) {
        // method for printing out a result
        System.out.println(message + "" + result);

        return (int) result;
    }
    public static void main(String[] args) {
        double gravity =-9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity ;
        double initialPosition = 0.0;
        double finalPosition ;
       int num1 = 5;
        int num2 = 5;
       int digit=25;
       int integer1=15;
       int integer2=75;
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
        int multiplicationResult = multiplication(num1,num2);
        int squareResult = square(digit);
        int summationResult = summation(integer1,integer2);

        outline("Multiplication Answer:", multiplicationResult);
        outline("Square Answer:", squareResult);
        outline("Summation Answer:", summationResult);


    }
}