import java.util.Scanner;

public class table13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(i*n+" ");
        }
    }
}
