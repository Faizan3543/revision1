package revision;

import java.util.Scanner;
// Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
// if employee is female, then she will work only in urban areas.

// if employee is a male and age is in between 20 to 40 then he may work in anywhere

// if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

// And any other input of age should print "ERROR".

class job {

    int age;

    void work(String gender) {
        if (gender.equals("Female")) {  // we cant use == because string is an object and it will only compare the references
            System.out.println("She can only work in urban areas");
        } 
        else if (gender.equals("Male")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the age");
            age = scan.nextInt();

            if (age >= 20 && age < 40) {
                System.out.println(" he may work aywhere");
            } else if (age >= 40 && age <= 60) {
                System.out.println("he canwork anywhere");
            } else {
                System.err.println("ERROR");
            }
        }
        else {
            System.out.println("enter according to the format");
        }

    }
}

class employee {
    String gender;

    void details() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the sex in Male or Female ");
        gender = scan.next();
        job obj = new job();
        obj.work(gender);
    }
}

public class if_else2 {
    public static void main(String[] args) {
        employee obj = new employee();
        obj.details();

    }
}
