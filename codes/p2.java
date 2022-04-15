public class p2 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        a.fun();
        b.fun();
        b.func();
        c.fun();
        c.func();
        c.funcc();
    }
}
class A{
    void fun(){
        System.out.println("A is called");
    }
}
class B extends A{
    void func(){
        System.out.println("B is called");
    }
}
class C extends B{
    void funcc(){
        System.out.println("C is called");
    }
}