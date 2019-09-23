public class Lianxi2 {
    public static void main(String[] args) {
        int sum=0;
        int odd=0;
        int even=0;
        for(int i=1;i<=100;i++){
            if(i%2==1){
                odd+=i;
            }
            if (i%2==0){
                even+=i;
            }
            System.out.println(i);
            sum+=i;

        }
        System.out.println("总数" +sum+"奇数"+odd+"偶数"+even);
    }
}
