package incubator.course.dead.valley.application.spring.dao;


import incubator.course.dead.valley.application.model.User;
import incubator.course.dead.valley.application.spring.config.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;
import java.util.List;

@RunWith(SpringRunner.class)
public class UserDAOImplTest {

    @Autowired
    private AppConfig config;

    @Before
    public void init(){

    }

    @Test
    public void getAllUsers() {
        List<User> allUsers = new UserDAOImpl(config).getAllUsers();
        Assert.assertNotNull(allUsers);
    }
}
