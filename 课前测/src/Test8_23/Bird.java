package Test8_23;

public abstract class Bird {
    private String name;
    private String type;

    @Override
    public String toString() {
        return "Bird{" +
                "名字：" + name + '\'' +
                ", 属性：" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bird(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public  abstract void fly();
}
