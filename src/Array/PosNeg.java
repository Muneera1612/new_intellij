package Array;
import java.util.Scanner;
public class PosNeg {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        }
        if(n<0){
            System.out.println("Negative");
        }
        if(n==0){
            System.out.println("Zero");
        }
    }
}
