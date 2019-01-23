package incubator.course.dead.valley.application.spring.dao;


import incubator.course.dead.valley.application.model.User;
import incubator.course.dead.valley.application.spring.config.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;
import java.util.List;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(classes = AppConfig.class)
public class UserDAOImplTest {

    @Autowired
    private AppConfig config;

    @Test
    public void getAllUsers() {
        List<User> allUsers = new UserDAOImpl(config).getAllUsers();
        Assert.assertNotNull(allUsers);
    }
}
