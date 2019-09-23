public class Test7 {
    public static void main(String[] args) {
        String[] ary={"你","是","我","的","小苹果"};
        String ary1="";
        //反转
        for (int i=ary.length-1;i>=0;i--) {
            ary1+=ary[i];
        }
        StringBuffer stringBuffer=new StringBuffer(ary1);
        System.out.println(stringBuffer);
    }
}
