public class Main{
    public static void main(String[] args) {
        int value = 8;

        int test = 5;
        System.out.println("factorial value of " + test + " is equal to: " +  factorial(test));

        System.out.println("radians value of degree " + value + " is: " + toRadians(value));
        System.out.println("Sin(" + value + ") is equal to " + sinValue(value));
    }

    public static double sinValue (int x){
        return  toRadians(x) - (Math.pow(toRadians(x),3)/factorial(3))+(Math.pow(toRadians(x),5)/factorial(5));
    }

    public static double toRadians (int a){
        return a * Math.PI /180;
    }

    public static int factorial (int y){

        if (y == 0) return 1;

        return y * factorial(y - 1);
    }
}
