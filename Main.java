import java.util.Scanner;

public class Main {
    public double add(double a, double b) {
        return a + b;
    }
    public double sub(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        return a / b;
    }
    public double abs(double a) {
        return Math.abs(a);
    }
    public double pow(double a) {
        return a * a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Main main = new Main();
        System.out.println("Example add: " + main.add(10, 5));
        System.out.println("Example sub: " + main.sub(10, 5));
        System.out.println("Example multiply: " + main.multiply(10, 5));
        System.out.println("Example div: " + main.div(10, 5));
        System.out.println("Example abs: " + main.abs(10));
        System.out.println("Example pow: " + main.pow(10));

    }
}