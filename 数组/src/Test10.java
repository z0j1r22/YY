public class Test10 {
    public static void main(String[] args) {
        int[]ary=new int[]{12,20,4,50,32};
        for (int i = 1; i < ary.length; i++) {
            int temp=ary[i];
            int j;
            for ( j = i-1; j >=0; j--) {
                if (ary[j]>temp){
                    ary[j+1]=ary[j];
                }
                else {
                    break;
                }
            }
            ary[j+1]=temp;
        }
        for (int i : ary) {
            System.out.print(i+"\t");
        }
    }
}

