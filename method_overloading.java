package revision;


class calc{
    int res1;
    double res2;
    void add(int a,int b){
        res1 = a+b;
        System.out.println(res1);

    }
    void add(int a,int b,int c){
        res1 = a+b+c;
        System.out.println(res1);

    }
    void add(double a, double b){
        res2 = a+b;
        System.out.println(res2);
    }
    void add(double a, double b,double c){
        res2 = a+b+c;
        System.out.println(res2);
    }

}
public class method_overloading {
    public static void main(String[] args) {
        calc obj = new calc();
        obj.add(4,5);
        obj.add(4,5,6);
        obj.add(4.2,5.5);
        obj.add(5.5,6.3,8.3);
    }
}
