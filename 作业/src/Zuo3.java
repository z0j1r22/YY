public class Zuo3 {
    public static void main(String[] args) {
        for (int i=4;i<1000;i++){
            boolean flag=true;
            if (i>3){
                for (int j=2;j<i;j++){
                    if (i%j==0){
                        flag=false;
                        break;
                    }
                }
            }
            if (flag){
                System.out.println(i+"是素数");
            }
        }
    }
}
