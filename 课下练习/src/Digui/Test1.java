package Digui;

public class Test1 {
    public static void main(String[] args) {
        int n=7;
        System.out.println(sum(n));
        System.out.println(fn(n));
    }
    public static  int sum(int n){
        if (n==1||n==2){
            return 1;
        }
        return sum(n-1)+sum(n-2);
    }
    public static int fn(int n){
        if (n==1){
            return 1;
        }
        return n+fn(n-1);
    }
}
