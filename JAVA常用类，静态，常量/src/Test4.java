public class Test4 {
    public static void main(String[] args) {
        String str1="心中有个梦";
        //实例化StringBuffer 对象
        StringBuffer stringBuffer=new StringBuffer(str1);

        stringBuffer.append("有能力");
        stringBuffer.append("有前途");
        stringBuffer.append("有担当");
        stringBuffer.append("有责任");
        stringBuffer.insert(5,"真的");
        System.out.println(stringBuffer);
        String str=stringBuffer.toString();
        System.out.println(stringBuffer.toString());
    }
}
