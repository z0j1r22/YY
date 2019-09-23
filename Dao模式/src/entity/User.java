package entity;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String workno;
    private String phone;

    public User(Integer id, String username, String password, String workno) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.workno = workno;
    }

    public User(Integer id, String username, String password, Date birth) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birth = birth;
    }

    private String sex;
    private Date birth;

    public User(String id, String username, String password, Date birth) {
        this.username = username;
        this.password = password;
        this.birth = birth;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", workno='" + workno + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                '}';
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public User(Integer id, String username, String password, java.sql.Date birth) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birth = birth;
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String username, String password, String workno, String phone, String sex) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.workno = workno;
        this.phone = phone;
        this.sex = sex;
    }


    public User() {
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String workno) {
        this.username = username;
        this.password = password;
        this.workno = workno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setPwd(String password) {
        this.password = password;
    }

    public String getWorkno() {
        return workno;
    }

    public void setWorkno(String workno) {
        this.workno = workno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
