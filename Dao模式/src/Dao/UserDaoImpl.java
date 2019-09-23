package Dao;

import entity.Role;
import entity.User;
import sun.nio.cs.US_ASCII;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UserDaoImpl extends BaseDao implements UserDao{
    @Override
    public List<Map> queryAll() {
        String sql="select * from t_user";
        return this.executeQuery(sql,null);
    }

    @Override
    public Map queryById(int id) {
        String sql="select * from where id=?";
        Object[] params=new Object[]{id};
        List<Map>list= null;
        list = executeQuery(sql,params);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public int Add(User info) {
        String sql="insert into t_user(id,username,password,birth)values(?,?,?,?)";
        int result=-1;
        Object[]params= new Object[]{info.getId(),info.getUsername(),info.getpassword(),info.getBirth()};
        try {
            result=executeUpdate(sql,params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int Update(User info) {
        String sql="update t_user set username=?,password=?,workno=? where id=?";
        int result=-1;
        Object[]params=new Object[]{info.getUsername(),info.getpassword(),info.getWorkno(),info.getId()};
        try {
            result=executeUpdate(sql,params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(User info) {
        String sql = "delete from t_user where id=?";
        Object[] params = new Object[]{info.getId()};
        int result = -1;
        try {
            result = executeUpdate(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
