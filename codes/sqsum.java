import java.util.Scanner;

public class sqsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        System.out.println("10 int: ");
        int i=0;
        while(i<10){
            s+=sc.nextInt();
            i++;
        }
        System.out.println("Square: "+Math.sqrt(s));
    }
}
