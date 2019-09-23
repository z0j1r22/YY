public class Test3 {
    public static void main(String[] args) {
        String str1="qwer";
        String str="ASD";
        //拼接字符串
        String str3=str1.concat(str);
        System.out.println(str3);
        //判断字符串是否以...开头
        boolean r1=str1.startsWith("qw");
        //判断字符串是否以...结尾
        boolean r2=str.endsWith("D");
        System.out.println(r1);
        System.out.println(r2);

        String email="2434811973@qq.com";
        //查找子字符串在原字符串中第一次出现的索引
        int index1=email.indexOf("3");
        //查找子字符串在原字符串中最后一次出现的索引
        int index2=email.lastIndexOf("3");
        System.out.println(index1);
        System.out.println(index2);
        //将原字符串的字符替换
        String email2=email.replace("com","cn");
        System.out.println(email2);
        //截取字符串
        String j1=email.substring(2);
        String j2=email.substring(2,6);
        System.out.println(j1);
        System.out.println(j2);

        String id="    zjr   ";
        //字符串长度
        System.out.println(id.length());
        //清除字符串前后空格
        System.out.println(id.trim().length());

    }
}
