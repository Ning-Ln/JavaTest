package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import vo.Student;

@Configuration
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "vo")
public class SpringConfig {

    /*@Bean(name = "学生德善")
    public Student creatStudent(){
        Student student=new Student();
        student.setName("德善");
        student.setSex("女");
        student.setAge(21);
        return student;
    }*/
}
