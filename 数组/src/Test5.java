public class Test5 {
    public static void main(String[] args) {
        int ary[]={01,22,11,18,99,97};
        int key=18;
        int index=-1;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i]==key){
                index=i;
            }
        }
        if (index==-1){
            System.out.println("没有找到");
        }else{
            System.out.println("找到了，下标是："+" "+index);
        }

    }
}
