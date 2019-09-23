package Dao;

import entity.Role;

import java.util.List;
import java.util.Map;

public interface RoleDao {
    List<Map> queryAll();
    Map queryById(int id);
    int Add(Role info);
    int update(Role info);
    int delete(Role info);
}
