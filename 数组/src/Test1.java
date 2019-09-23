public class Test1 {
    public static void main(String[] args) {
        int ary[]=new int[5];
        for (int i=0;i<ary.length;i++){
            ary[i]=i*2+2;
        }
        for (int a:ary) {
            System.out.println(a);
        }

    }
}
