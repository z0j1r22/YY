public class Test1 {
    public static void main(String[] args) {
        Car car=new Car("奥迪",3600000,259);
        BigCar bigCar=new BigCar("宇通",10000,90);
        Driver driver=new Driver();
        driver.drive(car);
        driver.drive(bigCar);
        driver.drive(bigCar,car);

    }
}
