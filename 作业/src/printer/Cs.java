package printer;

public class Cs extends Printer{
    public Cs(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this.getName()+"："+"使用彩色打印机"+"打印了照片");
    }
}
