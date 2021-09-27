// Overloading

public class Multiplier {


    public int multiply(int a, int b) {
        return a * b;

    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, int b,int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.multiply(10, 20));
//        System.out.println(multiplier.multiply(10, 20.20));
        System.out.println(multiplier.multiply(1, 2, 3));

    }

}
