public class Saler {
    public String name;
    public static int tickets=5;
    public Saler(String name){
        this.name=name;
    }
    public void sale(){
        if (tickets>0){
            System.out.println("售票员"+name+"售票一张，当前剩余"+ --tickets+"张票");
        }
        else{
            System.out.println("售票员"+name+"正在售票。票已售完，当前余票"+tickets+"张票");
        }
    }
}
