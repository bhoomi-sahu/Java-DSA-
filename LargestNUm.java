import java.util.Scanner;

public class LargestNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n1;
        int n2;
        int n3;

        System.out.println("Enter n1");
        n1 = sc.nextInt();
         System.out.println("Enter n2");
        n2 = sc.nextInt();
         System.out.println("Enter n3");
        n3 = sc.nextInt();

        if(n1 >= n2 &&  n1 >= n3){
            System.out.println("N1 is largest "+ n1);
        }else if (n2 >= n1 &&  n2 >= n3){
               System.out.println("N2 is largest "+ n2);
        }else{
                System.out.println("N3 is largest "+ n3);
        }
        sc.close();
    }
    
}
