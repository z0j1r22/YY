package Dao;

import entity.Role;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class RoleDaoImpl extends BaseDao implements RoleDao  {

    @Override
    public List<Map> queryAll() {
        String sql="select * from t_role ";
        return this.executeQuery(sql,null);
    }

    @Override
    public Map queryById(int id) {
        String sql="select *from t_role where id=?";
        Object[] params=new Object[]{id};
        List<Map>list= null;

            list = executeQuery(sql,params);

        return list.size()>0?list.get(0):null;
    }

    @Override
    public int Add(Role info) {
        String sql="insert into t_role(rolename,state,remark) values(?,?,?)";
        int result=-1;
        Object[] params=new Object[]{info.getRolename(),info.getState(),info.getRemark()};
        try {
            result=executeUpdate(sql,params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int update(Role info) {
        String sql="update t_role set rolename=?,state=? ,remark=? where id=?";
        int result=-1;
        Object[] params=new Object[]{info.getRolename(),info.getState(),info.getRemark(),info.getId()};
        try {
            result=executeUpdate(sql,params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(Role info) {
        String sql="delete from t_role where id=?";
        Object[]params=new Object[]{info.getId()};
        int result=-1;
        try {
            result=executeUpdate(sql,params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
