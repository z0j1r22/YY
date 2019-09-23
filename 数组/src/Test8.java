import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int ary[]={50,40,36,21,58};
        int key=35;
        int index=ary.length;
        Arrays.sort(ary);
        for (int i = 0; i < ary.length; i++) {
            if (key<ary[i]){
                index=i;
                break;
            }
        }
        for (int j=ary.length-1;j>index;j--){
            ary[j]=ary[j-1];
        }
        ary[index]=key;
        for (int k = 0; k < ary.length; k++) {
            System.out.print(ary[k]+"\t");


        }
    }
}
