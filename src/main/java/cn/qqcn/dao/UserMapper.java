package cn.qqcn.dao;

import cn.qqcn.common.general.GeneralDAO;
import cn.qqcn.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends GeneralDAO<User> {

    User getUser(User user);
}