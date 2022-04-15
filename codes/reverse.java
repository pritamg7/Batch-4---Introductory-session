import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int x=sc.nextInt();
        int r=0;
        int t=0;
        while(x>9){
            t=x%10;
            r=(r+t)*10;
            x=x/10;
        }
        r+=x%10;
        System.out.println("Reversed no: "+r);
    }
}

