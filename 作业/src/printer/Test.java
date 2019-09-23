package printer;

public class Test {
    public static void main(String[] args) {
        Printer printer=new Bw("小明");
        printer.print();
        Printer printer1=new Cs("小明");
        printer1.print();
        Printer printer2=new D3("小明");
        printer2.print();

    }


}
