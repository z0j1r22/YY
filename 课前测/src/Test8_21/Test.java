package Test8_21;

public class Test {
    public static void main(String[] args) {
        Infoable infoable=new Stuednt("学生信息");
        Printer printer=new BlackWhitePrinter();
        printer.print(infoable);
        Infoable infoable1=new Car("奔驰");
        Printer printer1 =new D3Printer();
        printer1.print(infoable1);


    }
}
