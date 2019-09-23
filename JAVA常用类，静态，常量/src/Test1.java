public class Test1 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="aBc";
        String str3=new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
    }
            }
