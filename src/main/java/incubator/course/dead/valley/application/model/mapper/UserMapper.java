package incubator.course.dead.valley.application.model.mapper;

import incubator.course.dead.valley.application.model.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int i) throws SQLException {

        User user = new User();
        user.setUresId(resultSet.getInt("userId"));
        user.setName(resultSet.getString("name"));
        user.setSureName(resultSet.getString("sureName"));
        user.setAccount(resultSet.getInt("account"));
        return user;
    }

}
