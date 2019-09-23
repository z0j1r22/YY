package Digui;

public class Test2 {
    public static void main(String[] args) {
        int n=6;
        System.out.println(sum(n));
        System.out.println(fn(n));
    }
    public static int sum(int n){
        if (n == 1) {
            return 1;
        }
        return n+sum(n-1);
        }
    public static int fn(int n){
        if (n==1||n==2){
            return 1;
        }
        return fn(n-1)+fn(n-2);
    }
    }

