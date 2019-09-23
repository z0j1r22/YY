package entity;

import java.sql.Date;

public class User {
    private String userName;
    private String password;
    private String workno;
    private String phone;
    private String sex;
    private Date birth;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(String userName, String password, String workno, String phone, String sex, Date birth, Integer id) {
        this.userName = userName;
        this.password = password;
        this.workno = workno;
        this.phone = phone;
        this.sex = sex;
        this.birth = birth;
        this.id = id;
    }



    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", workno='" + workno + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", id=" + id +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public User(String userName, String password, String workno, String phone, String sex, Date birth) {
        this.userName = userName;
        this.password = password;
        this.workno = workno;
        this.phone = phone;
        this.sex = sex;
        this.birth = birth;
    }
}
