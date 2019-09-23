public class Student {
    private Integer id;
    private String stuno;
    private  String name;
    private String sex;
    private String address;

    public Student(String name, String stuno, String address) {
        this.name = name;
        this.stuno = stuno;
        this.address = address;
    }


    public Student(Integer id) {
        this.id = id;
    }

    public Student(Integer id, String stuno, String name, String address) {
        this.id = id;
        this.stuno = stuno;
        this.name = name;
        this.address = address;
    }

    public Student(String stuno, String name) {
        this.stuno = stuno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuno='" + stuno + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
