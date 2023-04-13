package revision;

class arithmetic 
{
    double res;
    void add(int a , int b){
        res= a+b;
        System.out.println("the addition of two numbers is " + res);
    }
    void subtract(int a , int b){
        res= a-b;
        System.out.println("the subtraction of two number is " + res);
    }
    void multiply(int a,int b){
        res= a*b;
        System.out.println("the multiplication of two number is " + res);
    }
    void divide(double a, double b){
        res= a/b;
        System.out.println("the division of two number is " + res);
    }
    void modulusDivision(double a, double b){
        res= a%b;
        System.out.println("the modulus division is" + res);
    }
}

class operators
{
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        obj.add(6, 5);
        obj.subtract(6, 5);
        obj.multiply(6, 5);
        obj.divide(6, 5);
        obj.modulusDivision(6, 5);
    }
}