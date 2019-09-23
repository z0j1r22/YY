package Chouxiang;

public abstract class Printer {
    public abstract void print();
}
class BlackWhitePrinter extends Printer{
    @Override
    public void print() {
        System.out.println("黑白打印");
    }
}
class ColorPrinter extends  Printer{
    @Override
    public void print() {
        System.out.println("彩色打印");
    }
}

