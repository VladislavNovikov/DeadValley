package incubator.course.dead.valley.application;

import incubator.course.dead.valley.application.model.User;
import incubator.course.dead.valley.application.spring.config.AppConfig;
import incubator.course.dead.valley.application.spring.dao.UserDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//public class Main {
//    public static void main(String[] args) {
//
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        UserDAO personDAO = context.getBean(UserDAO.class);
//
//        System.out.println("List of person is:");
//
//        for (User user : personDAO.getAllUsers()) {
//            System.out.println(user);
//        }
//
//        context.close();
//
//    }
//}
