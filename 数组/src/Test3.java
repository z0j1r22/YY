public class Test3 {
    public static void main(String[] args) {
        int ary[]=new int[]{10,2,65,85,47};
        for (int i = 1; i < ary.length-1; i++) {
            for (int j = 0; j < ary.length-i; j++) {
                if (ary[j]>ary[j+1]) {
                    int temp;
                    temp=ary[j];
                    ary[j]=ary[j+1];
                    ary[j+1]=temp;
                }
            }
        }
        for (int i : ary) {
            System.out.println(i);
        }
    }
}
