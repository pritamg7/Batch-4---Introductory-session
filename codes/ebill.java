import java.util.Scanner;

public class ebill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter unit: ");
        int x=sc.nextInt();
        System.out.print("Enter price of every unit: ");
        int y=sc.nextInt();
        bill user1=new bill(x,y);
        System.out.println("Bill is: "+user1.biling());
    }
}
class bill{
    public int u,p;
    public bill(int unit,int price){
        this.u=unit;
        this.p=price;
    }
    public int biling(){
        return u*p;
    }

}