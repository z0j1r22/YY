package Test8_21;

public abstract class Printer {
    public abstract void print(Infoable infoable);
}
class BlackWhitePrinter extends Printer {
    @Override
    public void print(Infoable infoable) {
        System.out.println("使用黑白打印机打印了"+infoable.print());
    }
}
class  D3Printer extends Printer{
    @Override
    public void print(Infoable infoable) {
        System.out.println("使用3D打印机打印了"+infoable.print());
    }
}
class car extends Car{
    public car(String infoable) {
        super(infoable);
    }
}
