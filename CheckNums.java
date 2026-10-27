import java.util.Scanner;

public class CheckNums {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int num;
           System.out.println("enter num");
           num = sc.nextInt();

         // check num is positive or negative
         if(num < 0){
            System.out.println("Negative num");
         }else{
            System.out.println("Positive num");
         }

    sc.close();
    }
    
}
