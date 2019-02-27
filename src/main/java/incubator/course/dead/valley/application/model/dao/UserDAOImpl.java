package incubator.course.dead.valley.application.model.dao;

import incubator.course.dead.valley.application.model.entity.User;
import incubator.course.dead.valley.application.model.mapper.UserMapper;
import incubator.course.dead.valley.application.spring.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAOImpl implements UserDAO{
    JdbcTemplate jdbcTemplate;

  //  private final String SQL_FIND_PERSON = "select * from people where id = ?";
   // private final String SQL_DELETE_PERSON = "delete from people where id = ?";
  //  private final String SQL_UPDATE_PERSON = "update people set first_name = ?, last_name = ?, age  = ? where id = ?";
    private final String SQL_GET_ALL= "select  user.name, sureName, user.userId, account.account " +
          "from user join account on account.userId = user.userId";
   // private final String SQL_INSERT_PERSON = "insert into people(id, first_name, last_name, age) values(?,?,?,?)";

    @Autowired
    public UserDAOImpl(AppConfig config) {
        jdbcTemplate = new JdbcTemplate(config.dataSource());
    }

    public List<User> getAllUsers() {
        return jdbcTemplate.query(SQL_GET_ALL, new UserMapper());
    }





}
