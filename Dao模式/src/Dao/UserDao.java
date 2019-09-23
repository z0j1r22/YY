package Dao;

import entity.Role;
import entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<Map> queryAll();
    Map queryById(int id);
    int Add(User info);
    int Update(User info);
    int delete(User info);
}
