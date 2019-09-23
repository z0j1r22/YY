import org.apache.log4j.Logger;

import java.util.Scanner;

public class doException {
    static Logger logger=Logger.getLogger(doException.class.getName());
    public static void main(String[] args) {

        double  num1=1;double num2=1;
        try {
            logger.info("执行了计算的操作");
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入被除数");
            num1=scanner.nextInt();
            System.out.println("请输入除数");
            num2=scanner.nextInt();
            double jg=num1/num2;
            System.out.println(num1+"除以"+num2+"等于"+jg);
        }
        //异常捕捉
        catch (Exception e){
            logger.error("发生了异常："+e.getMessage());
            //输出自定义异常信息
//            System.out.println("除数不能为零");
//            //输出异常自身信息
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            return;
        }
        finally {
            System.out.println("finally语句块被执行");
        }
        System.out.println("程序结束");



    }
}
