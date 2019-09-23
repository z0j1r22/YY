package Jiekou;

public class Test {
    public static void main(String[] args) {
        Usb usb=new Upan();
        usb.start();
        usb.end();
        Usb usb1=new Mouse();
        usb1.start();
        usb1.end();
    }
}
