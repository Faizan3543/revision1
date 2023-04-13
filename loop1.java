package revision; 
import java.util.Scanner;
// Java program to print sum of all odd numbers between 1 to n using for loop.
// Java program to print sum of all even numbers between 1 to n using for loop.
// Java program to print sum of all even numbers between 1 to n in reverse order using for loop.

class numbers{
   

    void odd(int n){
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }System.out.println();
        
    }
    void even(int n){

        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }System.out.println();
    }
    void reverseEven(int n){

        for(int i=n;i>=0;i--){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}

public class loop1 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the last number");
        n = scan.nextInt();
        numbers obj = new numbers();
        obj.odd(n);
        obj.even(n);
        obj.reverseEven(n);
    }
}
