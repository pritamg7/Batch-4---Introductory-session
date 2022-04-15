import java.util.Scanner;

public class operators {
    public static void main(String[] args){
//        Pritam Ghosh
        Scanner s=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("a: ");
        a=s.nextInt();
        System.out.print("b: ");
        b=s.nextInt();
        System.out.print("c: ");
        c=s.nextInt();
        System.out.println("Sum : "+(a+b+c));
        if(a==b){
            System.out.println("a and b are equal");
        }else{
            System.out.println("a and b are not equal");
        }
        if(a==b && b==c){
            System.out.println("a and b and c are equal");
        }else{
            System.out.println("a and b and c are not equal");
        }
    }
}
