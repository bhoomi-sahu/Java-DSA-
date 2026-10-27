import java.util.Scanner;

public class SecondLargestEle {
    public static void main(String[] args) {
  
        int[] arr = {20,40,3,60,9,45,55};

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;


        for(int value: arr){
            if(value > max){
                   second = max;
                   max = value;
            }else if(value < max && value > second){
                value = second;
            }
        }

        if(second == Integer.MIN_VALUE) {
            System.out.println("No second-largest distinct value");
        }else {
            System.out.println(second);
        }
    }
    
}
