import java.util.Scanner;

public class ContEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter N");
        n = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<=n; i++){
            if(i % 2 == 0){
                System.out.println("even  "+ i);
                evenCount++;
            }else{
                System.out.println("odd "+ i);
                oddCount++;
            }
        }

        System.out.println("Total Even Num Till " + n +" is "+ evenCount);
         System.out.println("Total Odd Num Till " + n + " is "+oddCount);
         sc.close();
    }
}
