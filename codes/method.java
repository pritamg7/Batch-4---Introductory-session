public class method {
    static void fun(){
        System.out.println("Hello");
    }
    static void fun(int a){
        System.out.println("Area "+a*a);
    }
    static void fun(int a,int b){
        System.out.println("Area "+a*b);
    }
    static int f1(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        fun(a,b);
        fun();
        fun(a);
        System.out.println(f1(a,b));
    }
}
