package incubator.course.dead.valley.application.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:database.properties")
public class AppConfig {
    private Environment env;

    @Autowired
    public AppConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(env.getProperty("spring.url"));
        driverManagerDataSource.setUsername(env.getProperty("spring.user"));
        driverManagerDataSource.setPassword(env.getProperty("spring.password"));
        driverManagerDataSource.setDriverClassName(env.getProperty("spring.driver"));
        return driverManagerDataSource;
    }
}
