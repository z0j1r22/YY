package printer;

public class D3 extends Printer {
    public D3(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this.getName()+"："+"使用3D打印机"+"打印了照片");
    }
}
