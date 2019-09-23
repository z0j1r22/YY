package Chouxiang;

public class Test {
    public static void main(String[] args) {
        Printer printer =new BlackWhitePrinter();
        Printer printer1=new ColorPrinter();
        Person person=new Person();
        person.print(printer);
    }
}
