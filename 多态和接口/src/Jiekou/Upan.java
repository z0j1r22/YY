package Jiekou;

public class Upan implements Usb {
    @Override
    public void end() {
        System.out.println("传输数据结束，欢迎下次使用");
    }

    @Override
    public void start() {
        System.out.println("准备开始传输数据");
    }
}
