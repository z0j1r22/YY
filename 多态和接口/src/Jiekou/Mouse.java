package Jiekou;

public class Mouse implements Usb {
    @Override
    public void start() {
        System.out.println("鼠标链接，可以使用");
    }

    @Override
    public void end() {
        System.out.println("使用结束，期待下次使用");

    }
}
