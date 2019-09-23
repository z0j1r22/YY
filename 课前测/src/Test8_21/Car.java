package Test8_21;

public class Car implements Infoable {
    public String Jianjie;

    @Override
    public String print() {
        return this.Jianjie;
    }

    public Car(String jianjie) {
        Jianjie = jianjie;
    }

    public String getJianjie() {
        return Jianjie;
    }

    public void setJianjie(String jianjie) {
        Jianjie = jianjie;
    }
}
