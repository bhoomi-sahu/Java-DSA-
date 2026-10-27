import java.util.Scanner;

public class TwoNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int product = a * b;
        int div = a / b;
        int remainder = a % b;

        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Product = " + product);
        System.out.println("Division = " + div);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}