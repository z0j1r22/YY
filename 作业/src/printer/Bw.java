package printer;

public class Bw extends Printer{
    public Bw(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this.getName()+"："+"使用黑白打印机"+"打印了照片");
    }
}
