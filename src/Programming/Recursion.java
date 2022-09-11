package Programming;

public class Recursion {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int result=Recursion.powerSearch(a,b);
        System.out.println(result);

    }
    public static int powerSearch(int x, int n){
        if (n==0)
            return 1;
        else return x*powerSearch(x,n-1);
    }
}
