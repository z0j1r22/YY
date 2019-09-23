package Stream;

import java.io.Serializable;

public class Role implements Serializable {
    private String name;
    private int level;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", type='" + type + '\'' +
                '}';
    }

    public Role(String name, int level, String type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }
    public Role(){

    }
}
