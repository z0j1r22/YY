import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int ary[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < ary.length; i++) {
            ary[i]=scanner.nextInt();
        }
        for (int i = 0; i < ary.length-1; i++) {
            int minIndex=i;
            for (int j = i; j < ary.length; j++) {
                if (ary[minIndex]>ary[j]){
                    minIndex=j;
                }
            }
            if (ary[i]!=ary[minIndex]){
                int temp=ary[i];
                ary[i]=ary[minIndex];
                ary[minIndex]=temp;
            }
        }
        for (int i : ary) {
            System.out.println(i+"");
        }

    }
}
