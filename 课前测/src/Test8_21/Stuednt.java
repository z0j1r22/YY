package Test8_21;

public class Stuednt implements Infoable{
    public String Xinxi;

    @Override
    public String print() {
        return this.getXinxi();
    }

    public Stuednt(String xinxi) {
        Xinxi = xinxi;
    }

    public String getXinxi() {
        return Xinxi;
    }

    public void setXinxi(String xinxi) {
        Xinxi = xinxi;
    }
}
