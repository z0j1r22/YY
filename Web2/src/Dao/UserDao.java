package Dao;

import entity.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UserDao {
    int add(User info) ;
    Map checkLogin(User info);
    List<Map> queryAll();
    int delete(int id);
    int Update(User info);

}
