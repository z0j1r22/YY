package entity;

public class Menu {
    private String menuname;
    private String menuurl;
    private int type;


    @Override
    public String toString() {
        return "Menu{" +
                "menuname='" + menuname + '\'' +
                ", menuurl='" + menuurl + '\'' +
                ", type=" + type +
                '}';
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public Menu(String menuname, String menuurl, int type) {
        this.menuname = menuname;
        this.menuurl = menuurl;

        this.type = type;

    }
}
