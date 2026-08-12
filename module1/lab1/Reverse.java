package oops26;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        int rev=0;
        for(int i=n;i>0;i/=10){
            rev=rev*10+i%10;
        }
        System.out.println("Reverse of the number is "+rev);
        sc.close();
    }
}
