public class Mine {
    private String name;
    private char sex;
    private Integer height;
    private Integer weight;

    public Mine(String name, char sex, Integer height, Integer weight) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Mine{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}
