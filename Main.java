import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree for its sine value");

        int value;

        while (true){
            try {
                value = scanner.nextInt();
                break;
            } catch (InputMismatchException ex){
                System.out.println("Please enter a number");
                scanner.next();
            }
        }



        while (value < 0){
            value += 360;
        }

        if (value > 360){
            value %= 360;
        }


        System.out.println("radians value of degree " + value + " is: " + toRadians(value));
        System.out.println("Sin(" + value + ") is equal to " + sinValue(value));
    }


    public static double sinValue (int x){
        double limitedRadians = limitedRadiansValue(toRadians(x));

        return  limitedRadians - (Math.pow(limitedRadians,3)/factorial(3))
                +(Math.pow(limitedRadians,5)/factorial(5))
                -(Math.pow(limitedRadians,7)/factorial(7))
                +(Math.pow(limitedRadians,9)/factorial(9));
    }

    public static double limitedRadiansValue(double x){
        return Math.PI - x;
    }

    public static double toRadians (int a){
        return a * Math.PI /180;
    }

    public static int factorial (int y){

        if (y == 0) return 1;

        return y * factorial(y - 1);
    }
}