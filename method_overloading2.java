package revision;

class show{
    void display(int a){
        System.out.println("this is int");
    }
    void display(String s){
        System.err.println("this is string");
    }
    void display(double a){
        System.out.println("this is double");

    }
}
public class method_overloading2 {
    public static void main(String[] args) {
        show obj = new show();
        obj.display(5);        
        obj.display("faizan");        
        obj.display(50.5);
        System.out.println("***************");        
        obj.display('a');
        obj.display(3.5f);

        byte b = 4 ;
        obj.display(b);
    }
}
