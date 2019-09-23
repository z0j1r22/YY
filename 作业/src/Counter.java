public class Counter {
    static int num1,num2,res;
    static String ysf;
    public static void S(){

        switch (ysf) {
            case "+":
                System.out.println(sum());
                break;
            case "-":
                System.out.println(sub());
                break;
            case "*":
                System.out.println(cheng());
                break;
            case "/":
                System.out.println(chu());
                break;

        }

    }
    public static int sum(){
        res=num1+num2;
        return res;
    }
    public static int sub(){
        res=num1-num2;
        return res;
    }
    public static int cheng(){
        res=num1*num2;
        return res;
    }
    public static int chu(){
        res=num1/num2;
        return res;
    }
}

