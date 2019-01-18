import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;
import spring.dao.UserDAO;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserDAO personDAO = context.getBean(UserDAO.class);

        System.out.println("List of person is:");

        for (User user : personDAO.getAllUsers()) {
            System.out.println(user);
        }

        context.close();

    }
}
