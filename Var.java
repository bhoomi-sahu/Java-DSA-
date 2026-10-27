import java.util.Scanner;

public class Var {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String colName;
        float per;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        sc.nextLine(); // consume Enter

        System.out.print("Enter your college name: ");
        colName = sc.nextLine();

        System.out.print("Enter your percentage: ");
        per = sc.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + colName);
        System.out.println("Percentage: " + per);
    }
}