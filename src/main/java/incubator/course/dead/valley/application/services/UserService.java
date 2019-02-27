package incubator.course.dead.valley.application.services;

import incubator.course.dead.valley.application.model.entity.User;
import incubator.course.dead.valley.application.model.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserDAO dao;

    @Autowired
    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public List<User> getAllUser(){
        return dao.getAllUsers();
    }

}
