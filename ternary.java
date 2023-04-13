package revision;

import java.util.Scanner;

class ternaryOperator {
    double percentage;

    void grade() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the percentage");
        percentage = scan.nextDouble();
        System.out.println(percentage >= 30.0
                ? percentage >= 45.0 ? percentage >= 60.0 ? "first division" : "second division" : "third division"
                : "failed");
    }
}

public class ternary {
    public static void main(String[] args) {
        ternaryOperator obj = new ternaryOperator();
        obj.grade();

    }
}
