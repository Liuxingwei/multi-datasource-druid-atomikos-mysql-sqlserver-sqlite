package cn.liuxingwei.multidatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.annotation.EnableJms;

/**
 * @author liuxingwei
 */
@SpringBootApplication
@PropertySource(value = {"file:${root}/conf/${env}/application.properties", "file:${root}/conf/${env}/business.properties"})
@EnableConfigurationProperties
@EnableJms
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
