package Dao;

import entity.Page;
import entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    int add(User info) ;
    Map checkLogin(User info);
    List<Map> queryAll();
    int delete(int id);
    int Delete(int id);
    int Update(User info);
    Boolean selname(String username);
    Map queryById(int id);
    Page QueryByPages(int PageNo, int PageSize);
    boolean checkUserExists(String userName);
    Page queryByPagetest(int PageNo,int PageSize);
    Page queryByPage(int PageNo,int PageSize);
}
