package revision;

import java.util.Scanner;

class number {
    int count;

    void prime(int n) {
        for (int i = 0; i <= n; i++) {
            count =0;  //this is imp as it will leads to make the count zero every time

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}

// prime number
public class loop2_prime {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the last number");
        n = scan.nextInt();
        number obj = new number();
        obj.prime(n);
    }
}
