package entity;

public class Role {
    private Integer id;
    private String rolename;
    private Integer state;
    private String remark;


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Role(Integer id) {
        this.id = id;
    }

    public Role(Integer id, String rolename, Integer state, String remark) {
        this.id = id;
        this.rolename = rolename;
        this.state = state;
        this.remark = remark;
    }
}
