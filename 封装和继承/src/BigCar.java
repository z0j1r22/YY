public class BigCar {
    String name;
    Integer price;
    Integer speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    public BigCar(String name,Integer price,Integer speed){
        this.name=name;
        this.price=price;
        this.speed=speed;
    }
}
