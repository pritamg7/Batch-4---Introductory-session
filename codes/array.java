public class array {
    public static void main(String[] args) {
        int n=2;
        int a[]=new int[11];
        for (int i=0;i<=10;i++){
            a[i]=i*n;
        }
        for (int i: a) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(a[5]);
    }
}
