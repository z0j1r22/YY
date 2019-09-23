public class Driver {
    public void drive(BigCar car){
        System.out.println("汽车品牌："+car.name+"汽车价格："+car.price+"汽车速度："+car.speed);
    }

    public void drive(Car car){
        System.out.println("汽车品牌："+car.name+"汽车价格："+car.price+"汽车速度："+car.speed);
    }
    public void drive(){

    }

    public void drive(BigCar  car1,Car car2){
        System.out.println("汽车品牌："+car1.name+"汽车价格："+car1.price+"汽车速度："+car1.speed);
    }
    public void drive(Car  car1,BigCar car2){

    }
}

