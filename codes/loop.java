import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n : ");
        int n=sc.nextInt();
        int i=0;
        int j=0;
        while(i<=n){
            j=0;
            while(j<=(n-i)){
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<(2*i-1)){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
