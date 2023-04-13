package revision;

import java.util.Scanner;
// A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.

class check {
    void exam(double percentage) {
        if (percentage >= 75.0) {
            System.out.println("allowed to write the exam");
        } else {
            System.out.println("not allowed to write the exam");
        }
    }
}

class student {
    double total;
    double present;
    double percentage;

    void classes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the total no of days");
        total = scan.nextDouble();
        System.out.println("enter the total no of days a student is present");
        present = scan.nextDouble();
        percentage = (present / total) * 100;
        System.out.println("percentage of attendace is " + percentage + "%");
        check obj = new check();
        obj.exam(percentage);
    }
}

public class if_else {
    public static void main(String[] args) {

        student obj = new student();
        obj.classes();
    }
}
