package MgrXt;

public class User {
    private String name;
    private String pwd;
    private String id;
    //1,管理员 2，普通用户
    private int type=2;
    //0，禁用 1，启用
    private int state=1;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", id='" + id + '\'' +
                ", type=" + type +
                ", state=" + state +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;

    }
}
