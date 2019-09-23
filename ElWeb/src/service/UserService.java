package service;

import entity.Message;
import entity.Page;
import entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    int reg(User info);

    Map login(User info);

    List<Map> queryALL();
    int delete(int id);
    int Delete(int id);
    int Update(User info);
    Map queryById(String id);

   Page queryByPages(int PageNo);
   Boolean checkUserExists(String userName);
   Page ByPage(int PageNo);
   Message update(User info);

}
