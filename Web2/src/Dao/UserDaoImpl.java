package Dao;

import entity.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public int add(User info) {

        String sql="insert into t_user(username,password,workno,phone,sex,birth)values(?,?,?,?,?,?) ";
        Object[] params=new Object[]{info.getUserName(),info.getPassword(),info.getWorkno(),info.getPhone(),info.getSex(),info.getBirth()};


        return executeUpdate(sql,params);
    }

    @Override
    public Map checkLogin(User info) {
        String sql="select* from t_user where username=? and password=? ";
        Object[] params=new Object[]{info.getUserName(),info.getPassword()};
        List<Map> mapList=this.executeQuery(sql,params);
        System.out.println(mapList);
        return mapList.size()>0?mapList.get(0):null;

    }
    @Override
    public int Update(User info) {
        String sql="update t_user set username=?,password=?,workno=?,phone=?,sex=?,birth=?where id=?";
        Object[]params=new Object[]{info.getUserName(),info.getPassword(),info.getWorkno(),info.getPhone(),info.getSex(),info.getBirth(),info.getId()};
        return executeUpdate(sql,params);
    }
    @Override
    public int delete(int id)  {
       String sql="delete from t_user where id=?";
       Object[] params=new Object[]{id};
       return this.executeUpdate(sql,params);
    }

    @Override
    public List<Map> queryAll() {
        String sql="select * from t_user";
        return  this.executeQuery(sql,null);
    }

}
