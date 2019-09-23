public class Car {
    String name;
    int price;
    int speed;
    public  void  setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public  void setPrice(int price){
        this.price=price;
    }
    public int getPrice() {
        return this.price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Car(String name,int price,int speed){
        this.name=name;
        this.price=price;
        this.speed=speed;
    }
}
