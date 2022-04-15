public class polymorphism {
    public static void main(String[] args) {
        rect r=new rect();
        square s= new square();
        circle c=new circle();
        r.area(5,6);
        s.area(7);
        c.area(7);

    }
}
class rect{
    void area(int a,int b){
        System.out.println("Area is : "+a*b);
    }
}
class square extends rect{
    void area(int a){
        System.out.println("Area is : "+a*a);
    }
}
class circle{
    void area(int r){
        double a=Math.PI*r*r;
        System.out.println("Area is : "+a);
    }
}
