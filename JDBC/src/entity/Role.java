package entity;

public class Role {
    private String rolename;
    private String state;
    private String remark;

    @Override
    public String toString() {
        return "Role{" +

                ", rolename='" + rolename + '\'' +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                '}';
    }



    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Role( String rolename,String state, String remark) {

        this.rolename = rolename;
        this.state = state;
        this.remark = remark;
    }
}
